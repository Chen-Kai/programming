package com.gmail.dailyefforts.android.basic.popup;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
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

		View contentView = mPopupWindow.getContentView();
		System.out.println("PopupWindowActivity.onCreate() w: "
				+ contentView.getMeasuredWidth() + ", h:" + contentView.getMeasuredHeight());
		contentView.measure(View.MeasureSpec.UNSPECIFIED, View.MeasureSpec.UNSPECIFIED);
		System.out.println("PopupWindowActivity.onCreate() w: "
				+ contentView.getMeasuredWidth() + ", h:" + contentView.getMeasuredHeight());

		btnPopup.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				System.out.println("mParentView: "
						+ mParentView.getWindowToken());
				mPopupWindow.setWindowLayoutMode(
						ViewGroup.LayoutParams.WRAP_CONTENT,
						ViewGroup.LayoutParams.WRAP_CONTENT);
				// mPopupWindow.setBackgroundDrawable(PopupWindowActivity.this.getResources().getDrawable(R.drawable.ic_launcher));

				int[] lw = new int[2];
				btnPopup.getLocationInWindow(lw );
				
				int[] lc = new int[2];
				btnPopup.getLocationOnScreen(lc);
				System.out.println("PopupWindowActivity.onCreate() " + lw[0] + ", " + lw[1]);
				System.out.println("PopupWindowActivity.onCreate() " + lc[0] + ", " + lc[1]);
				
				if (!mPopupWindow.isShowing()) {
					mPopupWindow.showAtLocation(btnPopup, Gravity.LEFT
							| Gravity.TOP, lc[0], lc[1] + btnPopup.getHeight());
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
