package org.vhow.java.math;

public class AppMain {
	private final long from = 1;
	private final long to = 100 * 100 * 100 * 100;

	public static void main(String[] args) {
		new AppMain().go();
	}

	private void go() {
		DiligentStudent jhon = new DiligentStudent("DiligentStudent");
		CleverStudent marry = new CleverStudent("CleverStudent");

		jhon.start();
		marry.start();
	}

	class CleverStudent extends Thread {

		public CleverStudent(String name) {
			this.setName(name);
		}

		@Override
		public void run() {
			long tiemStart = getStartTime(this);
			long sum = 0L;
			sum = to * (to + 1) / 2;
			printResult(this, tiemStart, sum);
		}

	}

	class DiligentStudent extends Thread {
		public DiligentStudent(String name) {
			this.setName(name);
		}

		@Override
		public void run() {
			long tiemStart = getStartTime(this);
			long sum = 0L;
			for (long i = from; i <= to; i++) {
				sum += i;
			}
			printResult(this, tiemStart, sum);
		}
	}

	private long getStartTime(Thread t) {
		long timeStart = System.currentTimeMillis();
		System.out.println(t.getName() + " started at "
				+ System.currentTimeMillis());
		return timeStart;
	}

	private void printResult(Thread t, long tiemStart, long sum) {
		System.out.println(t.getName() + " done! sum is: " + sum
				+ ", and elapsed time is: "
				+ (System.currentTimeMillis() - tiemStart) + "ms");
	}
}
