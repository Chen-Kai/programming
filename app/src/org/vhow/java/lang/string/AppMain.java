package org.vhow.java.lang.string;

public class AppMain {
	public static void main(String[] args) {
		// Let compiler create a String object with the value "hello"
		String str = "hello java string";

		// Get the length of the String
		int len = str.length();

		char[] charArr = new char[len];

		// Get the index within this string of the first occurrence of the
		// specified character
		int idx = str.indexOf('j');

		// Copies characters from this string into the destination character
		// array.
		str.getChars(idx, len, charArr, 0);

		for (int i = 0; i < charArr.length; i++) {
			System.out.println("charArr[" + i + "] == " + charArr[i]);
		}
		
		float height = 1.72F;
		
		// Returns a formatted string using the specified format string and arguments.
		String formatHeight = String.format("%.3f", height);
		
		System.out.println("formatHeight: " + formatHeight);
		
		// Returns a Float object holding the float value represented by the argument string s.
		Float f = Float.valueOf("0.68");
		
		// Returns the float value of this Float object.
		f.floatValue();
		
		float f2 = 0.32F;
		System.out.println(f + f2);
		
		// Print Unicode of a char
		str = "a";
		String unicodeStr = String.format("0X%04X", str.codePointAt(0));
		System.out.println("The unicode of " + str + " is: " + unicodeStr);
	}
}
