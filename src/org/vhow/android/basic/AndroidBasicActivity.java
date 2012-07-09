package org.vhow.android.basic;

import org.vhow.android.basic.display.DisplayInfo;
import org.vhow.android.basic.handler.HandlerActivity;
import org.vhow.android.basic.sensor.SensorActivity;
import org.vhow.android.basic.touch.TouchActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class AndroidBasicActivity extends ListActivity {
	private ListAdapter mListAdapter;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		String[] topics = getResources().getStringArray(R.array.topics);
		mListAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, topics);
		setListAdapter(mListAdapter);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		switch (position) {
		case 0:
			Intent intent0 = new Intent(this, HandlerActivity.class);
			startActivity(intent0);
			break;
		case 1:
			Intent intent1 = new Intent(this, DisplayInfo.class);
			startActivity(intent1);
			break;
		case 2:
			Intent intent2 = new Intent(this, SensorActivity.class);
			startActivity(intent2);
		case 3:
			Intent intent3 = new Intent(this, TouchActivity.class);
			startActivity(intent3);
		}
	}
}