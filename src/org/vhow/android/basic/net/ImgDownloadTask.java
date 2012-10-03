package org.vhow.android.basic.net;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;

public class ImgDownloadTask extends AsyncTask<String, Integer, Bitmap> {

	private static final String TAG = "ImgDownloadTask";
	private static final boolean DEBUG = true;

	private static final int TIME_OUT = 9000;
	private ImageView mImageView;

	public ImgDownloadTask(ImageView mImageView) {
		super();
		this.mImageView = mImageView;
	}

	@Override
	protected void onPostExecute(Bitmap result) {
		if (this.mImageView != null) {
			this.mImageView.setImageBitmap(result);
		}
	}

	@Override
	protected Bitmap doInBackground(String... params) {
		Bitmap bitmap = null;
		try {
			URL url = new URL(params[0]);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setReadTimeout(TIME_OUT);
			conn.setConnectTimeout(TIME_OUT);
			conn.setDoInput(true);

			if (DEBUG) {
				Log.d(TAG, "getResponseCode: " + conn.getResponseCode());
			}
			
			conn.connect();
			
			InputStream ins = conn.getInputStream();
			bitmap = BitmapFactory.decodeStream(ins);

		} catch (Exception e) {

		}
		return bitmap;
	}

}
