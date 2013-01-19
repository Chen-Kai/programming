package com.gmail.dailyefforts.java.generic;

public class AppMain {
	public static void main(String[] args) {
		// You can only put the get the String object
		Box<String> aBox = new Box<String>();
		aBox.put("abc");
		System.out.println("AppMain.main() " + aBox.get());
//		Integer it = (Integer) anBox.get(); // Compile error is easy to fix
		
	}
}
