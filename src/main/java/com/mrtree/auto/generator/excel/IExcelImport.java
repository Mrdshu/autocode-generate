package com.mrtree.auto.generator.excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.mrtree.auto.generator.model.ExcelBean;

/**
 * Excel 导入接口
 * @author wsz 2017-07-30
 */
public abstract class IExcelImport {
	protected final Logger log = Logger.getLogger(this.getClass());
	 /**
	 * 导入excel信息
	 * @author wsz 2017-07-30
	 */
	public ExcelBean imports(String importFilePath) {
		ExcelBean rs = null;
         
		// 创建工作薄Workbook  
        Workbook workBook = null;
		try {
			InputStream in = new FileInputStream(importFilePath); 
			workBook = WorkbookFactory.create(in);
		} catch (IOException e) {
			e.printStackTrace();
			log.error("导入路径【" + importFilePath + "】错误，文件不存在！");
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			log.error("Excel模板错误，请检查代码！");
			return rs;
		}
          
        //获取excel第一页，Sheet是从0开始索引的 
        Sheet sheet = workBook.getSheetAt(0); 
		//导入数据
		rs = importData(sheet);
        
        return rs;
	}
	
	public List<ExcelBean> importsMul(String importFilePath) {
		List<ExcelBean> excelBeans = null;
         
		// 创建工作薄Workbook  
        Workbook workBook = null;
		try {
			InputStream in = new FileInputStream(importFilePath); 
			workBook = WorkbookFactory.create(in);
		} catch (IOException e) {
			e.printStackTrace();
			log.error("导入路径【" + importFilePath + "】错误，文件不存在！");
			return excelBeans;
		} catch (Exception e) {
			e.printStackTrace();
			log.error("Excel模板错误，请检查代码！");
			return excelBeans;
		}
          
        //获取excel第一页，Sheet是从0开始索引的 
        Sheet sheet = workBook.getSheetAt(0); 
		//导入数据
        excelBeans = importDatas(sheet);
        
        return excelBeans;
	}
	
	/**
	 * 导入表格的数据
	 * @param sheet
	 * @return
	 *
	 * @author wsz 2017-09-20
	 */
	protected abstract ExcelBean importData(Sheet sheet);
	
	/**
	 * 导入表格的多个数据
	 * @param sheet
	 * @return
	 *
	 * @author wsz 2017-09-20
	 */
	protected abstract List<ExcelBean> importDatas(Sheet sheet);
	
	/**
	 * 根据excel单元格的数据类型，获取相应的数据
	 * @param cell
	 * @return
	 *
	 * @author wsz 2017-09-20
	 */
	protected Object getCellValue(Cell cell) {
		if(CellType.NUMERIC == cell.getCellTypeEnum())
			return cell.getNumericCellValue()+"";
		else if(CellType.STRING == cell.getCellTypeEnum())
			return cell.getStringCellValue();
		else if(CellType.BOOLEAN == cell.getCellTypeEnum())
			return cell.getBooleanCellValue();
		else 
			return cell.getStringCellValue();
	}
}
