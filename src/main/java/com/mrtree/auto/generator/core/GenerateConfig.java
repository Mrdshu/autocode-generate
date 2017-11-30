package com.mrtree.auto.generator.core;

import lombok.Data;

@Data
public abstract class GenerateConfig {
	/**公共主键名*/
	public String primaryKey;
	/**匹配的表名，%为全匹配*/
	public String tableNamePattern;
	/**模板文件路径*/
	public String templeteBase;
	/**配置文件路径，默认是resource中的generate.properties*/
	public String configPath = "src/main/resources/config/generate.properties";
}
