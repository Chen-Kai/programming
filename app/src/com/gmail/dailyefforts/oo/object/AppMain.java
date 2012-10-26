package com.gmail.dailyefforts.oo.object;

public class AppMain {
	public static void main(String[] args) {
		DesktopLamp lamp = new DesktopLamp();
		System.out.println("AppMain.main() " + lamp.getState());
		lamp.turnOn();
		System.out.println("AppMain.main() " + lamp.getState());
		lamp.turnOff();
		System.out.println("AppMain.main() " + lamp.getState());
	}
}
