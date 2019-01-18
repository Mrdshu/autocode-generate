package com.mrtree.auto.generator.excel;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import com.mrtree.auto.generator.model.ExcelStruct;
import com.mrtree.auto.generator.model.ExcelBean;
import com.mrtree.auto.generator.model.ExcelField;
import com.mrtree.auto.generator.model.ExcelStruct;


/**
 * <p>
 *   常规从excel导入Struct信息。
 *   excel中有三列：  字段名，字段类型，字段描述。
 * 	 excel最后一行为bean名，bean备注信息
 * </p>
 * @author shuzheng_wang  2017-11-30 10:27
 */
public class StructImport extends IExcelImport<ExcelStruct> {
	
	@Override
	protected List<ExcelStruct> importDatas(Sheet sheet) {
		List<ExcelStruct> excelStructs = new ArrayList<>();
		int start = 1;
		int end = sheet.getLastRowNum()+2;
		
		int circleStart = start;
		int circleEnd = end;
		for (int i = start; i < end; i++) {
			 Row row = sheet.getRow(i);
			 
			 String cellValue = (String)getCellValue(row == null ? null : row.getCell(0));
			 cellValue = replaceSpecialStr(cellValue);
			 if(row == null || "".equals(cellValue)) {
				 circleEnd = i-1;
				 ExcelStruct excelBean = importStructForLineNum(sheet, circleStart, circleEnd);
				 excelStructs.add(excelBean);
				 circleStart = i+1;
			 }
		}
		return excelStructs;
	}
	
	protected ExcelStruct importStructForLineNum(Sheet sheet, int startLine, int endLine) {
		ExcelStruct rs = new ExcelStruct();
		
		List<ExcelField> excelBeanFields = new ArrayList<>();
		//获取类名和类备注
		Row headRow = sheet.getRow(startLine);
		rs.setTypeName((String)getCellValue(headRow.getCell(3)));
		
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

	@Override
	protected ExcelStruct importData(Sheet sheet) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
     * 去除字符串中的空格、回车、换行符、制表符等
     * @param str
     * @return
     */
    public static String replaceSpecialStr(String str) {
        String repl = "";
        if (str!=null) {
            Pattern p = Pattern.compile("\\s*|\t|\r|\n");
            Matcher m = p.matcher(str);
            repl = m.replaceAll("");
        }
        return repl;
    }


}
