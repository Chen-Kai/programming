package org.vhow.java.enumerate;

public class AppMain {
	enum Day {
		A, B, C
	}

	public static void main(String[] args) {
		System.out.println(Day.values().length);
		for (Day d : Day.values()) {
			System.out.println(d.ordinal());
		}
	}
}
