package com.gmail.dailyefforts.java.thread;

class 员工 implements Runnable {

	public String 名字;

	public 员工(String 名字) {
		this.名字 = 名字;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("员工.run() -- "
					+ Thread.currentThread().getName() + ", " + i);
		}
	}

}

public class AppMain {
	public static void main(String[] args) {
		员工 小张 = new 员工("小张");
		Thread 线程 = new Thread(小张);
		线程.setName(小张.名字);
		线程.start();

		for (int i = 0; i < 10; i++) {
			员工 一个员工 = new 员工("员工" + i);
			Thread 一个线程 = new Thread(一个员工);
			一个线程.setName(一个员工.名字);
			一个线程.start();
		}
	}
}
