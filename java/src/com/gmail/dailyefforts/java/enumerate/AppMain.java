package com.gmail.dailyefforts.java.enumerate;

enum Level {
	A, B, C
}

public class AppMain {
	

	public static void main(String[] args) {

		int num = Level.values() == null ? 0 : Level.values().length;

		System.out.println(String.format("There %s %d %s.", num > 1 ? "are"
				: "is", num, num > 1 ? "levels" : "level"));

		// Step through the enum.
		for (Level level : Level.values()) {

			// Get enum constant name.
			String name = level.name();

			// Get index of a enum object.
			int ordinal = level.ordinal();
			
			System.out.println(String.format("%s(%d)", name, ordinal));

		}

	}

}
