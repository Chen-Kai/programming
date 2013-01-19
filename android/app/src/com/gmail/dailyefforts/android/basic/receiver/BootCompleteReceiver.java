package com.gmail.dailyefforts.android.basic.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BootCompleteReceiver extends BroadcastReceiver {

	private static final String TAG = "BootCompleteReceiver";

	@Override
	public void onReceive(Context context, Intent intent) {
		Log.d(TAG,
				"BootCompleteReceiver.onReceive() knows that the system is boot completed.");
	}

}
