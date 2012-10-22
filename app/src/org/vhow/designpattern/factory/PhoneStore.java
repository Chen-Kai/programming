package org.vhow.designpattern.factory;

public class PhoneStore {
	private PhoneFactory mPhoneFactory;
	
	public PhoneStore(PhoneFactory factory) {
		super();
		this.mPhoneFactory = factory;
	}

	public Phone orderPhone(String modelName) {
		Phone aPhone = mPhoneFactory.makePhone(modelName);

		wrap(aPhone);
		return aPhone;
	}

	private void wrap(Phone aPhone) {
		// do sth here
	}
}
