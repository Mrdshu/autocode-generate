package com.mrtree.auto.generator.core.generate;

import java.util.List;

import com.mrtree.auto.generator.core.TableDataProcessor;
import com.mrtree.auto.generator.core.config.GenerateConfig;
import com.mrtree.auto.generator.core.config.MvcGenerateConfig;
import com.mrtree.auto.generator.model.Table;

public class CommonGenerator {

	protected GenerateConfig config;
	
	
	public CommonGenerator() {
		config = new MvcGenerateConfig();
	}

	public CommonGenerator(MvcGenerateConfig config) {
		this.config = config;
	}
	/**
	 * 根据表信息生成模板
	 * @param table
	 * @autohr shuzheng_wang  2017-11-29 17:20
	 */
	public void generateForTable(Table table) {
		
	}
	
	public void generateMapper(Table table) {
//		VelocityEngine velocityEngine = VelocityContextHolder.getVelocityEngine();
//
//		VelocityContext context = VelocityContextHolder.createContext(table);
//
//		String path = config.getMapperPackage().replace(".", "/") + "/" + table.getBeanName() + "Mapper.xml";
//		Writer writer = FileUtil.createWriter(getRealPath(path));
//
//		velocityEngine.mergeTemplate(config.templeteBase + config.getMapperVM(), "UTF-8", context, writer);
//		flushWriter(writer);

	}

	protected String getRealPath(String path) {
		return path;
	}

	public static void main(String[] args) {
		MvcGenerateConfig config = new MvcGenerateConfig();
		CommonGenerator generator = new CommonGenerator(config);
		
		String tableNamePattern = config.getTableNamePattern();

		TableDataProcessor t = new TableDataProcessor();
		List<Table> tableInfos = t.getTableInfos(tableNamePattern);

		try {
			for (Table table : tableInfos) {
				generator.generateForTable(table);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
