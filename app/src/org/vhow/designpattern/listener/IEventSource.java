package org.vhow.designpattern.listener;

public interface IEventSource {

	void add(IListener listener);

	void remove(IListener listener);

	void notifyListeners();

	void stateChanged();

}