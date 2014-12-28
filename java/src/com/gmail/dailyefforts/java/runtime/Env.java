package com.gmail.dailyefforts.java.runtime;

import java.util.Collection;
import java.util.Map;

public class Env {
	public static void main(String[] args) {
		Map<String, String> envMap = System.getenv();
		Collection<String> c = envMap.values();
		for (String name : c) {
			System.out.format("%s=%s%n", name, envMap.get(name));
		}
	}
}
