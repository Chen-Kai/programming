package org.vhow.android.basic.touch;

import org.vhow.android.basic.R;

import android.app.Activity;
import android.os.Bundle;

public class TouchActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.touch_activity_ui);
	}
}
