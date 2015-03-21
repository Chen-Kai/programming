package com.gmail.dailyefforts.java.thread;

class Downloader implements Runnable {
	@Override
	public void run() {
		while (true) {
			System.out.println("Downloader running: "
					+ Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Main {
	public static void main(String[] args) {
		final Downloader downloader = new Downloader();
		final Thread t1 = new Thread(downloader, "thread to download file-1");
		final Thread t2 = new Thread(downloader, "thread to download file-2");
		final Thread t3 = new Thread(downloader, "thread to download file-3");
		t1.start();
		t2.start();
		t3.start();
	}
}
