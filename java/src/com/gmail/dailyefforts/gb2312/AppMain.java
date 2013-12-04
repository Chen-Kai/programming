package com.gmail.dailyefforts.gb2312;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class AppMain {

	private static String ff(String hanzi) throws Exception {
		StringBuffer buffer = new StringBuffer();
		HttpClient httpclient = new DefaultHttpClient();
		String url = fetch(hanzi);
		if (url == null) {
			return null;
		}
		HttpGet httpget = new HttpGet(url);
		HttpResponse response;
		try {
			response = httpclient.execute(httpget);
			HttpEntity entity = response.getEntity();
			if (entity != null) {
				InputStream instream = entity.getContent();
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(instream));
				String line = null;
				boolean knowit = false;
				String pinyin = null;
				String key = null;
				String meaning = null;
				String backupMeaning = null;
				boolean hasBackup = false;
				while ((line = reader.readLine()) != null) {
					// System.out.println(line);
					if (line.contains("～") && !hasBackup) {
						// System.out.println(line);
						if (line.contains("｜")) {
							backupMeaning = line
									.substring(0, line.indexOf("｜"));
						}
						if (backupMeaning != null
								&& backupMeaning.contains("：")) {
							backupMeaning = backupMeaning.substring(line
									.indexOf("：") + 1);
							if (backupMeaning.contains("。")) {
								backupMeaning = backupMeaning.substring(0,
										backupMeaning.indexOf("。"));
							} else if (backupMeaning.contains("｜")) {
								backupMeaning = backupMeaning.substring(0,
										backupMeaning.indexOf("｜"));
							}
						}
						hasBackup = true;
					}
					if (line.contains("js11") && line.contains("js12")) {
						int idx = line.indexOf("js11");
						if (key == null) {
							key = line.substring(idx + 6, idx + 7);
							buffer.append(key);
						}

						idx = line.indexOf("js12");
						String yin = line.substring(idx + 6, idx + 6 + 10);
						yin = yin.substring(0, yin.indexOf("</"));
						if (pinyin == null) {
							if (yin != null && yin.length() > 0) {
								pinyin = yin;
							}
						} else if (!pinyin.equals(yin)) {
							pinyin = pinyin + " | " + yin;
						}
					} else if (line.contains("cizu") && !knowit) {
						String str = line.substring(line.indexOf("cizu") + 4);
						buffer.append("\t"
								+ str.subSequence(str.indexOf(">") + 1,
										str.indexOf("<")));
						knowit = true;
						buffer.append("\t-1 ");
					} else if (line.contains("js211") && line.contains("①")) {
						if (line.contains("～")) {
							meaning = line.substring(line.indexOf("～"));
							if (meaning.contains("|")) {
								meaning = meaning.substring(0,
										meaning.indexOf("|"));
							} else if (meaning.contains("。")) {
								meaning = meaning.substring(0,
										meaning.indexOf("。"));
							} else if (meaning.contains("）")) {
								meaning = meaning.substring(0,
										meaning.indexOf("）"));
							} else {
								meaning = "-";
							}
						} else {
							meaning = "-";
						}
					}
				}

				if (reader != null) {
					reader.close();
				}

				if (knowit == false) {
					if (hasBackup && meaning == null && backupMeaning != null) {
						buffer.append("\t" + backupMeaning.trim());
					} else {
						buffer.append("\t" + meaning);
					}
					buffer.append("\t-1");
				}

				buffer.append("\t" + pinyin);
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (httpclient != null) {
				httpclient.getConnectionManager().shutdown();
			}
		}

		return buffer.toString();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(
				new FileReader(
						new File(
								"/home/null/workspace/programming/java/src/com/gmail/dailyefforts/gb2312/gb2312-hanzi-vertical")));
		BufferedWriter writer = new BufferedWriter(
				new FileWriter(
						"/home/null/workspace/programming/java/src/com/gmail/dailyefforts/gb2312/gb2312-hanzi-dictionary"));

		String line = null;
		String explain = null;

		int count = 0;
		while ((line = reader.readLine()) != null) {
			Character c = Character.valueOf(line.charAt(0));
			explain = null;
			try {
				explain = ff(String.valueOf(c));
			} catch (Exception e) {
			}
			if (explain == null) {
				explain = String.valueOf(c);
			}
			writer.write(explain);
			writer.newLine();
			System.out.println(explain + "\t\t" + count);
			count++;
		}
		reader.close();
		writer.close();
	}

	private static String fetch(String hanzi) {
		String url = null;
		HttpClient httpclient = new DefaultHttpClient();
		HttpGet httpget = new HttpGet("http://hanyu.iciba.com/hy/" + hanzi);
		HttpResponse response;
		try {
			response = httpclient.execute(httpget);
			HttpEntity entity = response.getEntity();
			if (entity != null) {
				InputStream instream = entity.getContent();
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(instream));
				String line = null;
				while ((line = reader.readLine()) != null) {
					if (!line.contains("/hanzi/")) {
						break;
					}
					url = "http://hanyu.iciba.com/"
							+ line.substring(line.indexOf("/hanzi/"),
									line.indexOf("shtml") + 5);
				}

				if (reader != null) {
					reader.close();
				}

			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (httpclient != null) {
				// When HttpClient instance is no longer needed,
				// shut down the connection manager to ensure
				// immediate deallocation of all system resources
				httpclient.getConnectionManager().shutdown();
			}
		}
		return url;
	}
}
