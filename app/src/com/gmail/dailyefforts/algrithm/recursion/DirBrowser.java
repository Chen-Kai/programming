package com.gmail.dailyefforts.algrithm.recursion;

import java.io.File;
import java.util.List;

public class DirBrowser {
	/**
	 * List all the files in some directory recursively.
	 * 
	 * @param root
	 *            The root directory.
	 * @param list
	 *            Stores all sub files.
	 */
	public static void listAllFiles(final File root, List<File> list) {

		File[] subFiles = root.listFiles();

		if (subFiles != null) {

			for (File f : subFiles) {
				if (f.isDirectory()) {
					listAllFiles(f.getAbsoluteFile(), list);
				} else {
					list.add(f);
				}
			}

		}

	}

	/**
	 * Modify all the sub-directories from upper case to lower case.
	 * @param root The root directory.
	 */
	public static void toLowserCase(final File root) {
		File[] subFiles = root.listFiles();
		for (File f : subFiles) {
			if (f.isDirectory()) {
				toLowserCase(f);
			}
			File newFile = new File(f.getParent() + "/"
					+ f.getName().toLowerCase());
			f.renameTo(newFile);
		}
	}
}
