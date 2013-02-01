package com.gmail.dailyefforts.designpattern.singleton;

public class AppMain {
	public static void main(String[] args) {
		
		SingletonClass eagerSingleton1 = SingletonClass.getInstance();
		SingletonClass eagerSingleton2 = SingletonClass.getInstance();
		System.out.println(eagerSingleton1.hashCode());
		System.out.println(eagerSingleton2.hashCode());
		
		SingletonFixed singletonFixed1 = SingletonFixed.INSTANCE;
		SingletonFixed singletonFixed2 = SingletonFixed.INSTANCE;
		System.out.println(singletonFixed1.hashCode());
		System.out.println(singletonFixed2.hashCode());
		
		LazySingleton lazySingleton1 = LazySingleton.getInstance();
		LazySingleton lazySingleton2 = LazySingleton.getInstance();
		System.out.println(lazySingleton1.hashCode());
		System.out.println(lazySingleton2.hashCode());
		
	}
}
