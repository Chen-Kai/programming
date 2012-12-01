package com.gmail.dailyefforts.android.basic.media;

import javax.crypto.spec.IvParameterSpec;

import com.gmail.dailyefforts.android.basic.R;
import com.gmail.dailyefforts.android.basic.R.layout;
import com.gmail.dailyefforts.android.basic.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v4.widget.SimpleCursorAdapter.ViewBinder;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class LaunchCamera extends Activity implements OnClickListener {

	private Button mBtnLanuchCamera;
	private ImageView mImageView;
	private static final int LAUNCH_CAMERA_REQUEST_CODE = 1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_launch_camera);

		mBtnLanuchCamera = (Button) findViewById(R.id.btn_lanuch_amera);
		mImageView = (ImageView) findViewById(R.id.iv_lanuch_camera);

		mBtnLanuchCamera.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_launch_camera, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_lanuch_amera:
			Intent intent = new Intent();
			intent.setAction(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
			startActivityForResult(intent, LAUNCH_CAMERA_REQUEST_CODE);
			break;
		default:
			break;
		}
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		Toast.makeText(LaunchCamera.this, "onActivityResult() was called",
				Toast.LENGTH_SHORT).show();
		if ((requestCode == LAUNCH_CAMERA_REQUEST_CODE)
				&& (resultCode == Activity.RESULT_OK)) {
			if (data.hasExtra("data")) {
				Bundle bundle = data.getExtras();
				Bitmap bitmap = (Bitmap) bundle.get("data");
				mImageView.setImageBitmap(bitmap);
			}
		}
	}

}
