package com.mrtree.auto.generator.custom;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CustomTable {

	private String tableName;
	private String domainObjectName;
	private List<CustomColumn> columnOverride;

	@XmlAttribute(name = "tableName")
	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	@XmlAttribute(name = "domainObjectName")
	public String getDomainObjectName() {
		return domainObjectName;
	}

	public void setDomainObjectName(String domainObjectName) {
		this.domainObjectName = domainObjectName;
	}

	@XmlElement(name="columnOverride")
	public List<CustomColumn> getColumnOverride() {
		return columnOverride;
	}

	public void setColumnOverride(List<CustomColumn> columnOverride) {
		this.columnOverride = columnOverride;
	}

}
