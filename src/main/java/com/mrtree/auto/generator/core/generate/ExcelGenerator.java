package com.mrtree.auto.generator.core.generate;

import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import com.mrtree.auto.generator.core.VelocityContextHolder;
import com.mrtree.auto.generator.excel.BeanImport;
import com.mrtree.auto.generator.excel.IExcelImport;
import com.mrtree.auto.generator.model.ExcelBean;
import com.mrtree.auto.generator.model.ExcelStruct;
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
	
	public void generateStructsForExcel(List<ExcelStruct> excelStructs, String templatePath, String outFilePath) {
		if(StringUtils.isEmpty(templatePath) || StringUtils.isEmpty(outFilePath)) {
			System.out.println("包名或路径不能为空，生成模板代码失败！");
			return ;
		}
		
		Writer writer = FileUtil.createWriter(outFilePath);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("types", excelStructs);
		VelocityContext context = VelocityContextHolder.createContext(map);
		
		VelocityEngine velocityEngine = VelocityContextHolder.getVelocityEngine();
		velocityEngine.mergeTemplate(templatePath, "UTF-8", context, writer);
		FileUtil.flushWriter(writer);
	}
	
}
