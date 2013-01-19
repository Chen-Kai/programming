package com.gmail.dailyefforts.android.basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import android.app.ListActivity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class AndroidBasicActivity extends ListActivity {

	private static final String TAG = "AndroidBasicActivity";
	private static final boolean DEBUG = false;

	private ListAdapter mListAdapter;
	private PackageManager mApkManager;
	private Map<String, String> mMap;

	private static final String CATEGORY = "com.gmail.dailyefforts.android.intent.categor.BASIC";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		String[] topics = getTopics();

		mListAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, topics);

		setListAdapter(mListAdapter);
	}

	private String[] getTopics() {
		mApkManager = getPackageManager();

		Intent intent = new Intent();
		intent.setAction(Intent.ACTION_MAIN);
		intent.addCategory(CATEGORY);

		mMap = new HashMap<String, String>();

		List<ResolveInfo> mResolveInfoList = mApkManager.queryIntentActivities(
				intent, 0);

		Iterator<ResolveInfo> iterator = mResolveInfoList.iterator();

		while (iterator.hasNext()) {
			ResolveInfo info = iterator.next();
			mMap.put(info.activityInfo.loadLabel(mApkManager).toString(),
					info.activityInfo.name);

			if (DEBUG) {
				Log.d(TAG, "AndroidBasicActivity.getTopics() - "
						+ info.activityInfo.name);
			}
		}

		String[] topics = new String[mMap.size()];

		Object[] set = mMap.keySet().toArray();

		for (int i = 0; i < set.length; i++) {
			topics[i] = set[i].toString();
		}

		Arrays.sort(topics);
		return topics;
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		String className = mMap.get(l.getItemAtPosition(position).toString());
		Intent willing = new Intent();
		willing.setClassName(this, className);
		startActivity(willing);
	}
}
