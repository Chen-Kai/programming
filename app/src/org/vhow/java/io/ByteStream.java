package org.vhow.java.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out = null;
		String currentPath = System.getProperty("user.dir");
		try {
			in = new FileInputStream(currentPath + "/src/org/vhow/java/io/git");
			out = new FileOutputStream(currentPath + "/src/org/vhow/java/io/git.cp");

			int b = -1;
			while ((b = in.read()) != -1) {
				out.write(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
