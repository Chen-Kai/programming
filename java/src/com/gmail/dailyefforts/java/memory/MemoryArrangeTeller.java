package com.gmail.dailyefforts.java.memory;

public class MemoryArrangeTeller {

	/**
	 * The string "MemoryArrangeTeller" will be placed directly in the program
	 * code (<b>constant storage</b>).</br>
	 */
	public static final String TAG = "MemoryArrangeTeller";

	public void func() {
		
		// The local variable "time" will be placed on stack
		long time = System.currentTimeMillis();
		
		// 1. The object created by "new Thread()" is placed in heap
		// 2. The object reference "t" will is placed on stack
		Thread t = new Thread();
		
	}
	
}
