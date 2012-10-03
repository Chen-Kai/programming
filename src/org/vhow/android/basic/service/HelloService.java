package org.vhow.android.basic.service;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class HelloService extends Service {

	private static final String TAG = "HelloService";

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		Log.d(TAG, "onStartCommand() ");
		Toast.makeText(this, "onStartCommand()", Toast.LENGTH_SHORT).show();
		return super.onStartCommand(intent, flags, startId);
	}

	@Override
	public void onCreate() {
		Log.d(TAG, "onCreate() ");
		Toast.makeText(this, "onCreate()", Toast.LENGTH_SHORT).show();
		super.onCreate();
	}

	@Override
	public void onStart(Intent intent, int startId) {
		Log.d(TAG, "onStart() ");
		Toast.makeText(this, "onStart()", Toast.LENGTH_SHORT).show();

		super.onStart(intent, startId);
	}

	@Override
	public void onDestroy() {
		Log.d(TAG, "onDestroy() ");
		Toast.makeText(this, "onDestroy()", Toast.LENGTH_SHORT).show();
		super.onDestroy();
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		Log.d(TAG, "onConfigurationChanged() ");
		Toast.makeText(this, "onConfigurationChanged()", Toast.LENGTH_SHORT)
				.show();
		super.onConfigurationChanged(newConfig);
	}

	@Override
	public boolean onUnbind(Intent intent) {
		Log.d(TAG, "onUnbind() ");
		Toast.makeText(this, "onUnbind()", Toast.LENGTH_SHORT).show();
		return super.onUnbind(intent);
	}

	@Override
	public IBinder onBind(Intent intent) {
		Log.d(TAG, "onBind() ");
		Toast.makeText(this, "onBind()", Toast.LENGTH_SHORT).show();

		return null;
	}

}
