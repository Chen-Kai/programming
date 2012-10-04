package org.vhow.android.basic.timertask;

import java.util.Timer;
import java.util.TimerTask;

import org.vhow.android.basic.R;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TimerTaskActivity extends Activity {

	private static final String TAG = "TimerTaskActivity";

	private Button mBtnScheduleTimer;

	private Timer mTimer;

	private Handler mHandler = new Handler() {
		public void handleMessage(android.os.Message msg) {
			Toast.makeText(TimerTaskActivity.this,
					"TimerTask - " + Thread.currentThread().getName(),
					Toast.LENGTH_SHORT).show();
		};
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.timer_task_activity_ui);
		
		Toast.makeText(TimerTaskActivity.this,
				"Activity - " + Thread.currentThread().getName(),
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
			mHandler.sendEmptyMessage(0);
		}
	};

}
