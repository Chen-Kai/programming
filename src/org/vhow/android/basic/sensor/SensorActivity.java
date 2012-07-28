package org.vhow.android.basic.sensor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import android.app.ListActivity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class SensorActivity extends ListActivity {
	// SensorManager lets you access the device's sensors.
	private SensorManager mSensorManger;

	// Use this list to store sensors.
	private List<Sensor> mSensorList;

	// Use this adapter to deliver data to the ListView.
	private ArrayAdapter<String> mAdapter;

	// Use this ArrayList to store the names of each sensor.
	ArrayList<String> mSensorNames;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		mSensorNames = new ArrayList<String>();

		// Get an instance of SensorManager.
		mSensorManger = (SensorManager) getSystemService(Context.SENSOR_SERVICE);

		// Get the list of all available sensors.
		mSensorList = mSensorManger.getSensorList(Sensor.TYPE_ALL);

		// Get the names of each sensor.
		Iterator<Sensor> iterator = mSensorList.iterator();
		while (iterator.hasNext()) {
			Sensor sensor = iterator.next();
			mSensorNames.add(sensor.getName());
		}

		// Construct an ArrayAdapter using all the names of each sensor.
		mAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, mSensorNames);

		// Provide the cursor for the list view.
		setListAdapter(mAdapter);
	}
}
