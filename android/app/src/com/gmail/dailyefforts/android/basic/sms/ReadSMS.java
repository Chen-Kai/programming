package com.gmail.dailyefforts.android.basic.sms;

import android.app.Activity;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.UserDictionary;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.gmail.dailyefforts.android.basic.R;

public class ReadSMS extends Activity {

	private static TextView tv;
	private Button btn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_read_sms);
		UserDictionary.Words.CONTENT_URI.buildUpon();
		tv = (TextView) findViewById(R.id.tv_sms_fetch);
		btn = (Button) findViewById(R.id.btn_sms_fetch);

		btn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Uri uri = Uri.parse("content://sms/sent");
				Cursor c = getContentResolver().query(uri,
						new String[] { "_id", "body" }, null, null, null);
				new ReadSmsTask().execute(c);
			}

		});
	}

	public static class ReadSmsTask extends
			AsyncTask<Cursor, Integer, StringBuffer> {
		@Override
		protected void onPostExecute(StringBuffer result) {
			super.onPostExecute(result);
			if (tv != null) {
				tv.setText(result);
			}
		}

		@Override
		protected StringBuffer doInBackground(Cursor... params) {
			Cursor c = params[0];
			c.moveToPosition(-1);
			StringBuffer buffer = new StringBuffer();
			while (c.moveToNext()) {
				buffer.append(c.getPosition());
				buffer.append(" - " + c.getString(c.getColumnIndex("body")));
				buffer.append("\n---------------------\n");
			}
			return buffer;
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_fetch_sms, menu);
		return true;
	}

}
