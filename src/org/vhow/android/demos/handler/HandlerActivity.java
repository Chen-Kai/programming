package org.vhow.android.demos.handler;

import org.vhow.android.demos.R;

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
	private Button mButtonPost;
	private MsgHandler mMsgHnadler;
	private Button mButtonCancel;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.handler_activity_ui);

		mHandler = new Handler();
		mMsgHnadler = new MsgHandler();

		mEditText = (EditText) findViewById(R.id.editText1_handler);
		mButtonPost = (Button) findViewById(R.id.btn_post_handler);
		mButtonCancel = (Button) findViewById(R.id.btn_cancel_handler);

		mButtonPost.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mHandler.post(mWorker);
				mMsgHnadler.sendMessageDelayed(Message.obtain(mMsgHnadler,
						MsgHandler.MSG_SET_CONTENT_TO_EDITTEXT), 1000);
				mMsgHnadler.sendMessageDelayed(Message.obtain(mMsgHnadler,
						MsgHandler.MSG_SET_CONTENT_TO_EDITTEXT_ANOTHER), 6000);
			}
		});
		
		mButtonCancel.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mMsgHnadler.removeMessages(MsgHandler.MSG_SET_CONTENT_TO_EDITTEXT_ANOTHER);
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
		public static final int MSG_SET_CONTENT_TO_EDITTEXT_ANOTHER = 1;

		@Override
		public void handleMessage(Message msg) {
			switch (msg.what) {
			case MSG_SET_CONTENT_TO_EDITTEXT:
				mEditText.setText("handle MSG_SET_CONTENT_TO_EDITTEXT");
				break;
			case MSG_SET_CONTENT_TO_EDITTEXT_ANOTHER:
				mEditText.setText("handle MSG_SET_CONTENT_TO_EDITTEXT_ANOTHER");
				break;
			default:
				break;
			}
		}
	}
}
