package com.mrtree.auto.generator.custom;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "tables")
public class CustomTables {
	// @XmlElement(name="table")注解放在这个地方，则不能有get方法，不然会抛出属性重复错误
	private List<CustomTable> table;

	/**不做映射的列名*/
	private String excludeColumns;

	/**列名映射时是否需要前缀，例如tb_name，为false时映射成实体类成员变量为name*/
	private Boolean needPrefix;

	/**特殊列名，needPrefix为false时，保持前缀列名集合*/
	private String specialColumns;

	@XmlElement(name = "needPrefix")
	public Boolean getNeedPrefix() {
		return needPrefix;
	}

	public void setNeedPrefix(Boolean needPrefix) {
		this.needPrefix = needPrefix;
	}

	@XmlElement(name = "specialColumns")
	public String getSpecialColumns() {
		return specialColumns;
	}

	public void setSpecialColumns(String specialColumns) {
		this.specialColumns = specialColumns;
	}

	@XmlElement(name = "excludeColumns")
	public String getExcludeColumns() {
		return excludeColumns;
	}

	public void setExcludeColumns(String excludeColumns) {
		this.excludeColumns = excludeColumns;
	}

	@XmlElement(name = "table")
	public List<CustomTable> getTables() {
		return table;
	}

	public void setTables(List<CustomTable> table) {
		this.table = table;
	}

}
