package com.gmail.dailyefforts.princeton;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PdfDownloader {

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
                reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                Pattern pattern = Pattern.compile("\\d+[a-zA-Z0-9_\\-x]+.pdf");
                Matcher matcher = null;
                for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                    matcher = pattern.matcher(line);
                    if (matcher.find()) {
                        list.add(matcher.group());
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

    public void download(String addr) {
        List<String> fileNames = parseUrl(addr);
        for (String fileName : fileNames) {
            System.out.println("downloading " + fileName);
            download(addr, fileName);
        }
    }

    private void download(String baseUrl, String fileName) {
        HttpURLConnection conn = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            URL url = new URL(baseUrl);
            conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(20 * 1000);
            bis = new BufferedInputStream(conn.getInputStream());
            File dir = new File("/home/null/Documents");
            final File file = new File(dir, fileName);
            if (file.exists()) {
                return;
            }
            bos = new BufferedOutputStream(new FileOutputStream(file));
            // 10 KB
            byte[] buf = new byte[10 * 1024];
            for (int len = bis.read(buf); len != -1; len = bis.read(buf)) {
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

    public static void main(String[] args) {
        final PdfDownloader downloader = new PdfDownloader();
        List<String> urls = new ArrayList<String>();
        urls.add("http://algs4.cs.princeton.edu/lectures/");
        urls.add("http://introcs.cs.princeton.edu/java/lectures/");
        for (String url : urls) {
            downloader.download(url);
        }
    }
}
