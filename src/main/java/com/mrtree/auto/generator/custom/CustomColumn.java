package com.mrtree.auto.generator.custom;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CustomColumn {
	/**列名*/
	private String column;
	/**映射后成员变量名*/
	private String property;

	@XmlAttribute
	public String getColumn() {
		return column;
	}

	public void setColumn(String column) {
		this.column = column;
	}

	@XmlAttribute
	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

}
