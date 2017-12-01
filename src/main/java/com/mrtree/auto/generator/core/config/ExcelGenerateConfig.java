package com.mrtree.auto.generator.core.config;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class ExcelGenerateConfig extends GenerateConfig{
	/**excel文件路径*/
	public String excelPath;
}
