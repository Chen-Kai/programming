package com.gmail.dailyefforts.java.http.ogden;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class LookUp {
	public static void main(String[] args) throws Exception {
		String word = null;
		String meaning = null;

		File inFile = new File(
				"/home/null/workspace/programming/java/src/com/gmail/dailyefforts/java/http/ogden/ogden.txt");
		BufferedReader reader = new BufferedReader(
				new FileReader(
						inFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File(inFile.getParentFile(), "target.txt")));

		String line = null;
		
		int count = 0;

		while ((line = reader.readLine()) != null) {
			word = line.trim();
			meaning = getMeaning(word);
			String x = word + "\t@\t" + meaning;
			System.out.println(x);
			writer.write(x);
			writer.newLine();
			count++;
		}
		System.out.println("count: " + count);
		if (reader != null) {
			reader.close();
		}
		
		if (writer != null) {
			writer.close();
		}
	}

	private static String getMeaning(String word) throws MalformedURLException   {
		String base = "http://www.iciba.com/";
		String meaning = null;
		URL url = new URL(base + word);
		BufferedReader reader = null;
		try {
			URLConnection conn = url.openConnection();
			reader = new BufferedReader(new InputStreamReader(
					conn.getInputStream()));
		} catch (IOException e) {
			return "ERROR";
		}
		String line = null;

		boolean 开始处理 = false;

		try {
			while ((line = reader.readLine()) != null) {
				if (line.contains("group_prons")) {
					开始处理 = true;
				}
				if (!开始处理) {
					continue;
				} else if (line.matches(".*<label>.*</label>.*")) {
					meaning = line.substring(line.indexOf(">") + 1,
							line.indexOf("</"));
					break;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return meaning;
	}
}
