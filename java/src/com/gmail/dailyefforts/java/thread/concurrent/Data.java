package com.gmail.dailyefforts.java.thread.concurrent;

public class Data {
	private int mValue;

	public synchronized void increase() {
		int tmp = mValue;
		print(Thread.currentThread() + " gonna increase it: " + mValue);
		tmp++;
		sleep(1000);
		mValue = tmp;
		print(Thread.currentThread() + " increased it by 1. " + mValue);
	}

	public synchronized void decrease() {
		int tmp = mValue;
		print(Thread.currentThread() + " gonna decrease it: " + mValue);
		tmp--;
		sleep(1000);
		mValue = tmp;
		print(Thread.currentThread() + " decreased it by 1. " + mValue);
	}

	public int getValue() {
		return mValue;
	}

	private void sleep(long millis) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void print(final String str) {
		System.out.println(str);
	}

}
