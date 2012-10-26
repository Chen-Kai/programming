package com.gmail.dailyefforts.datastructure;

public class AppMain {
	public static void main(String[] args) {
		SingleLinkedList<String> list = new SingleLinkedList<String>();
		System.out.println("AppMain.main() " + list.getSize() + list.toString());
		for (int i = 0; i < 20; i++) {
			list.add(String.valueOf(i));
		}
		System.out.println("AppMain.main() " + list.getSize() + list.toString());
		
	}
}
