package com.gmail.dailyefforts.oo.object;

/**
 * An object consists: </br> 1. state(s) </br> 2. behavior(s)
 */
public class DesktopLamp {

	private boolean state;

	public DesktopLamp() {
		this(false);
	}

	public DesktopLamp(boolean initState) {
		state = initState;
	}

	public boolean getState() {
		return state;
	}

	public void turnOn() {
		state = true;
	}

	public void turnOff() {
		state = false;
	}
}
