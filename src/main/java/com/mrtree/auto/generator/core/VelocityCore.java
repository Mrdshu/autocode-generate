package com.mrtree.auto.generator.core;

import java.util.Properties;

import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;

public class VelocityCore {
	
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
