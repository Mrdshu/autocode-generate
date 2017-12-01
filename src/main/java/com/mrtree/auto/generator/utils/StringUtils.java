package com.mrtree.auto.generator.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils extends org.apache.commons.lang.StringUtils{
	
	/**
	 * 首字符转大写
	 * 
	 * @param val
	 * @return
	 */
	public static String toUpperCaseFirst(String val) {
		StringBuffer sb = new StringBuffer(val);
		sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
		val = sb.toString();
		return val;
	}

	/**
	 * 下划线转驼峰
	 * @param param 要转换的字符串
	 * @param underline 下划线字符串
	 * @return
	 * @autohr shuzheng_wang  2017-11-29 14:10
	 */
	public static String camelToUnderline(String param, String underline) {
		if (param == null || "".equals(param.trim())) {
			return "";
		}
		int len = param.length();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++) {
			char c = param.charAt(i);
			if (Character.isUpperCase(c)) {
				sb.append(underline);
				sb.append(Character.toLowerCase(c));
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}

	/**
	 * 将aaXbbXcc（X可为任何字符）的下划线字符串转换为驼峰字符串aaBbCc
	 * @param param 要转换的字符串
	 * @param underline X
	 * @return
	 * @autohr shuzheng_wang  2017-11-29 14:11
	 */
	public static String underLineToCamel(String param,char underline) {
		if (param == null || "".equals(param.trim())) {
			return "";
		}
		int len = param.length();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++) {
			char c = param.charAt(i);
			if (c == underline) {
				if (++i < len) {
					sb.append(Character.toUpperCase(param.charAt(i)));
				}
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}

	/**
	 * 将aa_bb_cc的下划线字符串转换为驼峰字符串aaBbCc
	 * @param param
	 * @return
	 * @autohr shuzheng_wang  2017-11-29 14:07
	 */
	public static String underLineToCamel(String param) {
		if (param == null || "".equals(param.trim())) {
			return "";
		}
		StringBuilder sb = new StringBuilder(param);
		Matcher mc = Pattern.compile("_").matcher(param);
		int i = 0;
		while (mc.find()) {
			int position = mc.end() - (i++);
			// String.valueOf(Character.toUpperCase(sb.charAt(position)));
			sb.replace(position - 1, position + 1, sb.substring(position, position + 1).toUpperCase());
		}
		return sb.toString();
	}

}
