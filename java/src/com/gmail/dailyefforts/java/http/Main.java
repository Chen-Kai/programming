package com.gmail.dailyefforts.java.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHttpRequest;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.util.EntityUtils;

import com.sun.org.apache.regexp.internal.recompile;

public class Main {
	public static void main(String[] args) throws Exception {
//		request();
//		response();
//		header();
//		testStringEntity();
		HttpClient client = new DefaultHttpClient();
		HttpGet httpGet = new HttpGet("http://weibo.com/?retcode=6102");
		String name = "name";
		HttpResponse response = client.execute(httpGet);
		HttpEntity entity = response.getEntity();
		if (entity != null) {
			InputStream is = entity.getContent();
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
			if (reader != null) {
				reader.close();
			}
		}
		
	}

	private static void testStringEntity() throws UnsupportedEncodingException,
			IOException {
		StringEntity myEntity = new StringEntity("important message", "UTF-8");
		System.out.println(myEntity.getContentType());
		System.out.println(myEntity.getContentLength());
		System.out.println(EntityUtils.getContentCharSet(myEntity));
		System.out.println(EntityUtils.toString(myEntity));
		System.out.println(EntityUtils.toByteArray(myEntity).length);
	}

	private static void header() {
		System.out.println("\nMain.header()  ==================  ");
		HttpResponse response = new BasicHttpResponse(HttpVersion.HTTP_1_1,
				HttpStatus.SC_OK, "OK");
		response.addHeader("Set-Cookie", "c1=a; path=/; domain=localhost");
		response.addHeader("Set-Cookie",
				"c2=b; path=\"/\", c3=c; domain=\"localhost\"");
		Header h1 = response.getFirstHeader("Set-Cookie");
		System.out.println(h1);
		Header h2 = response.getLastHeader("Set-Cookie");
		System.out.println(h2);
		Header[] hs = response.getHeaders("Set-Cookie");
		System.out.println(hs.length);
	}

	private static void request() {
		System.out.println("\nMain.request() ================== ");
		HttpRequest request = new BasicHttpRequest("GET", "/",
				HttpVersion.HTTP_1_1);
		System.out.println(request.getRequestLine().getMethod());
		System.out.println(request.getRequestLine().getUri());
		System.out.println(request.getProtocolVersion());
		System.out.println(request.getRequestLine().toString());
	}

	private static void response() {
		System.out.println("\nMain.response()  ==================  ");
		HttpResponse response = new BasicHttpResponse(HttpVersion.HTTP_1_1,
				HttpStatus.SC_OK, "OK");
		System.out.println(response.getProtocolVersion());
		System.out.println(response.getStatusLine().getStatusCode());
		System.out.println(response.getStatusLine().getReasonPhrase());
		System.out.println(response.getStatusLine().toString());
	}
}
