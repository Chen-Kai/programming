package org.vhow.java.thread;

public class Task implements Runnable {
	@Override
	public void run() {
		System.out.println("Task.run()");
	}
}
