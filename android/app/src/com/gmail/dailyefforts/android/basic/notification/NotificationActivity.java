package com.gmail.dailyefforts.android.basic.notification;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.gmail.dailyefforts.android.basic.R;

public class NotificationActivity extends Activity {
	private Button mBtn;
	private Intent mIntentStartService;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.notification_activity_ui);

		mBtn = (Button) findViewById(R.id.btn_start_notification_service);

		mBtn.setOnClickListener(mBtnListener);
	}

	private View.OnClickListener mBtnListener = new View.OnClickListener() {

		@Override
		public void onClick(View v) {

			String txt = mBtn.getText().toString();

			if (txt.contains("start")) {
				mIntentStartService = new Intent(NotificationActivity.this,
						NotificationService.class);
				startService(mIntentStartService);
				mBtn.setText("stopService()");
			} else if (txt.contains("stop")) {
				stopService(mIntentStartService);
				mBtn.setText("startService()");
			}

		}
	};
}
