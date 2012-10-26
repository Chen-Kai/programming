package com.gmail.dailyefforts.designpattern.factory;

public class AppMain {

	public static void main(String[] args) {
		PhoneFactory aPhoneFactory = new PhoneFactory();
		PhoneStore aPhoneStore = new PhoneStore(aPhoneFactory);

		Phone aPhone = aPhoneStore.orderPhone(Wildfire.MODEL_NAME);
		aPhone.makePhoneCall();
		
		aPhone = aPhoneStore.orderPhone(Milestone.MODEL_NAME);
		aPhone.makePhoneCall();
	}
}
