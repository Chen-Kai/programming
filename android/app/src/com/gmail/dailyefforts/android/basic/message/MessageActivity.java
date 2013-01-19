package com.gmail.dailyefforts.android.basic.message;

import android.app.Activity;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;

import com.gmail.dailyefforts.android.basic.R;

public class MessageActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_message);
	}

	public void sendMsg(View view) {

		SmsManager smsManager = SmsManager.getDefault();

		String address = "address here";
		String text = "text message here";

		// Send text message to the address.
		smsManager.sendTextMessage(address, null, text, null, null);

		Uri uri = Uri.parse("content://sms/sent/");

		ContentValues values = new ContentValues();
		values.put("address", address);
		values.put("body", text);

		// Insert the sent message to the "sent" box
		getContentResolver().insert(uri, values);

	}

}
