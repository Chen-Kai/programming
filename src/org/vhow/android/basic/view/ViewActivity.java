package org.vhow.android.basic.view;

import org.vhow.android.basic.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;

public class ViewActivity extends Activity {
	private Button mBtn;
	private Button mBtnSetMargin;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view_activity_ui);

		mBtnSetMargin = (Button) findViewById(R.id.btn_view_setmargin);

		mBtnSetMargin.setOnClickListener(new View.OnClickListener() {

			private boolean mFlag;

			@Override
			public void onClick(View v) {

				LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
						LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
				if (mFlag) {
					params.setMargins(0, 0, 0, 0);
					mBtnSetMargin.setText("setMargins(100, 0, 0, 0)");
				} else {
					params.setMargins(100, 0, 0, 0);
					mBtnSetMargin.setText("setMargins(0, 0, 0, 0)");
				}

				mFlag = !mFlag;

				mBtn = (Button) findViewById(R.id.btn_view);
				mBtn.setLayoutParams(params);
			}
		});
	}
}
