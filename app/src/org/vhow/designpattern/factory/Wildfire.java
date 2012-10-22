package org.vhow.designpattern.factory;

public class Wildfire extends Phone {
	public static final String MODEL_NAME = "Wildfire";

	@Override
	public void makePhoneCall() {
		System.out.println("Wildfile.makePhoneCall()");
	}

}
