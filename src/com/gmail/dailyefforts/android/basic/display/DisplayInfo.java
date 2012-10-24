package com.gmail.dailyefforts.android.basic.display;

import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.widget.TextView;

import com.gmail.dailyefforts.android.basic.R;

public class DisplayInfo extends Activity {
	private TextView mTextViewHeight;
	private TextView mTextViewWidth;
	private Display mDisplay;
	private Point mPoint;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.display_info);

		mTextViewHeight = (TextView) findViewById(R.id.tv_display_height);
		mTextViewWidth = (TextView) findViewById(R.id.tv_display_width);

		mDisplay = getWindowManager().getDefaultDisplay();

		mPoint = new Point();

		mDisplay.getSize(mPoint);

		mTextViewWidth.setText("width: " + String.valueOf(mPoint.x));
		mTextViewHeight.setText("height: " + String.valueOf(mPoint.y));

	}
}
