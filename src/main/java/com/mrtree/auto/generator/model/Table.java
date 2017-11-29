package com.mrtree.auto.generator.model;

import java.util.List;

import lombok.Data;

/**
 * <p>
 *   数据库表信息
 * </p>
 * @author shuzheng_wang  2017-11-29 11:20
 */
@Data
public class Table {
	
	/**表名前缀，生成实体类名时会过滤掉*/
	public static final String PREFIX = "tb_";
	
	/**表名*/
	private String tableName;

	/**表名对应的实体名*/
	private String beanName;

	/**表的描述*/
	private String remark;

	/**表的列信息*/
	private List<Column> columns;
	
	/**是否有日期字段（需特殊处理）*/
	private boolean hasDate;
	
	/**是否有高精度字段（需特殊处理）*/
	private boolean hasBigdecimal;
	
	/**是否有软删除字段（需特殊处理）*/
	private boolean hasIsDeleted;

	
}
