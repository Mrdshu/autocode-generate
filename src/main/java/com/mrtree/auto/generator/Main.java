package com.mrtree.auto.generator;

import java.io.Writer;
import java.util.List;

import com.mrtree.auto.generator.core.TableDataProcessor;
import com.mrtree.auto.generator.core.VelocityContextHolder;
import com.mrtree.auto.generator.core.generate.ExcelGenerator;
import com.mrtree.auto.generator.excel.BeanImport;
import com.mrtree.auto.generator.excel.IExcelImport;
import com.mrtree.auto.generator.excel.StructImport;
import com.mrtree.auto.generator.model.ExcelBean;
import com.mrtree.auto.generator.model.ExcelStruct;
import com.mrtree.auto.generator.model.Table;
import com.mrtree.auto.generator.utils.FileUtil;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

public class Main {
	
	public static void main(String[] args) {
		generateGoModel("person_info_tab");
	}

	public static void GetJavaTableModel(String tableNamePattern) {
		TableDataProcessor t = new TableDataProcessor();
		List<Table> tableInfos = t.getTableInfos(tableNamePattern);

		System.out.println(tableInfos.get(0));
	}

	public static void GetGoTableModel(String tableNamePattern) {
		TableDataProcessor t = new TableDataProcessor();
		List<Table> tableInfos = t.getTableInfos(tableNamePattern,"go");
		System.out.println(tableInfos.get(0));
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

	public static void generateGoModel(String tableNamePattern) {
		TableDataProcessor t = new TableDataProcessor();
		List<Table> tableInfos = t.getTableInfos(tableNamePattern,"go");

		for (Table table : tableInfos) {
			VelocityEngine velocityEngine = VelocityContextHolder.getVelocityEngine();
			VelocityContext context = VelocityContextHolder.createContext(table);

			String filePath = "d://"+table.getLowBeanName() +".go";
			Writer writer = FileUtil.createWriter(filePath);

			velocityEngine.mergeTemplate("/template/go/modelTemplate.vm", "UTF-8", context, writer);
			FileUtil.flushWriter(writer);
		}
	}
}
