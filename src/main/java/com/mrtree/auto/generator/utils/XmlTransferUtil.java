package com.mrtree.auto.generator.utils;

import java.io.File;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

/**
 * Jaxb 转换xml和object工具类
 * @author wangsz 2017-07-04
 */
public class XmlTransferUtil {
	
	/**
	 * 将对象转换为xml字符串
	 * @return 解析失败为null
	 * @author  wangsz 2017-07-04
	 */
	public static String transferObject2Xml(String object) {
		String xml = null;
		
		try {  
            JAXBContext jaxbContext = JAXBContext.newInstance(object.getClass());  
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();  
            
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  
            jaxbMarshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");  
            //写出到控制台
            jaxbMarshaller.marshal(object, System.out);  
            //写出到字符串
            StringWriter writer = new StringWriter();
            jaxbMarshaller.marshal(object, writer);
            xml = writer.toString();
        } catch (JAXBException e) {  
            e.printStackTrace();  
        }  
		
		return xml;
	}
	
	/**
	 * 将对象转换为xml，写入文件
	 * 
	 * @param filePath 文件路径
	 * @param object 对象
	 * @author  wangsz 2017-07-04
	 */
	public static void transferObject2XmlFile(String filePath,String object) {
		try {  
            JAXBContext jaxbContext = JAXBContext.newInstance(object.getClass());  
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();  
            
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  
            jaxbMarshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");  
            //写出到文件中
            File file = new File(filePath);
            jaxbMarshaller.marshal(object, file);
            //写出到控制台
            jaxbMarshaller.marshal(object, System.out);  
        } catch (JAXBException e) {  
            e.printStackTrace();  
        }  
	}
	
	/**
	 * 将xml字符串转换为对象
	 * 
	 * @return 如果转换失败返回null
	 * @author  wangsz 2017-07-04
	 */
	@SuppressWarnings("unchecked")
	public static <T> T transferXml2Object(String xml,Class<T> clazz){
		T rs = null;
		try {
			JAXBContext jc = JAXBContext.newInstance(clazz);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			rs =(T) unmarshaller.unmarshal(new StreamSource(new StringReader(xml)));
		} catch (Exception e) {
			e.printStackTrace();  
		}
		
		return rs;
	}
	
	/**
	 * 将xml文件转换为对象
	 * 
	 * @return 如果转换失败返回null
	 * @author  wangsz 2017-07-04
	 */
	@SuppressWarnings("unchecked")
	public static <T> T transferXmlFile2Object(String filePath,Class<T> clazz){
		T rs = null;
		try {
			JAXBContext jc = JAXBContext.newInstance(clazz);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			rs =(T) unmarshaller.unmarshal(new File(filePath));
		} catch (Exception e) {
			e.printStackTrace();  
		}
		
		return rs;
	}
}
