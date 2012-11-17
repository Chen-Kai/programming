package com.gmail.dailyefforts.java.runtime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class OS {
	public static void main(String[] args) throws IOException {

		// Detect OS type.
		if (!"linux".equals(System.getProperty("os.name").toLowerCase())) {
			return;
		}

		// Execute `ls` command.
		Runtime runtime = Runtime.getRuntime();
		Process process = runtime.exec("ls");

		InputStream inputStream = process.getInputStream();
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(inputStream));

		String str = "";
		while ((str = bufferedReader.readLine()) != null) {
			System.out.println(str);
		}
	}
}
