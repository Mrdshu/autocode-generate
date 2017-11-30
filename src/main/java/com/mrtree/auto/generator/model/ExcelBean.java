package com.mrtree.auto.generator.model;

import java.util.List;

import lombok.Data;

/**
 * <p>
 *   从excel表导入转换的类信息
 * </p>
 * @author shuzheng_wang  2017-11-30 10:17
 */
@Data
public class ExcelBean {
	/**生成的类名*/
	private String beanName;
	/**类备注*/
	private String beanRemark;
	/**类成员变量集合*/
	private List<ExcelBeanField> fields;
	
	public String getBeanName(){
		return beanName.substring(0,1).toUpperCase()+beanName.substring(1,beanName.length());
	}
}
