import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.gmail.dailyefforts.princeton.PdfDownloader;

public class App {
	public static final String PATTERN = "http://pic.nipic.com/2007-06-20/[0-9_]{9,}.jpg";

	private List<String> parseUrl(String addr) {
		BufferedReader reader = null;
		List<String> list = new ArrayList<String>();
		HttpURLConnection conn = null;
		try {
			URL url = new URL(addr);
			conn = (HttpURLConnection) url.openConnection();
			conn.setConnectTimeout(20 * 1000);
			final int responseCode = conn.getResponseCode();
			if (responseCode == HttpURLConnection.HTTP_OK) {
				reader = new BufferedReader(new InputStreamReader(
						conn.getInputStream()));
				Pattern pattern = Pattern.compile(PATTERN);
				Matcher matcher = null;
				for (String line = reader.readLine(); line != null; line = reader
						.readLine()) {
					matcher = pattern.matcher(line);
					if (matcher.find()) {
						String group = matcher.group();
						list.add(group);
//						System.out.println("App.parseUrl() " + group);
					}
				}
			} else {
				System.err.println("responseCode: " + responseCode);
			}
			conn.disconnect();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				conn.disconnect();
			}
		}
		return list;
	}

	public void download(final String addr) {
		List<String> fileNames = parseUrl(addr);
		ExecutorService pool = Executors.newCachedThreadPool();
		for (final String fileName : fileNames) {
			pool.execute(new Runnable() {
				@Override
				public void run() {
					download(addr, fileName);
				}
			});
		}
		pool.shutdown();
	}
	
	static int count = 1;

	private void download(String baseUrl, String fileName) {
//		System.out.println("App.download() " + fileName + ", " + (count++));
//		
//		if (true) {
//			return;
//		}
		
		HttpURLConnection conn = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			URL url = new URL(fileName);
//			System.out.println("App.download(***) " + fileName);
			conn = (HttpURLConnection) url.openConnection();
			conn.setConnectTimeout(20 * 1000);
			bis = new BufferedInputStream(conn.getInputStream());
			File dir = new File("e:/tmp/");
			fileName = (count++) + ".jpg";
			System.out.println("App.download() " + fileName);
			final File file = new File(dir, fileName);
			if (file.exists()) {
				return;
			}
			bos = new BufferedOutputStream(new FileOutputStream(file));
			// 10 KB
			byte[] buf = new byte[10 * 1024];
			for (int len = bis.read(buf); len != -1; len = bis.read(buf)) {
				System.out.println(file + ", " + len);
				bos.write(buf, 0, len);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (SocketTimeoutException e) {
			// try again
			download(baseUrl, fileName);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bis != null) {
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bos != null) {
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				conn.disconnect();
			}
		}
	}

	public static void main(String[] args) throws Exception {
		final App downloader = new App();
		List<String> urls = new ArrayList<String>();
		urls.add("http://www.nipic.com/zhuanti/213_1.html");
		urls.add("http://www.nipic.com/zhuanti/213_2.html");
		// http://www.nipic.com/show/9576.html
		// http://www.nipic.com/show/9537.html
		
		
		for (String url : urls) {
			downloader.download(url);
		}
	}
}
