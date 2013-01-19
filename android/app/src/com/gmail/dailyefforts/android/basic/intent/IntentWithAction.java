package com.gmail.dailyefforts.android.basic.intent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.gmail.dailyefforts.android.basic.R;

public class IntentWithAction extends Activity {

	private Button btn;
	private TextView tv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_intent_with_action);
		
		btn = (Button) findViewById(R.id.btn_intent_with_action);
		tv = (TextView) findViewById(R.id.tv_intent_with_action);
		
		tv.setText(String.format("%s%n%s", "Intent intent = new Intent();", "intent.setAction(ACTION);"));
		
		btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent intent = new Intent();
				intent.setAction("android.intent.action.view.sth");
				
				startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_intent_with_action, menu);
		return true;
	}

}
