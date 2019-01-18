package com.mrtree.auto.generator.excel;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import com.mrtree.auto.generator.model.ExcelBean;
import com.mrtree.auto.generator.model.ExcelField;


/**
 * <p>
 *   常规从excel导入Bean信息。
 *   excel中有三列：  字段名，字段类型，字段描述。
 * 	 excel最后一行为bean名，bean备注信息
 * </p>
 * @author shuzheng_wang  2017-11-30 10:27
 */
public class BeanImport extends IExcelImport<ExcelBean>{

	@Override
	protected ExcelBean importData(Sheet sheet) {
//		ExcelBean rs = new ExcelBean();
//		
//		List<ExcelBeanField> excelBeanFields = new ArrayList<>();
//		//获取类名和类备注
//		Row headRow = sheet.getRow(1);
//		rs.setBeanName((String)getCellValue(headRow.getCell(3)));
//		rs.setBeanRemark((String)getCellValue(headRow.getCell(4)));
//		
//        for (int i = 1, n = sheet.getLastRowNum(); i <= n; i++) {
//            Row row = sheet.getRow(i);
//            ExcelBeanField excelBeanField = new ExcelBeanField();
//            
//            excelBeanField.setName((String)getCellValue(row.getCell(0)));
//            excelBeanField.setType((String)getCellValue(row.getCell(1)));
//            excelBeanField.setRemark((String)getCellValue(row.getCell(2)));
//            
//            excelBeanFields.add(excelBeanField);
//        }
//        
//        rs.setFields(excelBeanFields);
//        
//		return rs;
		
		return importDataForLineNum(sheet, 1, sheet.getLastRowNum());
	}
	
	@Override
	protected List<ExcelBean> importDatas(Sheet sheet) {
		List<ExcelBean> excelBeans = new ArrayList<>();
		int start = 1;
		int end = sheet.getLastRowNum()+2;
		
		int circleStart = start;
		int circleEnd = end;
		for (int i = start; i < end; i++) {
			 Row row = sheet.getRow(i);
			 
			 if(row == null) {
				 circleEnd = i-1;
				 ExcelBean excelBean = importDataForLineNum(sheet, circleStart, circleEnd);
				 excelBeans.add(excelBean);
				 circleStart = i+1;
			 }
		}
		return excelBeans;
	}
	
	protected ExcelBean importDataForLineNum(Sheet sheet, int startLine, int endLine) {
		ExcelBean rs = new ExcelBean();
		
		List<ExcelField> excelBeanFields = new ArrayList<>();
		//获取类名和类备注
		Row headRow = sheet.getRow(startLine);
		rs.setBeanName((String)getCellValue(headRow.getCell(3)));
		rs.setBeanRemark((String)getCellValue(headRow.getCell(4)));
		
        for (int i = startLine, n = endLine; i <= n; i++) {
            Row row = sheet.getRow(i);
            ExcelField excelBeanField = new ExcelField();
            
            excelBeanField.setName((String)getCellValue(row.getCell(0)));
            excelBeanField.setType((String)getCellValue(row.getCell(1)));
            excelBeanField.setRemark((String)getCellValue(row.getCell(2)));
            
            excelBeanFields.add(excelBeanField);
        }
        
        rs.setFields(excelBeanFields);
        
		return rs;
	}


}
