package com.gmail.dailyefforts.java.accesscontrol.lib;


public class LibClass {
	/**
	 * This statement is wrong, the clients can modify the content of this
	 * array.
	 */
	public static final int[] VALUES_PUBLIC = { 1, 2, 3 };

	private static final int[] VALUES_PRIVATE = { 1, 2, 3 };

	public static final int[]  getValues() {
		return VALUES_PRIVATE.clone();
	}
}
