package com.gmail.dailyefforts.java.base;

import java.lang.reflect.Method;


public class JavaMethod {
	public void publicMethod() {

	}

	void defaultMethod() {

	}

	public static void main(String[] args) {
		for (Method m : JavaMethod.class.getDeclaredMethods()) {
			System.out.println(m.getModifiers() + " " + m.getName());
		}
	}

}
