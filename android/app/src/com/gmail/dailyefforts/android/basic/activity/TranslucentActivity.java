package com.gmail.dailyefforts.android.basic.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.gmail.dailyefforts.android.basic.R;

public class TranslucentActivity extends Activity {
	private TextView mTextView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.translucent_activity_ui);
		mTextView = (TextView) findViewById(R.id.tv_translucent);
		if (mTextView != null) {
			mTextView.setText("@android:style/Theme.Translucent");
		}
	}
}
