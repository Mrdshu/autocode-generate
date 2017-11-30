package com.mrtree.auto.generator.core.config;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 *   常规配置类，包含公共信息：模板文件路径、生成文件路径、配置文件路径等
 * </p>
 * @author shuzheng_wang  2017-11-30 14:03
 */
@Data @NoArgsConstructor
public abstract class GenerateConfig {
	/**模板文件路径*/
	public String templeteBase;
	/**配置文件路径，默认是resource中的generate.properties*/
	public String configPath = "src/main/resources/config/generate.properties";
	/**生成文件的目标路径*/
	public String targetDir;
	/**公共主键名*/
	public String primaryKey;
	/**匹配的表名，%为全匹配*/
	public String tableNamePattern;
	
	public GenerateConfig(String configPath) {
		this.configPath = configPath;
	}
	
	
}
