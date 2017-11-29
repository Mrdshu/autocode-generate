package com.mrtree.auto.generator.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;

import com.mrtree.auto.generator.core.MvcGenerateConfig;
import com.mrtree.auto.generator.core.TableDataProcessor;
import com.mrtree.auto.generator.model.Table;
import com.mrtree.auto.generator.utils.BeanUtils;

@SuppressWarnings({"rawtypes", "unchecked" })
public class Generator {

	protected MvcGenerateConfig config;
	
	
	public Generator() {
		config = new MvcGenerateConfig();
	}

	public Generator(MvcGenerateConfig config) {
		this.config = config;
	}
	/**
	 * 根据表信息生成模板
	 * @param table
	 * @autohr shuzheng_wang  2017-11-29 17:20
	 */
	public void generateForTable(Table table) {
		generateModel(table);
		generateMapper(table);
		generateDao(table);
		generateService(table);
		generateController(table);
	}

	public Writer createWriter(String path) {
		//如果路径中包含mapper,则为mapper文件
		if(path.contains("mapper"))
			path = config.getTargetResourceDir() + path;
		else
			path = config.getTargetDir() + path;
		File file = new File(path);
		String dir = file.getParent();
		File pd = new File(dir);
		if (!pd.exists()) {
			pd.mkdirs();
		}
		FileWriter writer = null;
		try {
			writer = new FileWriter(path);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return writer;
	}

	private VelocityEngine createVelocityEngine() {
		Properties props = new Properties();
		
		//定义为类路径加载
		props.setProperty(Velocity.RESOURCE_LOADER, "class");
		props.setProperty("class.resource.loader.class","org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
		//定义编解码，以及读取输出格式
		props.setProperty(Velocity.ENCODING_DEFAULT, "UTF-8");
		props.setProperty(Velocity.INPUT_ENCODING, "UTF-8");
		props.setProperty(Velocity.OUTPUT_ENCODING, "UTF-8");
		VelocityEngine velocityEngine = new VelocityEngine(props);
		return velocityEngine;
	}

	public void generateModel(Table table) {
		VelocityEngine velocityEngine = createVelocityEngine();
		VelocityContext context = createContext(table);
		Writer writer = createWriter(config.getModelPackage().replace(".", "/")
				+ "/" + table.getBeanName() + ".java");
		velocityEngine.mergeTemplate(config.templeteBase + config.getModelVM(), "UTF-8", context, writer);
		flushWriter(writer);
	}

	private void flushWriter(Writer writer) {
		try {
			writer.flush();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public void generateMapper(Table table) {
		VelocityEngine velocityEngine = createVelocityEngine();

		VelocityContext context = createContext(table);

		Writer writer = createWriter(config.getMapperPackage()
				.replace(".", "/") + "/" + table.getBeanName() + "Mapper.xml");

		velocityEngine.mergeTemplate(config.templeteBase + config.getMapperVM(), "UTF-8", context, writer);
		flushWriter(writer);

	}

	public void generateDao(Table table) {
		VelocityEngine velocityEngine = createVelocityEngine();
		VelocityContext context = createContext(table);
		Writer writer = createWriter(config.getDaoPackage()
				.replace(".", "/") + "/" + table.getBeanName() + "Dao.java");
		velocityEngine.mergeTemplate(config.templeteBase + config.getDaoVM(), "UTF-8",context, writer);
		flushWriter(writer);
	}
	
	public void generateService(Table table) {
		VelocityEngine velocityEngine = createVelocityEngine();
		VelocityContext context = createContext(table);
		Writer writer = createWriter(config.getServicePackage()
				.replace(".", "/") + "/" + table.getBeanName() + "Service.java");
		velocityEngine.mergeTemplate(config.templeteBase + config.getServiceVM(),"UTF-8", context, writer);
		flushWriter(writer);
	}
	
	public void generateController(Table table) {
		VelocityEngine velocityEngine = createVelocityEngine();
		VelocityContext context = createContext(table);
		Writer writer = createWriter(config.getControllerPackage()
				.replace(".", "/") + "/" + table.getBeanName() + "Controller.java");
		velocityEngine.mergeTemplate(config.templeteBase + config.getControllerVM(), "UTF-8",context, writer);
		flushWriter(writer);
	}

	private VelocityContext createContext(Table table) {
		Map map = BeanUtils.getValueMap(table);
		Map configMap = BeanUtils.getValueMap(config);
		configMap.put("author", System.getProperty("user.name"));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		configMap.put("dateTime", sdf.format(new Date()));
		map.putAll(configMap);
		VelocityContext context = new VelocityContext(map);

		return context;
	}

	public static void main(String[] args) {
		MvcGenerateConfig config = new MvcGenerateConfig();
		Generator generator = new Generator(config);
		
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
