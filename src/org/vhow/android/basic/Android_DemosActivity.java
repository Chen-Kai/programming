package org.vhow.android.basic;

import org.vhow.android.basic.handler.HandlerActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Android_DemosActivity extends ListActivity {
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
			Intent intent = new Intent(this, HandlerActivity.class);
			startActivity(intent);
			break;
		}
	}
}