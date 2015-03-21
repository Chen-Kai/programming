package com.gmail.dailyefforts.java.thread.concurrent;

public class Consumer implements Runnable {

	private final Data mData;

	public Consumer(final Data data) {
		mData = data;
	}

	@Override
	public void run() {
		mData.decrease();
	}

}
