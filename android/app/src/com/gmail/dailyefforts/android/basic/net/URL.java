package com.gmail.dailyefforts.android.basic.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URLConnection;
import java.net.UnknownHostException;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.gmail.dailyefforts.android.basic.R;

public class URL extends Activity {
	private EditText mEditText;
	private TextView mIpTextView;
	private TextView mContentTextView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_url);

		mEditText = (EditText) findViewById(R.id.et_url);
		mIpTextView = (TextView) findViewById(R.id.tv_url_ip);
		mContentTextView = (TextView) findViewById(R.id.tv_url_content);

	}

	public void onBtnGoClicked(View view) {
		CharSequence linkStr = null;

		if (mEditText.getText() == null
				|| mEditText.getText().toString().equals("")) {
			linkStr = mEditText.getHint();
		} else {
			linkStr = mEditText.getText().toString();
		}

		UrlTask task = new UrlTask();
		task.execute(linkStr.toString());

		Toast.makeText(this, linkStr.toString(), Toast.LENGTH_SHORT).show();
	}

	private class UrlTask extends AsyncTask<String, Integer, Object> {
		private String mIpStr = null;
		private StringBuffer mContentBuffer = new StringBuffer();

		@Override
		protected Object doInBackground(String... params) {
			try {
				java.net.URL url = new java.net.URL(params[0]);

				InetAddress inetAddress = InetAddress.getByName(url.getHost());
				mIpStr = "IP: " + inetAddress.getHostAddress();

				URLConnection urlConnection = url.openConnection();
				InputStream in = urlConnection.getInputStream();
				InputStreamReader reader = new InputStreamReader(in);
				BufferedReader bufReader = new BufferedReader(reader);
				String line = "";
				while ((line = bufReader.readLine()) != null) {
					mContentBuffer.append(line);
					mContentBuffer.append("\n");
				}
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return 0;
		}

		@Override
		protected void onPostExecute(Object result) {
			mIpTextView.setText(mIpStr);
			mContentTextView.setText(mContentBuffer);
		}

	}
}
