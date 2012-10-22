package org.vhow.designpattern.singleton;

public class LazySingleton {
	
	private static LazySingleton mSingleton = null;
	
	private LazySingleton() {
		// Do nothing here.
	}
	
	synchronized public static LazySingleton getInstance() {
		if (mSingleton == null) {
			mSingleton = new LazySingleton();
		}
		
		return mSingleton;
	}
	
}
