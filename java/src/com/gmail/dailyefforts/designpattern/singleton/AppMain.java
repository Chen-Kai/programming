package com.gmail.dailyefforts.designpattern.singleton;

public class AppMain {
	public static void main(String[] args) {
		
		Sun eagerSingleton1 = Sun.getInstance();
		Sun eagerSingleton2 = Sun.getInstance();
		System.out.println(eagerSingleton1.hashCode());
		System.out.println(eagerSingleton2.hashCode());
		
		Moon singletonFixed1 = Moon.INSTANCE;
		Moon singletonFixed2 = Moon.INSTANCE;
		System.out.println(singletonFixed1.hashCode());
		System.out.println(singletonFixed2.hashCode());
		
		LazySingleton lazySingleton1 = LazySingleton.getInstance();
		LazySingleton lazySingleton2 = LazySingleton.getInstance();
		System.out.println(lazySingleton1.hashCode());
		System.out.println(lazySingleton2.hashCode());
		
	}
}
