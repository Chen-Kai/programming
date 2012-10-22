package org.vhow.java.file;

import java.io.File;
import java.util.Arrays;

public class FileBrowser {

	public static void main(String[] args) {
		File dir = new File("/home/null/Pictures/png/");
		File[] files = dir.listFiles();
		for (File f : files) {
			if (f.isFile()) {
				String name = f.getName();
				char[] namearray = name.toCharArray();
				Arrays.sort(namearray);
				if (namearray[namearray.length - 1] > 'z') {
					f.delete();
				}
				
				File tmp  = null;
					tmp = new File(f.getParent() + File.separator + f.getName().toLowerCase());
					f.renameTo(tmp);

				
//					File tmp = new File(f.getPath());
//					System.out.println("FileBrowser.main() " + f.getParent());
			}
		}
	}

}
