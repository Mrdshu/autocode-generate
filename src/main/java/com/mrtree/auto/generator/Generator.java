package com.mrtree.auto.generator;

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

import com.mrtree.auto.generator.core.Configure;
import com.mrtree.auto.generator.core.DataProcessor;
import com.mrtree.auto.generator.model.Table;
import com.mrtree.auto.generator.utils.BeanUtils;

@SuppressWarnings({"rawtypes", "unchecked" })
public class Generator {

	protected Configure config;
	private static final String MODELVM = "supercarBeanTemplate.vm";
	private static final String MAPPERVM = "supercarMapperTemplate.vm";
	private static final String DAOVM = "supercarDaoTemplate.vm";
	private static final String SERVICEVM = "supercarServiceTemplate.vm";
	private static final String CONTROLLERVM = "supercarControllerTemplate.vm";
	
	public Generator() {
		config = new Configure();
	}

	public Generator(Configure config) {
		this.config = config;
	}

	public void generate(Table table) {
		generateModel(table);
//		generateExample(table);
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
		// StringWriter writer=new StringWriter();
		return writer;
	}

	private VelocityEngine createVelocityEngine() {
		Properties props = new Properties();
		props.setProperty("resource.loader", "class");
		props.setProperty("class.resource.loader.class",
				"org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
		// properties.setProperty("input.encoding", "UTF-8");
		// properties.setProperty("output.encoding", "UTF-8");
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
		velocityEngine.mergeTemplate(config.templeteBase + MODELVM, "UTF-8", context, writer);
		flushWriter(writer);
	}

	private void flushWriter(Writer writer) {
		try {
			writer.flush();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

//	public void generateExample(Table table) {
//		VelocityEngine velocityEngine = createVelocityEngine();
//		VelocityContext context = createContext(table);
//		Writer writer = createWriter(config.getExamplePackage().replace(".",
//				"/")
//				+ "/" + table.getBeanName() + "Example.java");
//		velocityEngine.mergeTemplate(
//				config.templeteBase + "exampleTemplate.vm", context, writer);
//		flushWriter(writer);
//	}

	public void generateMapper(Table table) {
		VelocityEngine velocityEngine = createVelocityEngine();

		VelocityContext context = createContext(table);

		Writer writer = createWriter(config.getMapperPackage()
				.replace(".", "/") + "/" + table.getBeanName() + "Mapper.xml");
		//velocityEngine.mergeTemplate(config.templeteBase + MAPPERVM, context, writer);
		velocityEngine.mergeTemplate(config.templeteBase + MAPPERVM, "UTF-8", context, writer);
		flushWriter(writer);

	}

	public void generateDao(Table table) {
		VelocityEngine velocityEngine = createVelocityEngine();
		VelocityContext context = createContext(table);
		Writer writer = createWriter(config.getDaoPackage()
				.replace(".", "/") + "/" + table.getBeanName() + "Dao.java");
		velocityEngine.mergeTemplate(config.templeteBase + DAOVM, "UTF-8",context, writer);
		flushWriter(writer);
	}
	
	public void generateService(Table table) {
		VelocityEngine velocityEngine = createVelocityEngine();
		VelocityContext context = createContext(table);
		Writer writer = createWriter(config.getServicePackage()
				.replace(".", "/") + "/" + table.getBeanName() + "Service.java");
		velocityEngine.mergeTemplate(config.templeteBase + SERVICEVM,"UTF-8", context, writer);
		flushWriter(writer);
	}
	
	public void generateController(Table table) {
		VelocityEngine velocityEngine = createVelocityEngine();
		VelocityContext context = createContext(table);
		Writer writer = createWriter(config.getControllerPackage()
				.replace(".", "/") + "/" + table.getBeanName() + "Controller.java");
		velocityEngine.mergeTemplate(config.templeteBase + CONTROLLERVM, "UTF-8",context, writer);
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
		Configure config = new Configure();
//		config.setTargetDir("d:/test/");
//		config.setTargetResourceDir("d:/test/resources/");
		
		config.setTargetDir("E:/workspace/GIT/supercar/src/main/java/");
		config.setTargetResourceDir("E:/workspace/GIT/supercar/src/main/resources/");
		config.setModelPackage("com.xw.supercar.entity");
//		config.setExamplePackage("com.wsz.example");
		config.setMapperPackage("mapper");
		config.setDaoPackage("com.xw.supercar.dao");
		config.setServicePackage("com.xw.supercar.service");
		config.setControllerPackage("com.xw.supercar.controller");
		config.setPrimaryKey("id");
		Generator generator = new Generator(config);

		String tableNamePattern = "tb_repair_%";
		DataProcessor t = new DataProcessor();

		List<Table> tableInfos = t.getTableInfos(tableNamePattern);

		try {
			for (Table table : tableInfos) {
				generator.generate(table);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
