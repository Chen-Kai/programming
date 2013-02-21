package com.gmail.dailyefforts.java.exception;

import java.util.Random;

public class AppMain {
	public static void main(String[] args) {
		System.out.println(testException());
	}

	/**
	 * This method always returns 3.
	 * @return 3
	 */
	private static int testException() {
		try {
			System.out.println("try");
			if ((new Random().nextInt() & 1) != 0) {
				throw new NullPointerException("Null Pointer!");
			}
			return 1;
		} catch (Exception e) {
			System.out.println("catch");
			return 2;
		} finally {
			System.out.println("finally");
			return 3;
		}
	}
}
