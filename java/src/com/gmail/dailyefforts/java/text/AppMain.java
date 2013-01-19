package com.gmail.dailyefforts.java.text;

public class AppMain {

	public static void main(String[] args) {

		CharSequence a = "a";

		// Get the unicode of 'a'
		int unicode = Character.codePointAt(a, 0);

		System.out.println("AppMain.main() unicode: 0X"
				+ Integer.toHexString(unicode));

	}

}
