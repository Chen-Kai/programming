package com.gmail.dailyefforts.android.basic.service;

import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

import com.gmail.dailyefforts.android.basic.R;

public class PreferenceSummarySevice extends IntentService {

	private NotificationManager mngr;

	public PreferenceSummarySevice() {

		super(PreferenceSummarySevice.class.getSimpleName());
		System.out.println("PreferenceSummarySevice.PreferenceSummarySevice()");
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		System.out.println("PreferenceSummarySevice.onStartCommand()");
		return super.onStartCommand(intent, flags, startId);
	}

	@Override
	public void setIntentRedelivery(boolean enabled) {
		System.out.println("PreferenceSummarySevice.setIntentRedelivery()");
		super.setIntentRedelivery(enabled);
	}

	@Override
	public void onCreate() {
		mngr = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
		System.out.println("PreferenceSummarySevice.onCreate()");
		super.onCreate();
	}

	@Override
	public void onStart(Intent intent, int startId) {
		super.onStart(intent, startId);
		System.out.println("PreferenceSummarySevice.onStart()");
	}

	@Override
	public void onDestroy() {
		System.out.println("PreferenceSummarySevice.onDestroy()");
		super.onDestroy();
	}

	@Override
	public IBinder onBind(Intent intent) {
		System.out.println("PreferenceSummarySevice.onBind()");
		return super.onBind(intent);
	}

	@Override
	protected void onHandleIntent(Intent intent) {

		Messenger messenger = (Messenger) intent.getExtras().get("messenger");
		for (int i = 100; i >= 0; i--) {
			Message msg = Message.obtain();
			msg.arg1 = i;
			try {
				messenger.send(msg);
			} catch (RemoteException e) {
				e.printStackTrace();
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("PreferenceSummarySevice.onHandleIntent()");
		Notification notification = new Notification(R.drawable.ic_launcher,
				"onHandleIntent", System.currentTimeMillis());
		notification.setLatestEventInfo(this, "contentTitle", "contentText",
				null);

		mngr.notify(0, notification);
	}

}
