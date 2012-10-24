package com.gmail.dailyefforts.android.basic.service;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.gmail.dailyefforts.android.basic.R;

public class ServiceActivity extends Activity {
	private Button mBtnStartService;
	private Button mBtnStartIntentService;

	private Intent mIntentStartService;
	private Intent mIntentStartIntentService;
	private Button mBtnStopService;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.service_activity_ui);

		mBtnStartService = (Button) findViewById(R.id.btn_start_service);
		mBtnStartIntentService = (Button) findViewById(R.id.btn_start_intent_service);
		mBtnStopService = (Button) findViewById(R.id.btn_stop_service);

		mBtnStartService.setOnClickListener(mBtnListener);
		mBtnStartIntentService.setOnClickListener(mBtnListener);
		mBtnStopService.setOnClickListener(mBtnListener);
	}

	private View.OnClickListener mBtnListener = new View.OnClickListener() {

		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.btn_start_service:
				mIntentStartService = new Intent(ServiceActivity.this, HelloService.class);
				startService(mIntentStartService);
				break;
			case R.id.btn_start_intent_service:
				mIntentStartIntentService = new Intent(ServiceActivity.this, HelloIntentService.class);
				startService(mIntentStartService);
				break;
			case R.id.btn_stop_service:
				stopService(mIntentStartService);
			}
		}
	};
}
