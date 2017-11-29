package com.mrtree.auto.generator.custom;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class XmlTransferTest {
	
	public static void main(String[] args) {
		CustomColumn column = new CustomColumn();
		column.setColumn("client_name");
		column.setProperty("name");
		CustomColumn column2 = new CustomColumn();
		column2.setColumn("client_age");
		column2.setProperty("age");
		
		List<CustomColumn> columns = new ArrayList<>();
		columns.add(column);
		columns.add(column2);
		
		CustomTable customTable = new CustomTable();
		customTable.setTableName("tb_client");
		customTable.setDomainObjectName("Client");
		customTable.setColumnOverride(columns);
		CustomTable customTable2 = new CustomTable();
		customTable2.setTableName("tb_user");
		customTable2.setDomainObjectName("User");
		customTable2.setColumnOverride(columns);
		
		List<CustomTable> tables = new ArrayList<>();
		tables.add(customTable);
		tables.add(customTable2);
		
		CustomTables customTables = new CustomTables();
		customTables.setTables(tables);
		
		try {  
            File file = new File("D:\\test.xml");  
            JAXBContext jaxbContext = JAXBContext.newInstance(CustomTables.class);  
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();  
            // output pretty printed  
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  
            jaxbMarshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");  
            jaxbMarshaller.marshal(customTables, file);  
            jaxbMarshaller.marshal(customTables, System.out);  
        } catch (JAXBException e) {  
            e.printStackTrace();  
        }  
		
	}
}
