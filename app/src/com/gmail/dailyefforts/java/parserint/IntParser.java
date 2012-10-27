package com.gmail.dailyefforts.java.parserint;

public class IntParser {
	public static int parseHexToInt(String hexString) {
		return Integer.parseInt(hexString, 16);
	}
	public static int decode(String str) {
		return Integer.decode(str);
	}
}
