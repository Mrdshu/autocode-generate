package com.mrtree.auto.generator.custom;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CustomColumn {
	private String column;
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
