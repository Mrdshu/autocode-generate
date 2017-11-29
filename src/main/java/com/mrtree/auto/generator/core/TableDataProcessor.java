package com.mrtree.auto.generator.core;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.mrtree.auto.generator.custom.CustomColumn;
import com.mrtree.auto.generator.custom.CustomTable;
import com.mrtree.auto.generator.custom.CustomTables;
import com.mrtree.auto.generator.db.ConnectionFactory;
import com.mrtree.auto.generator.model.Column;
import com.mrtree.auto.generator.model.Table;
import com.mrtree.auto.generator.utils.StringUtils;
import com.mrtree.auto.generator.utils.TypeUtils;
import com.mrtree.auto.generator.utils.XmlTransferUtil;

/**
 * <p>
 *   从数据库读取表数据，处理后转换为对应的实体类
 * </p>
 * @author shuzheng_wang  2017-11-29 17:17
 */
public class TableDataProcessor {
	
	private static Map<String, CustomTable> tablesMap = new HashMap<>();
	private static Boolean needPrefix = false;
	private static HashSet<String> excludeColumnMap = new HashSet<>();
	private static HashSet<String> specialColumnsSet = new HashSet<>();
	
	//类初始化时读取自定义配置文件
	static{
		CustomTables customTables = XmlTransferUtil.transferXmlFile2Object("src/main/resources/config/customColumnsSchema.xml", CustomTables.class);
		
		needPrefix = customTables.getNeedPrefix();
		
		List<CustomTable> tables = customTables.getTables();
		if(tables != null && tables.size() > 0)
		for (CustomTable customTable : tables) {
			tablesMap.put(customTable.getTableName().toLowerCase(), customTable);
		}
		
		String[] excludeColumns = customTables.getExcludeColumns().split(",");
		//将删除的列名转换为map
		for (int i = 0, n = excludeColumns.length; i < n; i++) {
			excludeColumnMap.add(excludeColumns[i]);
		}
		
		String[] specialColumns = customTables.getSpecialColumns().split(",");
		//将删除的列名转换为map
		for (int i = 0, n = specialColumns.length; i < n; i++) {
			specialColumnsSet.add(specialColumns[i]);
		}
	}
	/**
	 * 表信息处理，将表信息转换为实体类
	 * @param tableInfos
	 */
	public void prepareProcessTableInfos(List<Table> tableInfos) {
		for (Table table : tableInfos) {
			String tableName = table.getTableName();
			String beanName = getBeanName(tableName);
			table.setBeanName(beanName);
			prepareProcessColumns(tableName, table.getColumns());
		}
	}

	/**
	 * 将'Map表信息' 转换为 'Table实体类表信息'
	 * @param tables
	 * @autohr shuzheng_wang  2017-11-29 14:15
	 */
	public List<Table> convertToTableInfos(Map<String, Map<String, Map<String, Object>>> tables) {
		List<Table> tableInfos = new ArrayList<Table>();
		Table table = null;
		Column column = null;
		List<Column> columns = null;

		ConnectionFactory connectionFactory = ConnectionFactory.getIntance();
		Connection connection = connectionFactory.getConnection();

		for (Entry<String, Map<String, Map<String, Object>>> e : tables.entrySet()) {
			table = new Table();
			columns = new ArrayList<Column>();
			table.setColumns(columns);

			tableInfos.add(table);
			String tableName = e.getKey();
			table.setTableName(tableName);

			prepareProcessTable(table, connection, tableName);

			Map<String, Map<String, Object>> rows = e.getValue();
			for (Entry<String, Map<String, Object>> row : rows.entrySet()) {
				column = new Column();
				column.setColumn(row.getKey());
				Map<String, Object> rowInfo = row.getValue();
				String jdbcType=(String) rowInfo.get("jdbcType");
				column.setJdbcType(jdbcType);
				column.setRemark((String) rowInfo.get("remark"));
				column.setDataType((int) rowInfo.get("dataType"));
				
				String javaType=TypeUtils.getJavaType(column.getDataType());
				column.setType(javaType);
				if("isdeleted".equals(column.getColumn().toLowerCase()))
					table.setHasIsDeleted(true);
				if("Date".equals(javaType)){
					table.setHasDate(true);
				}else if("BigDecimal".equals(javaType)){
					table.setHasBigdecimal(true);
				}
				columns.add(column);
			}
		}
		connectionFactory.close(connection);
		return tableInfos;
	}

	/**
	 * 获取表的其余信息（remark）
	 * @param table
	 * @param connection
	 * @param tableName
	 * @autohr shuzheng_wang  2017-11-29 14:39
	 */
	private void prepareProcessTable(Table table, Connection connection, String tableName) {
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt
					.executeQuery("select * from information_schema.TABLES where TABLE_NAME='" + tableName + "'");

			while (rs.next()) {
				String remark = rs.getString("TABLE_COMMENT");
				table.setRemark(remark);
				System.out.println(remark);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * 根据表名匹配串，获取表的列信息转换为map
	 * @param tableNamePattern 表名匹配串
	 * @return  表信息-map格式
	 * @autohr shuzheng_wang  2017-11-29 11:31
	 */
	public Map<String, Map<String, Map<String, Object>>> getTableInfoMap(String tableNamePattern) {
		Map<String, Map<String, Map<String, Object>>> tables = new LinkedHashMap<>();

		ConnectionFactory connectionFactory = ConnectionFactory.getIntance();

		/*
		 * 从数据库中查询出对应表的列信息，转换为map
		 */
		Connection connection = connectionFactory.getConnection();
		try {
			DatabaseMetaData meta = connection.getMetaData();
			ResultSet rs = meta.getColumns(null, null, tableNamePattern, null);

			while (rs.next()) {
				String tableName = rs.getString("TABLE_NAME");
				String colName = rs.getString("COLUMN_NAME");
				String jdbcType = rs.getString("TYPE_NAME");
				Integer dataType = rs.getInt("DATA_TYPE");
				String remarks = rs.getString("REMARKS");
				
				Map<String, Map<String, Object>> table = tables.get(tableName);
				if (table == null) {
					table = new LinkedHashMap<>();
					tables.put(tableName, table);
				}
				Map<String, Object> row = new LinkedHashMap<>();
				row.put("jdbcType", jdbcType);
				row.put("remark", remarks);
				row.put("dataType", dataType);

				table.put(colName, row);

			}

			for (Entry<String, Map<String, Map<String, Object>>> e : tables.entrySet()) {
				System.out.println("列信息："+e);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			connectionFactory.close(connection);
		}
		return tables;
	}

	/**
	 * 获取表信息
	 * @param tableNamePattern 表名匹配串
	 * @return
	 * @autohr shuzheng_wang  2017-11-29 11:30
	 */
	public List<Table> getTableInfos(String tableNamePattern) {
		Map<String, Map<String, Map<String, Object>>> tables = getTableInfoMap(tableNamePattern);

		List<Table> tableInfos = convertToTableInfos(tables);

		prepareProcessTableInfos(tableInfos);
		return tableInfos;
	}
	
	/**
	 * 将表名转换为实体名称
	 * @param tableName
	 * @return
	 * @author  wangsz 2017-07-04
	 */
	public String getBeanName(String tableName) {
		//去除表名前缀
		String beanName = tableName.replace(Table.PREFIX, "");
		beanName = StringUtils.underLineToCamel(StringUtils.toUpperCaseFirst(beanName));
		
		//如果在配置中读到指定的beanName，则采取配置
		CustomTable table = tablesMap.get(tableName);
		if(table != null && table.getTableName().equals(tableName)){
			String domainObjName = table.getDomainObjectName();
			if(domainObjName != null && !domainObjName.equals(""))
				beanName = domainObjName;
		}
		
		return beanName;
	}
	
	/**
	 * 处理列名，默认采取配置文件中的内容；若配置文件没有配置则采用驼峰命名法
	 * @param columns
	 * @param needPrefix 是否需要前缀
	 * @author  wangsz 2017-07-04
	 */
	public void prepareProcessColumns(String tableName, List<Column> columns) {
		CustomTable table = tablesMap.get(tableName.toLowerCase());
		Boolean defaultColumn = true;
		/*
		 * 自定义配置中存在该表字段配置
		 */
		if (table != null) {
			List<CustomColumn> columnsFromConfig = table.getColumnOverride();
			// 如果该表列名配置存在，读取配置中的列
			if (columnsFromConfig != null && columnsFromConfig.size() > 0) {
				defaultColumn = false;
				//读取配置中的列名
				Map<String, String> columnsMap = new HashMap<>();
				for (CustomColumn customColumn : columnsFromConfig) {
					columnsMap.put(customColumn.getColumn(), customColumn.getProperty());
				}
				//迭代设置bean对应的列名
				Iterator<Column> iterable = columns.iterator();
				while (iterable.hasNext()) {
					Column column = iterable.next();
					String columnValue = columnsMap.get(column.getColumn().toUpperCase());
					// 列与配置保存一致，如果配置中没有的列需要删除
					if (columnValue == null || "".equals(columnValue)) {
						iterable.remove();
						continue;
					}
					column.setLowerProperty(columnValue);
				}
			}
		}
		/*
		 * 自定义配置中不存在该表字段配置
		 * 默认设置列名为数据库字段的驼峰命名版
		 */
		if(defaultColumn)
			prepareProcessColumns(columns,needPrefix);
	}
	
	/**
	 * 处理列名，去除列前缀后再转换为驼峰命名法
	 * @param columns 列集合
	 * @param needPrefix 是否需要前缀，为true时去除列名第一个'_'前的内容
	 * @author  wangsz 2017-07-04
	 */
	public void prepareProcessColumns(List<Column> columns, boolean needPrefix) {
		Iterator<Column> iterator = columns.iterator();
		while (iterator.hasNext()) {
			Column column =  iterator.next();
			String columnName = column.getColumn();
			String lowerColumnName = columnName.toLowerCase();
			//如果列名在过滤列中，从集合中删除
			if(excludeColumnMap.contains(lowerColumnName)){
				iterator.remove();
				continue;
			}
			
			if(!needPrefix && !specialColumnsSet.contains(lowerColumnName)){
				int prefixIndex = columnName.indexOf("_");
				if(prefixIndex < columnName.length()-1)
					columnName = columnName.substring(prefixIndex+1, columnName.length());
				else
					columnName = "";
			}
			
			String lowerProperty = StringUtils.underLineToCamel(columnName);
			column.setLowerProperty(lowerProperty);
			column.setProperty(StringUtils.toUpperCaseFirst(lowerProperty));
		}
	}

	public static void main(String[] args) {
		String tableNamePattern = "%";
		TableDataProcessor t = new TableDataProcessor();

		List<Table> tableInfos = t.getTableInfos(tableNamePattern);

		System.out.println(tableInfos.get(1));
	}
}
