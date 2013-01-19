package com.gmail.dailyefforts.android.basic.touch;

import android.app.Activity;
import android.os.Bundle;

import com.gmail.dailyefforts.android.basic.R;

public class TouchActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.touch_activity_ui);
	}
}
