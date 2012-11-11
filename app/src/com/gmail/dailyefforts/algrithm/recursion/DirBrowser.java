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
	public void listAllFiles(final File root, List<File> list) {

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
}
