package org.vhow.android.demos.handler;

import org.vhow.android.demos.R;
import org.vhow.android.demos.handler.HandlerActivity.MsgHandler;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HandlerActivity extends Activity {
	private Handler mHandler;
	private EditText mEditText;
	private Button mButton;
	private MsgHandler mMsgHnadler;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.handler_activity_ui);

		mHandler = new Handler();
		mMsgHnadler = new MsgHandler();

		mEditText = (EditText) findViewById(R.id.editText1_handler);
		mButton = (Button) findViewById(R.id.button1_handler);

		mButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				mHandler.post(mWorker);
				mMsgHnadler.sendMessageDelayed(Message.obtain(mMsgHnadler,
						MsgHandler.MSG_SET_CONTENT_TO_EDITTEXT), 3000);
			}
		});
	}

	private Runnable mWorker = new Runnable() {
		@Override
		public void run() {
			mEditText.setText("by posting Runnable obj");
		}
	};

	class MsgHandler extends Handler {
		public static final int MSG_SET_CONTENT_TO_EDITTEXT = 0;

		@Override
		public void handleMessage(Message msg) {
			switch (msg.what) {
			case MSG_SET_CONTENT_TO_EDITTEXT:
				mEditText.setText("by handleMessage");
				break;
			default:
				break;
			}
		}
	}
}
