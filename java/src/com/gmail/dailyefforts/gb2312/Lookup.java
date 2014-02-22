package com.gmail.dailyefforts.gb2312;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class Lookup {
	
	private static String ff() {

		StringBuffer buffer = new StringBuffer();
		HttpClient httpclient = new DefaultHttpClient();
		String url = fetch(hanzi);
		HttpGet httpget = new HttpGet(url);
		HttpResponse response;
		response = httpclient.execute(httpget);
		HttpEntity entity = response.getEntity();
		if (entity != null) {
			InputStream instream = entity.getContent();
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					instream));
			String line = null;

			buffer.append(hanzi);

			Pattern pattern = Pattern.compile("\\[(.*?)\\]");
			Pattern pattern2 = Pattern.compile("：(.*?)～(.*?)[。！？]");
			Pattern pattern3 = Pattern.compile("〔(.*?)〕");
			Matcher matcher = null;

			String pinyin = null;
			String meaning = "-";
			while ((line = reader.readLine()) != null) {
				line = line.trim();
				if (line.contains(String.format("<strong>%s</strong>", hanzi))) {
					matcher = pattern.matcher(line);
					while (matcher.find()) {
						String group = matcher.group();
						if (pinyin == null) {
							pinyin = group;
						} else {
							pinyin = pinyin + group;
						}
					}
				} else if (line.contains("dict-cn-basicmean-char")) {
					matcher = pattern3.matcher(line);

					if (matcher.find()) {
						String group = matcher.group();
						if (group != null && group.length() > 3) {
							meaning = group.substring(1, group.length() - 1);
							break;
						}
					}
					matcher = pattern2.matcher(line);
					if (matcher.find()) {
						String group = matcher.group();
						if (group != null && group.length() > 3) {
							meaning = group.substring(1, group.length() - 1);
						}
					}
					break;
				}
			}

			buffer.append("\t" + meaning);

			buffer.append("\t" + "-1");

			buffer.append("\t" + pinyin);

			if (reader != null) {
				reader.close();
			}
		}

		if (httpclient != null) {
			httpclient.getConnectionManager().shutdown();
		}
		return buffer.toString();
	
	}
	public static void main(String[] args) {
		
	}

}
