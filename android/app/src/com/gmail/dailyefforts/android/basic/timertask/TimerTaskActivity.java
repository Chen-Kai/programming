package com.gmail.dailyefforts.android.basic.timertask;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.gmail.dailyefforts.android.basic.R;

public class TimerTaskActivity extends Activity {

	private static final String TAG = "TimerTaskActivity";

	private Button mBtnScheduleTimer;

	private Timer mTimer;

	private Handler mHandler = new Handler() {
		public void handleMessage(android.os.Message msg) {
			Toast.makeText(TimerTaskActivity.this,
					"TimerTask in thread: " + (String) msg.obj,
					Toast.LENGTH_SHORT).show();
		};
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.timer_task_activity_ui);

		Toast.makeText(TimerTaskActivity.this,
				"Activity in thread: " + Thread.currentThread().getName(),
				Toast.LENGTH_SHORT).show();

		mTimer = new Timer();

		mBtnScheduleTimer = (Button) findViewById(R.id.btn_schedule_timer);
		mBtnScheduleTimer.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mTimer.schedule(mTimerTask, 3000);
			}
		});
	}

	private TimerTask mTimerTask = new TimerTask() {

		@Override
		public void run() {
			Log.d(TAG, "TimerTask" + Thread.currentThread().getName());
			Message msg = Message.obtain();
			msg.obj = Thread.currentThread().getName();
			mHandler.sendMessage(msg);
		}
	};

}
