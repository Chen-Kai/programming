package org.vhow.android.basic.view.screen;

import org.vhow.android.basic.R;

import android.app.Activity;
import android.os.Bundle;

public class ScreenOrientationActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.screen_orientation_ui);
	}
}
