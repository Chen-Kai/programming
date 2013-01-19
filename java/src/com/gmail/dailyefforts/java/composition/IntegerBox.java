package com.gmail.dailyefforts.java.composition;

import java.util.ArrayList;

public class IntegerBox {
	private ArrayList<Integer> mIntList;

	public IntegerBox() {
		mIntList = new ArrayList<Integer>();
	}

	// public void putInt(int i) {
	// if (mIntList != null) {
	// mIntList.add(i);
	// }
	// }
	public void putInt(int i) {
		if (mIntList != null) {
			if (i != -1) {
				mIntList.add(i);
			}
		}
	}

	public int getIntNum() {
		return mIntList.size();
	}
}
