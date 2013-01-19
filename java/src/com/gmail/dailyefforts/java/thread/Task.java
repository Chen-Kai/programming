package com.gmail.dailyefforts.java.thread;

public class Task implements Runnable {
	@Override
	public void run() {
		System.out.println("Task.run()");
	}
}
