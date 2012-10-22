package org.vhow.designpattern.singleton;

public class EagerSingleton {

	private static EagerSingleton mSingleton = new EagerSingleton();

	/** Don't let anyone else instantiate this class */
	private EagerSingleton() {
	}

	public static EagerSingleton getInstance() {
		return mSingleton;
	}

}
