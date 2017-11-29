package com.mrtree.auto.generator.model;

import lombok.Data;

/**
 * <p>
 *   数据库表的列信息
 * </p>
 * @author shuzheng_wang  2017-11-29 11:12
 */
@Data
public class Column {

	/**映射后的成员变量名*/
	private String lowerProperty;
	/**映射后首字母大写的成员变量名*/
	private String property;

	private String type;
	
	private int dataType;
	/**列名*/
	private String column;
	/**列的jdbc类型*/
	private String jdbcType;
	/**列注释*/
	private String remark;

	

	
	
}
