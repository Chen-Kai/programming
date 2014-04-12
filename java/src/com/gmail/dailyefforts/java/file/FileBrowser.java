package com.gmail.dailyefforts.java.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileBrowser {
	public static void main(String[] args) throws Exception {
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File(
				"./filelist.bak")));
		File[] roots = File.listRoots();
		if (roots != null) {
			for (File root : roots) {
				walkThrough(root, writer);
			}
		}
		writer.close();
	}

	public static void walkThrough(File file, BufferedWriter reader) {
		File[] files = file.listFiles();
		if (files == null) {
			return;
		}
		for (File f : files) {
			if (f.isFile()) {
				try {
					reader.write(f.getAbsolutePath() + "\t" + f.length() / 1024
							+ " KB");
					reader.newLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				walkThrough(f, reader);
			}
		}
	}

}
