package com.mrtree.auto.generator.utils;

import com.mrtree.auto.generator.constant.CommonDataType;

public class TypeUtils {

	public static String getType(int dataType, String language){
		if ("go".equals(language)){
			return getGoType(CommonDataType.getJdbcType(dataType));
		}else {
			return getJavaType(CommonDataType.getJdbcType(dataType));
		}
	}
	
	public static String getJavaType(String jdbcType) {
		String lowerJdbcType = jdbcType.toLowerCase();
		String type = "unknownType";
		if (lowerJdbcType.equals("char") || lowerJdbcType.equals("varchar") || lowerJdbcType.equals("longvarchar")) {
			type = "String";
		}
		if (lowerJdbcType.equals("tinyint") || lowerJdbcType.equals("bit")) {
			type = "Boolean";
		}

		if (lowerJdbcType.equals("smallint")
				|| lowerJdbcType.equals("integer")) {
			type = "Integer";
		}

		if (lowerJdbcType.equals("bigint")) {
			type = "Long";
		}
		if (lowerJdbcType.equals("float")) {
			type = "Float";
		}
		if (lowerJdbcType.equals("double")) {
			type = "Double";
		}
		if (lowerJdbcType.equals("numeric") || lowerJdbcType.equals("decimal")) {
			type = "BigDecimal";
		}
		
		if (lowerJdbcType.equals("date")||lowerJdbcType.equals("time")||lowerJdbcType.equals("timestamp")) {
			type = "Date";
		}
		if (lowerJdbcType.equals("binary")||lowerJdbcType.equals("varbinary")||lowerJdbcType.equals("longvarbinary")) {
			type = "byte[]";
		}

		return type;
	}

	public static String getGoType(String jdbcType) {
		String lowerJdbcType = jdbcType.toLowerCase();
		String type = "unknownType";
		if (lowerJdbcType.equals("char") || lowerJdbcType.equals("varchar") || lowerJdbcType.equals("longvarchar")) {
			type = "string";
		}
		if (lowerJdbcType.equals("tinyint") || lowerJdbcType.equals("bit")) {
			type = "bool";
		}

		if (lowerJdbcType.equals("smallint")
				|| lowerJdbcType.equals("integer")) {
			type = "int32";
		}

		if (lowerJdbcType.equals("bigint")) {
			type = "int64";
		}
		if (lowerJdbcType.equals("float")) {
			type = "float32";
		}
		if (lowerJdbcType.equals("double")) {
			type = "float64";
		}
		if (lowerJdbcType.equals("numeric") || lowerJdbcType.equals("decimal")) {
			type = "float64";
		}

		if (lowerJdbcType.equals("date")||lowerJdbcType.equals("time")||lowerJdbcType.equals("timestamp")) {
			type = "Date";
		}
		if (lowerJdbcType.equals("binary")||lowerJdbcType.equals("varbinary")||lowerJdbcType.equals("longvarbinary")) {
			type = "[]byte";
		}

		return type;
	}
}
