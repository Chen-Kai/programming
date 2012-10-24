package com.gmail.dailyefforts.android.basic.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

import com.gmail.dailyefforts.android.basic.R;

public class NotificationService extends Service {

	private NotificationManager mNotificationManager;
	private Notification mNotification;
	
	private static final int NOTIFY_ID = 1;
	
	@Override
	public void onCreate() {
		Toast.makeText(this, "onCreate()", Toast.LENGTH_SHORT).show();
	
		super.onCreate();
	}
	

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		Toast.makeText(this, "onStartCommand()", Toast.LENGTH_SHORT).show();
		mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
		mNotification = new Notification(R.drawable.ic_launcher,
				"My notification", System.currentTimeMillis());
		
		Context context = getApplicationContext();
		CharSequence contentTitle = "Notification Content Title";
		CharSequence contentText = "Notification Content Text";
		Intent notificationIntent = new Intent(this, NotificationActivity.class);
		PendingIntent contentIntent = PendingIntent.getActivity(this, 0, notificationIntent, 0);

		mNotification.setLatestEventInfo(context, contentTitle, contentText, contentIntent);
		mNotificationManager.notify(NOTIFY_ID, mNotification);
		return super.onStartCommand(intent, flags, startId);
	}
	
	@Override
	public void onStart(Intent intent, int startId) {
		Toast.makeText(this, "onStart()", Toast.LENGTH_SHORT).show();
		super.onStart(intent, startId);
	}

	@Override
	public IBinder onBind(Intent intent) {
		Toast.makeText(this, "onBind()", Toast.LENGTH_SHORT).show();
		return null;
	}

	@Override
	public void onDestroy() {
		Toast.makeText(this, "onDestroy()", Toast.LENGTH_SHORT).show();
		super.onDestroy();
	}

}
