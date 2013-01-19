package com.gmail.dailyefforts.android.basic.view.screen;

import android.app.Activity;
import android.os.Bundle;

import com.gmail.dailyefforts.android.basic.R;

public class ScreenOrientationActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.screen_orientation_ui);
	}
}
