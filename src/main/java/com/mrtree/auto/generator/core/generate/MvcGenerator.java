package com.mrtree.auto.generator.core.generate;

import java.io.Writer;
import java.util.List;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import com.mrtree.auto.generator.core.TableDataProcessor;
import com.mrtree.auto.generator.core.VelocityContextHolder;
import com.mrtree.auto.generator.core.config.MvcGenerateConfig;
import com.mrtree.auto.generator.model.Table;
import com.mrtree.auto.generator.utils.FileUtil;

public class MvcGenerator {

	protected MvcGenerateConfig config;
	
	
	public MvcGenerator() {
		config = new MvcGenerateConfig();
	}

	public MvcGenerator(MvcGenerateConfig config) {
		this.config = config;
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
		VelocityEngine velocityEngine = VelocityContextHolder.getVelocityEngine();
		VelocityContext context = VelocityContextHolder.createContext(table);
		String path = config.getModelPackage().replace(".", "/") + "/" + table.getBeanName() + ".java";
		Writer writer = FileUtil.createWriter(getRealPath(path));
		velocityEngine.mergeTemplate(config.templeteBase + config.getModelVM(), "UTF-8", context, writer);
		FileUtil.flushWriter(writer);;
	}

	

	public void generateMapper(Table table) {
		VelocityEngine velocityEngine = VelocityContextHolder.getVelocityEngine();

		VelocityContext context = VelocityContextHolder.createContext(table);

		String path = config.getMapperPackage().replace(".", "/") + "/" + table.getBeanName() + "Mapper.xml";
		Writer writer = FileUtil.createWriter(getRealPath(path));

		velocityEngine.mergeTemplate(config.templeteBase + config.getMapperVM(), "UTF-8", context, writer);
		FileUtil.flushWriter(writer);

	}

	public void generateDao(Table table) {
		VelocityEngine velocityEngine = VelocityContextHolder.getVelocityEngine();
		VelocityContext context = VelocityContextHolder.createContext(table);
		
		String path = config.getDaoPackage().replace(".", "/") + "/" + table.getBeanName() + "Dao.java";
		Writer writer = FileUtil.createWriter(getRealPath(path));
		velocityEngine.mergeTemplate(config.templeteBase + config.getDaoVM(), "UTF-8",context, writer);
		FileUtil.flushWriter(writer);
	}
	
	public void generateService(Table table) {
		VelocityEngine velocityEngine = VelocityContextHolder.getVelocityEngine();
		VelocityContext context = VelocityContextHolder.createContext(table);
		String path = config.getServicePackage().replace(".", "/") + "/" + table.getBeanName() + "Service.java";
		Writer writer = FileUtil.createWriter(getRealPath(path));
		velocityEngine.mergeTemplate(config.templeteBase + config.getServiceVM(),"UTF-8", context, writer);
		FileUtil.flushWriter(writer);
	}
	
	public void generateController(Table table) {
		VelocityEngine velocityEngine = VelocityContextHolder.getVelocityEngine();
		VelocityContext context = VelocityContextHolder.createContext(table);
		
		String path = config.getControllerPackage().replace(".", "/") + "/" + table.getBeanName() + "Controller.java";
		Writer writer = FileUtil.createWriter(getRealPath(path));
		velocityEngine.mergeTemplate(config.templeteBase + config.getControllerVM(), "UTF-8",context, writer);
		FileUtil.flushWriter(writer);
	}

	private String getRealPath(String path) {
		if(path.contains("mapper"))
			path = config.getTargetResourceDir() + path;
		else
			path = config.getTargetDir() + path;
		
		return path;
	}
	
	/**
	 * 依照配置，获取sql表信息，并生成对应模板
	 *
	 * @author wsz 2017-11-30
	 */
	public void generate() {
		//根据配置生成TableGenerator
		MvcGenerateConfig config = new MvcGenerateConfig();
		MvcGenerator generator = new MvcGenerator(config);
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

}
