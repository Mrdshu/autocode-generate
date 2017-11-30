package com.mrtree.auto.generator.model;

import lombok.Data;

/**
 * <p>
 *   从excel表导入的实体类成员变量信息
 * </p>
 * @author shuzheng_wang  2017-11-30 10:13
 */
@Data
public class ExcelBeanField {
	/**字段名*/
	private String name;
	/**字段类型*/
	private String type;
	/**字段描述*/
	private String remark;
	
	public enum fieldType {
		String,Integer,Decimal,Double
	}
	
}
