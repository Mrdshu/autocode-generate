package com.mrtree.auto.generator.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileUtil {
	
	public static String readStringFromFile(String filePath){
		String str = "";
		File file = new File(filePath);

		try {
			FileInputStream in = new FileInputStream(file);
			// size 为字串的长度 ，这里一次性读完
			int size = in.available();
			byte[] buffer = new byte[size];
			in.read(buffer);
			in.close();
			str = new String(buffer, "GB2312");
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}

		return str;

	}
	
	public static Writer createWriter(String path) {		
		File file = new File(path);
		String dir = file.getParent();
		File pd = new File(dir);
		if (!pd.exists()) {
			pd.mkdirs();
		}
		FileWriter writer = null;
		try {
			writer = new FileWriter(path);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return writer;
	}
	
	public static void flushWriter(Writer writer) {
		try {
			writer.flush();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
