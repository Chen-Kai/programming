package com.gmail.dailyefforts.android.basic.text;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

import com.gmail.dailyefforts.android.basic.R;

public class TextBoundsActivity extends Activity {
	private TextPopupWindow mTextPopupWindow;
	private View mParent;
	private Button mShowButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.text_bounds_activity_ui);
		mParent = findViewById(R.id.text_bounds_activity_ui_xml_id);
		mShowButton = (Button) findViewById(R.id.btn_show_text_poupwindow);
		
		mShowButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mTextPopupWindow = new TextPopupWindow(TextBoundsActivity.this, "g");
				mTextPopupWindow.setHeight(100);
				mTextPopupWindow.setWidth(100);
				
				mTextPopupWindow.showAsDropDown(mShowButton);
			}
		});

	}
}
