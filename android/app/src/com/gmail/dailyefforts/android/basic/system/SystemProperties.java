package com.gmail.dailyefforts.android.basic.system;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TwoLineListItem;

public class SystemProperties extends ListActivity {

	private static final String[] keys = { "file.separator", "java.class.path",
			"java.class.version", "java.home", "java.vendor",
			"java.vendor.url", "java.version", "line.separator", "os.arch",
			"os.name", "path.separator", "user.dir", "user.home", "user.name" };

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_system_properties);
		ListAdapter adapter = new MyAdapter();
		setListAdapter(adapter);
	}

	private class MyAdapter extends BaseAdapter {

		@Override
		public int getCount() {
			return keys.length;
		}

		@Override
		public Object getItem(int position) {
			return keys[position];
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			TwoLineListItem twoLineListItem;
			if (convertView == null) {
				LayoutInflater layoutInflater = (LayoutInflater) SystemProperties.this
						.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				twoLineListItem = (TwoLineListItem) layoutInflater.inflate(
						android.R.layout.simple_list_item_2, null);
			} else {
				twoLineListItem = (TwoLineListItem) convertView;
			}
			twoLineListItem.getText1().setText(keys[position]);
			twoLineListItem.getText2().setText(
					System.getProperty(keys[position]));

			return twoLineListItem;
		}

	}

}
