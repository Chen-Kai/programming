package org.vhow.algrithm.sum;

public class SumCounter {

	public static long getSumStupidMethod(final int n) {
		
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum += i;
		}

		return sum;
		
	}

	public static long getSumSmarterMethod(final int n) {
		
		int sum = 0;

		sum = (1 + n) * n / 2;

		return sum;
		
	}
}
