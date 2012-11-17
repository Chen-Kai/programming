package com.gmail.dailyefforts.algrithm.array;

import java.util.Arrays;

public class ArrayHandler {
	/**
	 * Reverse all the elements within an array.
	 * 
	 * @param array
	 *            The origin array.
	 */
	public static void reverseArray(Object[] array) {
		int n = array.length;
		for (int i = 0; i < n / 2; i++) {
			Object tmp = array[i];
			array[i] = array[(n - 1) - i];
			array[(n - 1) - i] = tmp;
		}
	}

	public static void main(String[] args) {
		Integer[] arr = new Integer[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		System.out.println("before: " + Arrays.toString(arr));
		ArrayHandler.reverseArray(arr);
		System.out.println("after : " + Arrays.toString(arr));
	}
}
