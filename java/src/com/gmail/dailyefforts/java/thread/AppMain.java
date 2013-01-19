package com.gmail.dailyefforts.java.thread;

public class AppMain {
	public static void main(String[] args) {
//		testTask();
		taskTaskConcurrent();
	}

	private static void testTask() {
		Thread t1 = new Thread(new Task());
		t1.start();

		System.out.println("Maint thread is running");
	}
	
	private static void taskTaskConcurrent() {
//		Thread t1 = new Thread(new TaskConcrrent());
//		t1.setName("abc");
//		t1.start();
//		
//		Thread t2 = new Thread(new TaskConcrrent());
//		t1.setName("t2");
//		t2.start();
//
//		System.out.println("Maint thread is running");
	}
}
