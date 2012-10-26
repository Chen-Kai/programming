package com.gmail.dailyefforts.algrithm.sum;

public class SumCounter {

	/**
	 * The method uses the plain & straightforward algorithm to get the sum of 1
	 * + 2 + 3 ... + n.
	 * 
	 * @param n
	 *            The number to be added to.
	 * @return The sum of 1 + 2 + 3 + ... + n
	 */

	public static long getSumStupidMethod(final int n) {

		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += i; // This statement will be executed n times.
		}

		return sum;

	}

	/**
	 * The method uses a mathematical formula to get the sum of 1 + 2 + 3 ... +
	 * n. It's more efficient.
	 * 
	 * @param n
	 *            The number to be added to.
	 * @return The sum of 1 + 2 + 3 + ... + n
	 */

	public static long getSumSmarterMethod(final int n) {

		int sum = 0;

		sum = (1 + n) * n / 2;

		return sum;

	}
}
