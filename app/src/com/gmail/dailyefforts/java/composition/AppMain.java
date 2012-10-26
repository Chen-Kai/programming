package com.gmail.dailyefforts.java.composition;

public class AppMain {
	public static void main(String[] args) {
		MyIntegerBox myIntegerBox = new MyIntegerBox();
		myIntegerBox.putInt(-1);
		
		IntegerBox integerBox = new IntegerBox();
		integerBox.putInt(-1);
		
		System.out.println("AppMain.main()" + myIntegerBox.getIntNum());
		System.out.println("AppMain.main()" + integerBox.getIntNum());
	}
}
