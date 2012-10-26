package com.gmail.dailyefforts.designpattern.factory;

public class PhoneFactory {
	public Phone makePhone(String modelName) {
		Phone aPhone = null;

		if (modelName.equals(Wildfire.MODEL_NAME)) {
			aPhone = new Wildfire();
		} else if (modelName.equals(Milestone.MODEL_NAME)) {
			aPhone = new Milestone();
		}

		return aPhone;
	}
}
