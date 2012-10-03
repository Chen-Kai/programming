package org.vhow.android.basic.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class InputMethodChangedEventReceiver extends BroadcastReceiver {

	private static final String TAG = "InputMethodChangedEventReceiver";

	@Override
	public void onReceive(Context context, Intent intent) {
		Log.d(TAG,
				"InputMethodChangedEventReceiver knows that the input method has been changed.");
	}

}
