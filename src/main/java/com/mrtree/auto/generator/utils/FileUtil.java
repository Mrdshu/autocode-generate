package com.mrtree.auto.generator.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

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

}
