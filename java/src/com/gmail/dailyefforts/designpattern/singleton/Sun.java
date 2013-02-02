package com.gmail.dailyefforts.designpattern.singleton;

public class Sun {

	private static final Sun INSTANCE = new Sun();

	/** Don't let anyone else instantiate this class */
	private Sun() {
	}

	public static Sun getInstance() {
		return INSTANCE;
	}

}
