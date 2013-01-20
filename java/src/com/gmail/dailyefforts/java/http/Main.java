package com.gmail.dailyefforts.java.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.HttpVersion;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHttpRequest;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.util.EntityUtils;

import com.sun.org.apache.regexp.internal.recompile;

public class Main {
	public static void main(String[] args) throws Exception {
		// request();
		// response();
		// header();
		// testStringEntity();
//		testHttpClient();
		testURIBuilder();
	}

	private static void testURIBuilder() throws URISyntaxException {
		URIBuilder builder = new URIBuilder();
		builder.setScheme("http");
		builder.setHost("www.baidu.com");
		builder.setPath("/");
		builder.setParameter("key", "value");
		builder.setParameter("callback", "https://github.com/DailyEfforts/");
		
		URI uri = builder.build();
		HttpGet httpGet = new HttpGet(uri);
		
		System.out.println(httpGet.getURI());
	}

	private static void testHttpClient() throws IOException,
			ClientProtocolException {
		HttpClient httpclient = new DefaultHttpClient();
		HttpGet httpget = new HttpGet("http://www.google.com.hk/");
		HttpResponse response = httpclient.execute(httpget);
		HttpEntity entity = response.getEntity();
		if (entity != null) {
			InputStream instream = entity.getContent();
			try {
				BufferedReader reader = new BufferedReader(new InputStreamReader(instream));
				String line = null;
				while ((line = reader.readLine()) != null) {
					System.out.println(line);
				}
			} finally {
				instream.close();
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
