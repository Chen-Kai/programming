package org.vhow.android.basic.net;

import org.vhow.android.basic.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class NetActivity extends Activity {
	private Button mBtnDownLoadTv;
	private Button mBtnDownLoadEt;
	private ImageView mImageView;
	private TextView mTextView;
	private EditText mEditText;

	private String mUrlStr;
	private ImgDownloadTask mImgDownloadTask;
	private BtnClickedListener mBtnClickedListener;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.net_activity_ui);

		mBtnDownLoadTv = (Button) findViewById(R.id.btn_net_download_from_tv);
		mBtnDownLoadEt = (Button) findViewById(R.id.btn_net_download_from_et);

		mImageView = (ImageView) findViewById(R.id.img_net_downloaded_img);

		mTextView = (TextView) findViewById(R.id.tv_net_url);
		mEditText = (EditText) findViewById(R.id.et_net_enter_url);

		mUrlStr = mTextView.getText().toString();

		mImgDownloadTask = new ImgDownloadTask(mImageView);
		
		mBtnClickedListener = new BtnClickedListener();
		
		mBtnDownLoadTv.setOnClickListener(mBtnClickedListener);
		mBtnDownLoadEt.setOnClickListener(mBtnClickedListener);
		
	}
	
	private  class BtnClickedListener implements View.OnClickListener {

		@Override
		public void onClick(View v) {
			String url = null;
			switch (v.getId()) {
			case R.id.btn_net_download_from_tv:
				url = mUrlStr;
				break;
			case R.id.btn_net_download_from_et:
				url = mEditText.getText().toString();
				break;
			}
			
			if (mImgDownloadTask != null) {
				mImgDownloadTask.execute(url);
			}
		}
		
	}
}
