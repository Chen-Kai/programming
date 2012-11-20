package com.gmail.dailyefforts.java.file;

import java.io.File;
import java.io.IOException;

public class FileCreator {
	public static boolean create(String path) throws IOException {
		File file = new File(path);
		File parentFile = file.getParentFile();

		// If parent folder does not exist, create it.
		if (!parentFile.exists()) {
			parentFile.mkdirs();
		}

		// If file does not exist, create it.
		if (!file.exists()) {
			file.createNewFile();
		}

		return file.exists() ? true : false;
	}

	public static void main(String[] args) throws IOException {
		FileCreator.create("/home/a/b/c/d/e/f/test");
	}
}
