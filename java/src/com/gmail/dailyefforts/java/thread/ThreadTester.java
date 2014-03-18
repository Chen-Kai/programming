package com.gmail.dailyefforts.java.thread;

class 工人 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("工人.run() " + Thread.currentThread().getName());
		}
	}

}

public class ThreadTester {
	public static void main(String[] args) {
		工人 target = new 工人();
		Thread t1 = new Thread(target, "t1111");
		Thread t2 = new Thread(target, "t2222");
		Thread t3 = new Thread(target, "t3333");
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("ThreadTester.main() " + Thread.currentThread().getName());
	}
}
