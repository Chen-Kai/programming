package com.gmail.dailyefforts.algrithm.finder;

import java.util.Arrays;
import java.util.Random;

public class BinSearcher {
	private static final int UNFINDED = -1;
	public static final int RANGE = 20;

	/**
	 * Look for the key in sorted array.
	 * 
	 * @param array
	 *            The array that we look for the key from.
	 * @param key
	 *            The key to look for.
	 * @return The index of the key in the array if found, -1 otherwise.
	 */
	public static int go(final int[] array, int key) {
		int index = UNFINDED;
		int low = 0;
		int high = array.length - 1;
		int mid = (low + high) >>> 1;

		while (low <= high) {
			mid = (low + high) >>> 1;

			if (array[mid] > key) {
				high = mid - 1;
			} else if (array[mid] < key) {
				low = mid + 1;
			} else {
				index = mid;
				break;
			}
		}

		return index;
	}

	private static void insertSort(int[] array) {
		int tmp = array[1];
		for (int i = 1; i < array.length; i++) {
			tmp = array[i];
			int j = i - 1;

			while (j >= 0) {
				if (array[j] > tmp) {
					array[j + 1] = array[j];
					j--;
				} else {
					break;
				}
			}
			

			array[++j] = tmp;
		}
	}

	// test
	public static void main(String[] args) {
		int[] array = new int[RANGE];
		Random random = new Random(System.currentTimeMillis());
		for (int i = 0; i < RANGE; i++) {
			array[i] = random.nextInt(RANGE);
		}

		System.out.println(Arrays.toString(array));
		insertSort(array);
		System.out.println(Arrays.toString(array));

		int key = random.nextInt(RANGE);
		int index = UNFINDED;
		if ((index = go(array, key)) == UNFINDED) {
			System.out.println(String.format(
					"Did not find the key (%d)", key));
		}  else {
			
			System.out.println(String.format(
					"Find the key (%d) at arr[%d], arr[%d] == %d", key, index,
					index, array[index]));
		}

	}
}
