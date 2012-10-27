package com.gmail.dailyefforts.android.basic.popup;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;

import com.gmail.dailyefforts.android.basic.R;

public class PopupWindowActivity extends Activity {
	private Button btnPopup;
	private Button btnPopupIme;
	private PopupWindow mPopupWindow;
	private View mParentView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.popup_window_activity_ui);
		mParentView = findViewById(R.id.popup_window_activity_ui_id);
		System.out.println("PopupWindowActivity.onCreate() " + mParentView);

		btnPopup = (Button) findViewById(R.id.btn_show_popup);
		btnPopupIme = (Button) findViewById(R.id.btn_show_popup_input_mode);
		mPopupWindow = new MyPopupWindow(PopupWindowActivity.this);

		btnPopup.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				System.out.println("mParentView: "
						+ mParentView.getWindowToken());
				mPopupWindow.setHeight(300);
				mPopupWindow.setWidth(200);
				// mPopupWindow.setBackgroundDrawable(PopupWindowActivity.this.getResources().getDrawable(R.drawable.ic_launcher));
				if (!mPopupWindow.isShowing()) {
					mPopupWindow.showAtLocation(mParentView, Gravity.LEFT
							| Gravity.TOP, 200, 300);
				}
			}
		});

		btnPopupIme.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if (mPopupWindow.isShowing()) {
					mPopupWindow.dismiss();
				}
			}
		});
	}
}
