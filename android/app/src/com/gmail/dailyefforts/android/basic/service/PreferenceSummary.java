package com.gmail.dailyefforts.android.basic.service;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceActivity;
import android.preference.PreferenceScreen;

import com.gmail.dailyefforts.android.basic.R;

public class PreferenceSummary extends PreferenceActivity {

	private Preference pref;
	private PreferenceScreen prefScreen;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preference_summary);

		prefScreen = getPreferenceScreen();
		pref = prefScreen.findPreference("preference_summary_key");

		pref.setOnPreferenceClickListener(new OnPreferenceClickListener() {

			@Override
			public boolean onPreferenceClick(Preference preference) {
				pref.setSummary("starting ... ");
				Intent intent = new Intent(PreferenceSummary.this,
						PreferenceSummarySevice	.class);
				Messenger messenger = new Messenger(handler);
				intent.putExtra("messenger", messenger);
				startService(intent);
				return true;
			}
		});
	}

	Handler handler = new Handler() {
		@Override
		public void handleMessage(Message msg) {
			pref.setSummary(String.valueOf(msg.arg1));
		}
	};

}
