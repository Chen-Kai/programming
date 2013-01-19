package com.gmail.dailyefforts.designpattern.listener;

import java.util.ArrayList;

public class Button implements IEventSource {

	private ArrayList<IListener> mListenerList;

	public Button() {
		super();
		mListenerList = new ArrayList<IListener>();
	}

	@Override
	public void add(IListener aListener) {
		mListenerList.add(aListener);
	}

	@Override
	public void remove(IListener aListener) {
		mListenerList.remove(aListener);
	}

	@Override
	public void notifyListeners() {
		for (int i = 0; i < mListenerList.size(); i++) {
			mListenerList.get(i).handleEvent();
		}
	}

	@Override
	public void stateChanged() {
		notifyListeners();
	}

}
