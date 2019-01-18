package com.mrtree.auto.generator.model;

import java.util.List;

import com.mrtree.auto.generator.utils.StringUtils;

import lombok.Data;

/**
 * <p>
 *   从excel表导入转换的类信息
 * </p>
 * @author shuzheng_wang  2017-11-30 10:17
 */
@Data
public class ExcelStruct {
	/**生成的类名*/
	private String typeName;
	/**类备注*/
	private String typeRemark;
	/**类成员变量集合*/
	private List<ExcelField> fields;
}
