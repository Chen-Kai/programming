package com.gmail.dailyefforts.java.file;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class FileBrowser {
	private static Map<String, String> map = new HashMap<String, String>();

	public static void main(String[] args) {
		File root = new File("/");
		map.clear();
		walkThrough(root);

		System.out.println(map.toString());
	}

	public static void walkThrough(File root) {
		File[] files = root.listFiles();
		if (files != null) {
			for (File f : files) {
				if (f.isFile()) {
					System.out.println(f.getName());
					map.put(f.getName(),
							String.format("%.2f", f.length() / 1000.0F));
				} else {
					walkThrough(f);
				}
			}
		}
	}

}
