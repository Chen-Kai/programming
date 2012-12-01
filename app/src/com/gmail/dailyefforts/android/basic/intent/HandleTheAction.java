package com.gmail.dailyefforts.android.basic.intent;

import com.gmail.dailyefforts.android.basic.R;
import com.gmail.dailyefforts.android.basic.R.layout;
import com.gmail.dailyefforts.android.basic.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class HandleTheAction extends Activity {

	private TextView tv;
	private static String str ="<intent-filter>\n\n" +
    "<action android:name=\"android.intent.action.view.sth\" />\n\n" + 
    "<category android:name=\"android.intent.category.DEFAULT\" />\n\n" +
 	"</intent-filter>\n";  


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_handle_the_action);
		
		tv = (TextView) findViewById(R.id.tv_handle_action);
		tv.setText(str);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_handle_the_action, menu);
		return true;
	}

}
