package com.gmail.dailyefforts.java.array;

import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		int [] a = {1, 2, 3};
		int [] b = new int [3];
		
		// Assigns the specified int value to each element of the specified array of ints.
		Arrays.fill(b, 0);
	
		System.out.println("ArrayDemo.main() " + Arrays.toString(b));
		
		// Creates an exact copy of an array.
		b = a.clone();
		
		System.out.println("ArrayDemo.main() " + Arrays.toString(b));
	}
}
