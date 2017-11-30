package com.mrtree.auto.generator.core.generate;

import java.io.Writer;
import java.util.List;
import java.util.Map;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import com.mrtree.auto.generator.core.VelocityContextHolder;
import com.mrtree.auto.generator.excel.BeanImport;
import com.mrtree.auto.generator.excel.IExcelImport;
import com.mrtree.auto.generator.model.ExcelBean;
import com.mrtree.auto.generator.utils.BeanUtils;
import com.mrtree.auto.generator.utils.FileUtil;

/**
 * <p>
 *   从excel中获取信息生成模板代码
 * </p>
 * @author shuzheng_wang  2017-11-30 14:01
 */
public class ExcelGenerator extends CommonGenerator{
	
	public void generate(ExcelBean excelBean) {
		VelocityEngine velocityEngine = VelocityContextHolder.getVelocityEngine();
		Map<String, Object> map = BeanUtils.getValueMap(excelBean);
		map.put("modelPackage", "com.feidee.loanmanage.service.entity.apidata");

		String path = "D:\\WorkSpace\\java\\loanmanage-service\\loanmanage-service-entity\\src\\main\\java\\"+
		map.get("modelPackage").toString().replace(".", "/")  +
		"/" + excelBean.getBeanName().trim() + ".java";
		System.out.println(path);
		String templatePath = "/template/excel/excelBeanTemplate.vm";
		Writer writer = FileUtil.createWriter(getRealPath(path));

		VelocityContext context = VelocityContextHolder.createContext(map);
		velocityEngine.mergeTemplate(templatePath, "UTF-8", context, writer);
		FileUtil.flushWriter(writer);
	}
	
	public static void main(String[] args) {
		ExcelGenerator excelGenerator = new ExcelGenerator();
		IExcelImport excelImport = new BeanImport();
//		ExcelBean excelBean = excelImport.imports("E:\\test\\bean信息模板.xlsx");
//		new ExcelGenerator().generate(excelBean);
		
		List<ExcelBean> excelBeans = excelImport.importsMul("E:\\test\\bean信息模板-推送.xlsx");
		for (ExcelBean excelBean : excelBeans) {
			excelGenerator.generate(excelBean);
		}
		System.out.println("=============生成模板成功！=============");
	}
}
