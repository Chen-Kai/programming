package com.gmail.dailyefforts.java.thread;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpInfo {
	public static void main(String[] args) throws Exception {
		showInetInfo();
	}

	private static void showInetInfo() throws UnknownHostException, IOException {
		InetAddress ip = InetAddress.getLocalHost();
		final String ipAddr = ip.getHostAddress();
		final String pcName = ip.getHostName();
		final boolean isReachable = ip.isReachable(5 * 1000);
		System.out.println("IP��ַ: " + ipAddr);
		System.out.println("PC��ַ: " + pcName);
		System.out.println("�Ƿ�����ӱ�����" + isReachable);
		final InetAddress googleIp = ip.getByName("google.com.hk");
		System.out.println("Google IP: " + googleIp);
	}
}
