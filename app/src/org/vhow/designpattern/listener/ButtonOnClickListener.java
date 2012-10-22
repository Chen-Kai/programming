package org.vhow.designpattern.listener;

public class ButtonOnClickListener implements IListener {

	private String mName;

	public ButtonOnClickListener(String name) {
		super();
		this.mName = name;
	}

	@Override
	public void handleEvent() {
		System.out.println(this.mName + " knows the event now");
	}

}