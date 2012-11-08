package com.gmail.dailyefforts.android.basic.provider;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

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

		Field[] fields = Settings.System.class.getFields();

		boolean isPublic = false;
		boolean isStatic = false;
		boolean isFinal = false;
		boolean isString = false;
		boolean isUpperCase = false;
		
		for (Field field : fields) {
			
			// Detect if the field is Public.
			isPublic = Modifier.isPublic(field.getModifiers());
			
			// Detect if the field is Static
			isStatic = Modifier.isStatic(field.getModifiers());
			
			// Detect if the field is Final
			isFinal = Modifier.isFinal(field.getModifiers());
			
			// Detect if the field is String type
			isString = String.class.getName().equals(field.getType().getName());
			
			// Detect if the field is started with capital letter
			isUpperCase = Character.isUpperCase(field.getName().charAt(0));

			if (isPublic && isStatic && isFinal && isString && isUpperCase) {
				try {
					get((String) field.get(null));
				} catch (IllegalArgumentException e) {
					// Let it go.
				} catch (IllegalAccessException e) {
					// Let it go.
				}
			}
			
		}

		mTextView.setText(mSettingDataBuffer.toString());
	}

	private void get(String str) {
		mSettingDataBuffer.append(str + ": "
				+ Settings.System.getString(mContentResolver, str) + "\n\n");
	}
}
