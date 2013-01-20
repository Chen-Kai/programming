package com.gmail.dailyefforts.android.basic.service;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.gmail.dailyefforts.android.basic.R;
import com.gmail.dailyefforts.android.basic.Secret;

public class WeiboWebviewActivity extends Activity {
	private static final String TAG = WeiboWebviewActivity.class
			.getSimpleName();
	private WebView mWebView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().requestFeature(Window.FEATURE_PROGRESS);
		setContentView(R.layout.activity_weibo_webview);

		Intent intent = getIntent();
		String url = intent.getExtras().getString("url");
		mWebView = (WebView) findViewById(R.id.wv_weibo);
		mWebView.setWebViewClient(new WeiboWebViewClient());
		mWebView.loadUrl(url);
		mWebView.getSettings().setJavaScriptEnabled(true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_weibo_webview, menu);
		return true;
	}

	private class WeiboWebViewClient extends WebViewClient {

		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			Log.d(TAG, "shouldOverrideUrlLoading() url: " + url);
			return super.shouldOverrideUrlLoading(view, url);
		}

		@Override
		public void onPageStarted(WebView view, String url, Bitmap favicon) {
			Log.d(TAG, "onPageStarted() url: " + url);
			super.onPageStarted(view, url, favicon);
			Log.d(TAG, (url != null && url.startsWith(Secret.WEIBO_APP_REDIRECT_URL)) + "");
			if (url != null && url.startsWith(Secret.WEIBO_APP_REDIRECT_URL)) {
				view.stopLoading();
				Intent data = new Intent();
				data.putExtra("key", url);
				setResult(Activity.RESULT_OK, data );
				Log.d(TAG, "onPageStarted() finishing... : " + data.getExtras().getString("key"));
				finish();
			}
		}

		@Override
		public void onPageFinished(WebView view, String url) {
			Log.d(TAG, "onPageFinished() url: " + url);
			super.onPageFinished(view, url);
		}

		@Override
		public void onReceivedError(WebView view, int errorCode,
				String description, String failingUrl) {
			Log.d(TAG, "onReceivedError() url: " + failingUrl);
			super.onReceivedError(view, errorCode, description, failingUrl);
		}

	}

}
