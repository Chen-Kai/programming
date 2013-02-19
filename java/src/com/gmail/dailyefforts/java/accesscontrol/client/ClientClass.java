package com.gmail.dailyefforts.java.accesscontrol.client;

import java.util.Arrays;

import com.gmail.dailyefforts.java.accesscontrol.lib.LibClass;

public class ClientClass {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(LibClass.VALUES_PUBLIC)); // [1, 2, 3]
		LibClass.VALUES_PUBLIC[0] = 0;
		System.out.println(Arrays.toString(LibClass.VALUES_PUBLIC)); // [0, 2, 3]

		System.out.println(Arrays.toString(LibClass.getValues())); // [1, 2, 3]
		LibClass.getValues()[0] = 0;
		System.out.println(Arrays.toString(LibClass.getValues())); // [1, 2, 3]

	}
}
