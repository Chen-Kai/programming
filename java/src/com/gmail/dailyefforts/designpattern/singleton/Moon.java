package com.gmail.dailyefforts.designpattern.singleton;

public class Moon {

	public static final Moon INSTANCE = new Moon();

	/** Don't let anyone else instantiate this class */
	private Moon() {
	}

}
