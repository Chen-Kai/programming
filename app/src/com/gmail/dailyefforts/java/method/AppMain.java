package com.gmail.dailyefforts.java.method;

import com.sun.istack.internal.Nullable;

public class AppMain {
	public static void main(String[] args) {
		String str = "abc";
		System.out.println(func(str));
	}

	// Using @Nullable to reject null.
	private static int func(@Nullable Object o) {
		return o.hashCode();
	}
}
