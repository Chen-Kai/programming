package com.gmail.dailyefforts.android.basic.service;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceActivity;
import android.preference.PreferenceScreen;

import com.gmail.dailyefforts.android.basic.R;
import com.gmail.dailyefforts.android.basic.Secret;

public class PreferenceSummary extends PreferenceActivity {

	private Preference pref;
	private PreferenceScreen prefScreen;
	private Preference prefWeibo;
	private static final String WEIBO_AUTH_BASE_URL = "https://api.weibo.com/oauth2/authorize";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preference_summary);

		prefScreen = getPreferenceScreen();
		pref = prefScreen.findPreference("preference_summary_key");

		prefWeibo = prefScreen.findPreference("weibo_key");

		pref.setOnPreferenceClickListener(new OnPreferenceClickListener() {

			@Override
			public boolean onPreferenceClick(Preference preference) {
				pref.setSummary("starting ... ");
				Intent intent = new Intent(PreferenceSummary.this,
						PreferenceSummarySevice.class);
				Messenger messenger = new Messenger(handler);
				intent.putExtra("messenger", messenger);
				startService(intent);
				return true;
			}
		});

		prefWeibo.setOnPreferenceClickListener(new OnPreferenceClickListener() {

			@Override
			public boolean onPreferenceClick(Preference preference) {
				Bundle bundle = new Bundle();
				bundle.putString("client_id", Secret.WEIBO_APP_KEY);
				bundle.putString("response_type", "token");
				bundle.putString("redirect_uri", Secret.WEIBO_APP_REDIRECT_URL);
				bundle.putString("display", "mobile");
				Intent intent = new Intent(PreferenceSummary.this,
						WeiboWebviewActivity.class);
				Uri uri = Uri.parse(WEIBO_AUTH_BASE_URL + "?"
						+ encodeUrl(bundle));
				intent.putExtra("url", uri.toString());
				startActivityForResult(intent, 2);

				return true;
			}
		});
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		System.out.println("resultCode: " + resultCode);
		if (data != null && data.getExtras() != null) {
			System.out.println("data: "
					+ data.getExtras().getString("key", "default"));
		}
		super.onActivityResult(requestCode, resultCode, data);
	}

	public static String encodeUrl(Bundle parameters) {
		if (parameters == null)
			return "";
		StringBuilder sb = new StringBuilder();
		boolean first = true;
		for (String key : parameters.keySet()) {
			if (first)
				first = false;
			else
				sb.append("&");
			sb.append(key + "=" + parameters.getString(key));
		}
		return sb.toString();
	}

	Handler handler = new Handler() {
		@Override
		public void handleMessage(Message msg) {
			pref.setSummary(String.valueOf(msg.arg1));
		}
	};

}
