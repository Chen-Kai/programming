package com.gmail.dailyefforts.designpattern.listener;

public interface IEventSource {

	void add(IListener listener);

	void remove(IListener listener);

	void notifyListeners();

	void stateChanged();

}