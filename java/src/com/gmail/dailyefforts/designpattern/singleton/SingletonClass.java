package com.gmail.dailyefforts.designpattern.singleton;

public class SingletonClass {

	private static final SingletonClass mSingleton = new SingletonClass();

	/** Don't let anyone else instantiate this class */
	private SingletonClass() {
	}

	public static SingletonClass getInstance() {
		return mSingleton;
	}

}
