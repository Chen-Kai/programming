package com.gmail.dailyefforts.designpattern.singleton;

public class SingletonFixed {

	public static final SingletonFixed INSTANCE = new SingletonFixed();

	/** Don't let anyone else instantiate this class */
	private SingletonFixed() {
	}

}
