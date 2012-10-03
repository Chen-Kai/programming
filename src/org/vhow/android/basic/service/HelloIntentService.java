package org.vhow.android.basic.service;

import android.app.IntentService;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class HelloIntentService extends IntentService {
	
	private static final String TAG = "HelloIntentService";

	public HelloIntentService() {
		this(TAG);
	}

	public HelloIntentService(String name) {
		super(name);
	}

	@Override
	protected void onHandleIntent(Intent intent) {
		
		long endTime = System.currentTimeMillis() + 20 * 1000;
		
		int i = 0;
		
		while (System.currentTimeMillis() < endTime) {
			try {
				Log.d(TAG, "onHandleIntent() " + System.currentTimeMillis());
				Toast.makeText(this, String.valueOf(i++), Toast.LENGTH_SHORT).show();
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
