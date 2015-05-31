package com.gmail.dailyefforts.support;

public class Watch {
    private final long start;

    public Watch() {
        start = System.currentTimeMillis();
    }

    public void time() {
        System.out.println("Time: " + (System.currentTimeMillis() - start));
    }
    
    public static void main(String[] args) {
		Watch watch = new Watch();
		watch.time();
	}
}
