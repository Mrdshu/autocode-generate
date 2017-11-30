package com.mrtree.auto.generator.core;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Properties;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;

import com.mrtree.auto.generator.model.Table;
import com.mrtree.auto.generator.utils.BeanUtils;

public class VelocityContextHolder {
	
	public static class SingletonClass{
		public static final VelocityEngine velocityEngine = createVelocityEngine();
	}
	
	/**
	 * 获取单例的VelocityEngine
	 * @return
	 * @autohr shuzheng_wang  2017-11-29 18:29
	 */
	public static VelocityEngine getVelocityEngine() {
		return SingletonClass.velocityEngine;
	}
	
	
	/**
	 * 根据table获取VelocityContext
	 * @param table
	 * @return
	 *
	 * @author wsz 2017-11-30
	 */
	public  static VelocityContext createContext(Table table) {
		Map<String, Object> map = BeanUtils.getValueMap(table);
		addCommonProperty(map);
		
		VelocityContext context = new VelocityContext(map);
		return context;
	}
	
	/**
	 * 根据map获取VelocityContext
	 * @param table
	 * @return
	 *
	 * @author wsz 2017-11-30
	 */
	public static VelocityContext createContext(Map<String, Object> map) {
		addCommonProperty(map);
		VelocityContext context = new VelocityContext(map);
		return context;
	}
	
	
	private static void addCommonProperty(Map<String, Object> map) {
		map.put("author", "shuzheng_wang");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		map.put("dateTime", sdf.format(new Date()));
	}
	
	
	private static VelocityEngine createVelocityEngine() {
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
}
