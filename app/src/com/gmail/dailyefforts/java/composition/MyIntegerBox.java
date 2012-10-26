package com.gmail.dailyefforts.java.composition;

public class MyIntegerBox extends IntegerBox {
	private int mPositiveIntegerNum;

	@Override
	public void putInt(int i) {
		if (i > 0) {
			mPositiveIntegerNum++;
		}
		super.putInt(i);
	}
}
