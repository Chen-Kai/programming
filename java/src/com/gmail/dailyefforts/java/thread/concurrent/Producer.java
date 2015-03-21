package com.gmail.dailyefforts.java.thread.concurrent;

public class Producer implements Runnable {

	private final Data mData;

	public Producer(final Data data) {
		mData = data;
	}

	@Override
	public void run() {
		mData.increase();
	}

}
