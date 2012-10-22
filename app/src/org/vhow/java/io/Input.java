package org.vhow.java.io;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input.main() " + "enter a string in the next line: ");
		String str = scanner.next();
		System.out.println("Input.main() " + str);
	}
}
