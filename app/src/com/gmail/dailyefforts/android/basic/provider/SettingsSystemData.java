package com.gmail.dailyefforts.android.basic.provider;

import java.lang.reflect.Field;

import android.app.Activity;
import android.content.ContentResolver;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.TextView;

import com.gmail.dailyefforts.android.basic.R;

public class SettingsSystemData extends Activity {
	private TextView mTextView;
	private ContentResolver mContentResolver;
	private StringBuffer mSettingDataBuffer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings_data);

		mTextView = (TextView) findViewById(R.id.tv_settings_data);
		mContentResolver = getContentResolver();

		mSettingDataBuffer = new StringBuffer();

		// activity XML property
		mSettingDataBuffer
				.append("activity tag: \nandroid:theme=\"@android:style/Theme.Holo.Light.NoActionBar.Fullscreen\"\n");
		mSettingDataBuffer.append("\nCurrent Settings.System data:\n");
		try {
			Field[] fields = Settings.System.class.getFields();
			boolean isPublic = false;
			boolean isStatic = false;
			boolean isFinal = false;
			boolean isString = false;
			boolean isUpperCase = false;
			for (Field field : fields) {
				
				isPublic = java.lang.reflect.Modifier.isPublic(field.getModifiers());
				isStatic = java.lang.reflect.Modifier.isStatic(field.getModifiers());
				isFinal = java.lang.reflect.Modifier.isFinal(field.getModifiers());
				isString = String.class.getName().equals(field.getType().getName());
				isUpperCase =  Character.isUpperCase(field.getName().charAt(0));
				
				if (isPublic && isStatic && isFinal && isString && isUpperCase) {
					get((String)field.get(null));
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		mTextView.setText(mSettingDataBuffer.toString());
	}

	private void get(String str) {
		mSettingDataBuffer.append(str + ": "
				+ Settings.System.getString(mContentResolver, str) + "\n\n");
	}
}
