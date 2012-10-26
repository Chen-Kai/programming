package com.gmail.dailyefforts.designpattern.listener;

public class AppMain {

	public static void main(String[] args) {

		// depends on abstract class or interface
		IEventSource eventSource = new Button();

		IListener listenerA = new ButtonOnClickListener("ListenerA");
		IListener listenerB = new ButtonOnClickListener("ListenerB");
		IListener listenerC = new ButtonOnClickListener("ListenerC");

		eventSource.add(listenerA);
		eventSource.add(listenerB);
		eventSource.add(listenerC);

		eventSource.stateChanged();
	}

}
