package com.gmail.dailyefforts.designpattern.singleton;

public class AppMain {
	public static void main(String[] args) {
		
		EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
		
		EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
		
		System.out.println(eagerSingleton1.hashCode());
		System.out.println(eagerSingleton2.hashCode());
		
		LazySingleton lazySingleton1 = LazySingleton.getInstance();
		LazySingleton lazySingleton2 = LazySingleton.getInstance();
		System.out.println(lazySingleton1.hashCode());
		System.out.println(lazySingleton2.hashCode());
	}
}
