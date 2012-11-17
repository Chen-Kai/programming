package com.gmail.dailyefforts.java.runtime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class OS {
	private static final String[] keys = { "file.separator", "java.class.path",
			"java.class.version", "java.home", "java.vendor",
			"java.vendor.url", "java.version", "line.separator", "os.arch",
			"os.name", "path.separator", "user.dir", "user.home", "user.name" };
	private static final String CMD = "du -sh";

	public static void main(String[] args) throws IOException {
//		printSystemProperties();
		exec(CMD);
	}

	/**
	 * Print OS properties.
	 */
	private static void printSystemProperties() {
		for (String key : keys) {
			System.out.println(key + ": " + System.getProperty(key));
		}
	}

	/**
	 * Execute Shell command.
	 * 
	 * @param cmd
	 *            Shell command.
	 * @throws IOException
	 */
	private static void exec(String cmd) throws IOException {
		// Detect OS type.
		if (!"linux".equals(System.getProperty("os.name").toLowerCase())) {
			return;
		}

		// Execute SHELL command.
		Runtime runtime = Runtime.getRuntime();
		Process process = runtime.exec(cmd);

		InputStream inputStream = process.getInputStream();
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(inputStream));

		String str = "";
		while ((str = bufferedReader.readLine()) != null) {
			System.out.println(str);
		}
	}
}
