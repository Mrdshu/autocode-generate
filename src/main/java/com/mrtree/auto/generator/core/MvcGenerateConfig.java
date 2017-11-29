package com.mrtree.auto.generator.core;

import java.io.FileInputStream;
import java.util.Properties;

import lombok.Data;

/**
 * <p>
 *   mvc模式的配置类
 * </p>
 * @author shuzheng_wang  2017-11-29 17:46
 */
@Data
public class MvcGenerateConfig {
	/**配置文件路径，默认是resource中的generate.properties*/
	public String configPath = "src/main/resources/config/generate.properties";
	
	public MvcGenerateConfig() {
		loadConfig(configPath);
	}
	
	public MvcGenerateConfig(String configPath) {
		this.configPath = configPath;
		loadConfig(configPath);
	}
	

	/**模板文件路径*/
	public String templeteBase;
	/**model模板文件名*/
	public String modelVM;
	/**mapper模板文件名*/
	public String mapperVM;
	/**dao模板文件名*/
	public String daoVM;
	/**service模板文件名*/
	public String serviceVM;
	/**controller模板文件名*/
	public String controllerVM;

	/**生成文件的目标路径*/
	public String targetDir;
	/**生成mapper文件的目标路径*/
	public String targetResourceDir;
	/**model的包名*/
	public String modelPackage;
	/**mapper的包名*/
	public String mapperPackage;
	/**dao的包名*/
	public String daoPackage;
	/**service的包名*/
	public String servicePackage;
	/**controller的包名*/
	public String controllerPackage;

	public String primaryKey;
	/**匹配的表名，%为全匹配*/
	public String tableNamePattern;
	
	
	
	public void loadConfig(String filePath) {
		Properties properties = new Properties(); 
		try {
			FileInputStream fileInputStream = new FileInputStream(filePath); 
			properties.load(fileInputStream);
			/*
			 * 加载模板路径
			 */
			this.setTempleteBase(properties.getProperty("templeteBase"));
			this.setModelVM(properties.getProperty("modelVM"));
			this.setMapperVM(properties.getProperty("mapperVM"));
			this.setDaoVM(properties.getProperty("daoVM"));
			this.setServiceVM(properties.getProperty("serviceVM"));
			this.setControllerVM(properties.getProperty("controllerVM"));
			/*
			 * 加载生成文件路径
			 */
			this.setTargetDir(properties.getProperty("targetDir")); ;
			this.setTargetResourceDir(properties.getProperty("targetResourceDir"));
			this.setModelPackage(properties.getProperty("modelPackage"));
			this.setMapperPackage(properties.getProperty("mapperPackage"));
			this.setDaoPackage(properties.getProperty("daoPackage"));
			this.setServicePackage(properties.getProperty("servicePackage"));
			this.setControllerPackage(properties.getProperty("controllerPackage"));
			/*
			 * 加载其余变量
			 */
			this.setPrimaryKey(properties.getProperty("primaryKey")); ;
			this.setTableNamePattern(properties.getProperty("tableNamePattern"));
		} catch (Throwable e) {   
			e.printStackTrace(); 
		} 
	}

}
