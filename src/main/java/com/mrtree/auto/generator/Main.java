package com.mrtree.auto.generator;

import java.util.List;

import com.mrtree.auto.generator.core.generate.ExcelGenerator;
import com.mrtree.auto.generator.excel.BeanImport;
import com.mrtree.auto.generator.excel.IExcelImport;
import com.mrtree.auto.generator.excel.StructImport;
import com.mrtree.auto.generator.model.ExcelBean;
import com.mrtree.auto.generator.model.ExcelStruct;

public class Main {
	
	public static void main(String[] args) {
		generateExcelStruct();
	}
	
	public void generateExcelBean() {
		ExcelGenerator excelGenerator = new ExcelGenerator();
		IExcelImport excelImport = new BeanImport();
		
		List<ExcelBean> excelBeans = excelImport.importsMul("E:\\test\\bean信息模板-推送.xlsx");
		for (ExcelBean excelBean : excelBeans) {
			excelGenerator.generateForExcel(excelBean);
		}
		System.out.println("=============生成模板成功！=============");
	}
	
	public static void generateExcelStruct() {
		ExcelGenerator excelGenerator = new ExcelGenerator();
		IExcelImport<ExcelStruct> excelImport = new StructImport();
		
		List<ExcelStruct> excelStructs = excelImport.importsMul("/Users/shuzhengwang/Documents/excel-struct.xlsx");
		excelGenerator.generateStructsForExcel(excelStructs,
				"template/excel/excelStructTemplate.vm",
				"/Users/shuzhengwang/a.txt");
		System.out.println("=============生成模板成功！=============");
	}

	public static void generateGoDao() {
		ExcelGenerator excelGenerator = new ExcelGenerator();
		IExcelImport<ExcelStruct> excelImport = new StructImport();

		List<ExcelStruct> excelStructs = excelImport.importsMul("/Users/shuzhengwang/Documents/excel-struct.xlsx");
		excelGenerator.generateStructsForExcel(excelStructs,
				"template/excel/excelStructTemplate.vm",
				"/Users/shuzhengwang/a.txt");
		System.out.println("=============生成模板成功！=============");
	}
}
