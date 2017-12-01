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
import com.mrtree.auto.generator.utils.StringUtils;

/**
 * <p>
 *   从excel中获取信息生成模板代码
 * </p>
 * @author shuzheng_wang  2017-11-30 14:01
 */
public class ExcelGenerator extends Generator{
	
	public void generateForExcel(ExcelBean excelBean) {
		if(StringUtils.isEmpty(config.getPackageName()) || StringUtils.isEmpty(config.getTargetDir())) {
			System.out.println("包名或路径不能为空，生成模板代码失败！");
			return ;
		}
		
		String templatePath = config.getTempleteBase() + "/" + config.getTempleteName();
		String path = config.getTargetDir() + config.getPackageName().toString().replace(".", "/")  +
				"/" + excelBean.getBeanName().trim() + ".java";
		Writer writer = FileUtil.createWriter(path);
		Map<String, Object> map = BeanUtils.getValueMap(excelBean);
		VelocityContext context = VelocityContextHolder.createContext(map);
		
		VelocityEngine velocityEngine = VelocityContextHolder.getVelocityEngine();
		velocityEngine.mergeTemplate(templatePath, "UTF-8", context, writer);
		FileUtil.flushWriter(writer);
	}
	
	public void generate() {
		ExcelGenerator excelGenerator = new ExcelGenerator();
		IExcelImport excelImport = new BeanImport();
//		ExcelBean excelBean = excelImport.imports("E:\\test\\bean信息模板.xlsx");
//		new ExcelGenerator().generate(excelBean);
		
		List<ExcelBean> excelBeans = excelImport.importsMul("E:\\test\\bean信息模板-推送.xlsx");
		for (ExcelBean excelBean : excelBeans) {
			excelGenerator.generateForExcel(excelBean);
		}
		System.out.println("=============生成模板成功！=============");
	}
}
