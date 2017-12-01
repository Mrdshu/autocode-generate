package com.mrtree.auto.generator.core.generate;

import java.io.Writer;
import java.util.List;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import com.mrtree.auto.generator.core.TableDataProcessor;
import com.mrtree.auto.generator.core.VelocityContextHolder;
import com.mrtree.auto.generator.core.config.TableGenerateConfig;
import com.mrtree.auto.generator.model.Table;
import com.mrtree.auto.generator.utils.FileUtil;
import com.mrtree.auto.generator.utils.StringUtils;

/**
 * 从表中获取信息生成模板代码
 *
 * @author wsz 2017-12-01
 */
public class TableGenerator {

	protected TableGenerateConfig config;
	
	
	public TableGenerator() {
		config = new TableGenerateConfig();
	}

	public TableGenerator(String configPath) {
		TableGenerateConfig mvcGenerateConfig = new TableGenerateConfig(configPath);
		this.config = mvcGenerateConfig;
	}
	
	/**
	 * 根据表信息生成MVC模板
	 * @param table
	 * @autohr shuzheng_wang  2017-11-29 17:20
	 */
	public void generateMVCForTable(Table table) {
		generateModel(table);
		generateMapper(table);
		generateDao(table);
		generateService(table);
		generateController(table);
	}

	public void generateModel(Table table) {
		if(!beforeGenerate(config.getModelPackage()))
			return ;
		
		VelocityEngine velocityEngine = VelocityContextHolder.getVelocityEngine();
		VelocityContext context = VelocityContextHolder.createContext(table);
		String path = config.getModelPackage().replace(".", "/") + "/" + table.getBeanName() + ".java";
		Writer writer = FileUtil.createWriter(getRealPath(path));
		
		velocityEngine.mergeTemplate(config.templeteBase + config.getModelVM(), "UTF-8", context, writer);
		FileUtil.flushWriter(writer);;
	}

	

	public void generateMapper(Table table) {
		if(!beforeGenerate(config.getMapperPackage()))
			return ;
		
		VelocityEngine velocityEngine = VelocityContextHolder.getVelocityEngine();
		VelocityContext context = VelocityContextHolder.createContext(table);
		String path = config.getMapperPackage().replace(".", "/") + "/" + table.getBeanName() + "Mapper.xml";
		Writer writer = FileUtil.createWriter(getRealPath(path));

		velocityEngine.mergeTemplate(config.templeteBase + config.getMapperVM(), "UTF-8", context, writer);
		FileUtil.flushWriter(writer);

	}

	public void generateDao(Table table) {
		if(!beforeGenerate(config.getDaoPackage()))
			return ;
		
		VelocityEngine velocityEngine = VelocityContextHolder.getVelocityEngine();
		VelocityContext context = VelocityContextHolder.createContext(table);
		String path = config.getDaoPackage().replace(".", "/") + "/" + table.getBeanName() + "Dao.java";
		Writer writer = FileUtil.createWriter(getRealPath(path));
		
		velocityEngine.mergeTemplate(config.templeteBase + config.getDaoVM(), "UTF-8",context, writer);
		FileUtil.flushWriter(writer);
	}
	
	public void generateService(Table table) {
		if(!beforeGenerate(config.getServicePackage()))
			return ;
		
		VelocityEngine velocityEngine = VelocityContextHolder.getVelocityEngine();
		VelocityContext context = VelocityContextHolder.createContext(table);
		String path = config.getServicePackage().replace(".", "/") + "/" + table.getBeanName() + "Service.java";
		Writer writer = FileUtil.createWriter(getRealPath(path));
		
		velocityEngine.mergeTemplate(config.templeteBase + config.getServiceVM(),"UTF-8", context, writer);
		FileUtil.flushWriter(writer);
	}
	
	public void generateController(Table table) {
		if(!beforeGenerate(config.getControllerPackage()))
			return ;
		
		VelocityEngine velocityEngine = VelocityContextHolder.getVelocityEngine();
		VelocityContext context = VelocityContextHolder.createContext(table);
		String path = config.getControllerPackage().replace(".", "/") + "/" + table.getBeanName() + "Controller.java";
		Writer writer = FileUtil.createWriter(getRealPath(path));
		
		velocityEngine.mergeTemplate(config.templeteBase + config.getControllerVM(), "UTF-8",context, writer);
		FileUtil.flushWriter(writer);
	}
	
	/**
	 * 依照默认配置路径，获取sql表信息，并生成对应模板
	 *
	 * @author wsz 2017-11-30
	 */
	public void generate() {
		//根据配置生成TableGenerator
		TableGenerator generator = new TableGenerator();
		String tableNamePattern = config.getTableNamePattern();
		//获取表信息
		TableDataProcessor t = new TableDataProcessor();
		List<Table> tableInfos = t.getTableInfos(tableNamePattern);
		//根据表信息，生成对应模板
		try {
			for (Table table : tableInfos) {
				generator.generateMVCForTable(table);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 依照指定配置路径，获取sql表信息，并生成对应模板
	 *
	 * @author wsz 2017-11-30
	 */
	public void generate(String configPath) {
		//根据配置生成TableGenerator
		TableGenerator generator = new TableGenerator(configPath);
		String tableNamePattern = config.getTableNamePattern();
		//获取表信息
		TableDataProcessor t = new TableDataProcessor();
		List<Table> tableInfos = t.getTableInfos(tableNamePattern);
		//根据表信息，生成对应模板
		try {
			for (Table table : tableInfos) {
				generator.generateMVCForTable(table);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private String getRealPath(String path) {
		if(path.contains("mapper"))
			path = config.getTargetResourceDir() + path;
		else
			path = config.getTargetDir() + path;
		
		return path;
	}
	
	private Boolean beforeGenerate(String packagee) {
		Boolean rs = true;
		
		if(StringUtils.isEmpty(config.getTargetDir()) || StringUtils.isEmpty(packagee))
			rs = false;
		return rs;
	}
	
	

}
