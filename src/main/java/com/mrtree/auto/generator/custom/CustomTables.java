package com.mrtree.auto.generator.custom;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="tables")
public class CustomTables {
	//@XmlElement(name="table")注解放在这个地方，则不能有get方法，不然会抛出属性重复错误
	private List<CustomTable> table;

	@XmlElement(name="table")
	public List<CustomTable> getTables() {
		return table;
	}

	public void setTables(List<CustomTable> table) {
		this.table = table;
	}
	
	
}
