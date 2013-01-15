package com.gmail.dailyefforts.android.basic.service;

import android.os.Bundle;
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
				return true;
			}
		});
	}

}
