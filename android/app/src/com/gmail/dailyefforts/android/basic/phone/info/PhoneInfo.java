package com.gmail.dailyefforts.android.basic.phone.info;

import java.util.List;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.telephony.CellInfo;
import android.telephony.TelephonyManager;
import android.view.Display;
import android.widget.TextView;

import com.gmail.dailyefforts.android.basic.R;

public class PhoneInfo extends Activity {
	private TextView mTextViewInfo;
	private Display mDisplay;
	private Point mPoint;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.phone_info);

		StringBuffer buffer = new StringBuffer();

		mTextViewInfo = (TextView) findViewById(R.id.tv_info);

		mDisplay = getWindowManager().getDefaultDisplay();

		mPoint = new Point();

		mDisplay.getSize(mPoint);

		mTextViewInfo.setText("height: " + String.valueOf(mPoint.y));
		buffer.append("Display width: ");
		buffer.append(mPoint.x);
		buffer.append("\nDisplay height: ");
		buffer.append(mPoint.y);

		TelephonyManager tm = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
		buffer.append("\nPhone Type: ");
		buffer.append(tm.getPhoneType());

		buffer.append("\nPhone number: ");
		buffer.append(tm.getLine1Number());

		buffer.append("\nOperator: ");
		buffer.append(tm.getNetworkOperator());

		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
			buffer.append("\nOther: ");
			List<CellInfo> list = tm.getAllCellInfo();
			for (CellInfo cell : list) {
				buffer.append("\n");
				buffer.append(cell.toString());
			}
		}
		mTextViewInfo.setText(buffer.toString());

	}
}
