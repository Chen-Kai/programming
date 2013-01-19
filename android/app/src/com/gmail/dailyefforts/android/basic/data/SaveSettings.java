package com.gmail.dailyefforts.android.basic.data;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

import com.gmail.dailyefforts.android.basic.R;

public class SaveSettings extends Activity {

	private SharedPreferences mSharedPreferences;
	private Editor mEditor;
	private CheckBox mCheckBox;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_save_settings);

		mSharedPreferences = getSharedPreferences("my_prefer", Context.MODE_PRIVATE);
		mEditor = mSharedPreferences.edit();
		
		mCheckBox = (CheckBox) findViewById(R.id.checkbox_save_settings);
		
		boolean isChecked = mSharedPreferences.getBoolean("check", false);
		mCheckBox.setChecked(isChecked);
		
		mCheckBox.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				mEditor.putBoolean("check", isChecked);
				mEditor.commit();
			}
		});
		
	}

}
