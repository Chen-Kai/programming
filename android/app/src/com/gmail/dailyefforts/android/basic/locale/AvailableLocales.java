package com.gmail.dailyefforts.android.basic.locale;

import java.util.ArrayList;
import java.util.Locale;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

import com.gmail.dailyefforts.android.basic.R;

public class AvailableLocales extends ListActivity {

	Locale[] mLocalesList;
	private ArrayList<String> mLocaleNames;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_utilities);

		mLocaleNames = new ArrayList<String>();

		Locale[] localesList = Locale.getAvailableLocales();
		
		for (Locale l : localesList) {
			mLocaleNames.add(l.getDisplayName(l));
		}
		
		setTitle("Locale.getAvailableLocales()");
		
		ListAdapter adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, mLocaleNames);
		
		setListAdapter(adapter);
	}

}
