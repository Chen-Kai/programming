package com.gmail.dailyefforts.java.thread.concurrent;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		final Data data = new Data();
		final Producer producer = new Producer(data);
		final Consumer consumer = new Consumer(data);
		Thread t1 = new Thread(producer, "t-producer");
		Thread t2 = new Thread(consumer, "t-consumer");
		System.out.println(Thread.currentThread() + ", " + data.getValue());
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(Thread.currentThread() + ", " + data.getValue());
	}

}
