package com.gmail.dailyefforts.designpattern.factory;

public class Milestone extends Phone {
	public static final String MODEL_NAME = "Milestone";

	@Override
	public void makePhoneCall() {
		System.out.println("Milestone.makePhoneCall()");
	}
}
