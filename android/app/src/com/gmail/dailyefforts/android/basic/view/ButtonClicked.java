package com.gmail.dailyefforts.android.basic.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.gmail.dailyefforts.android.basic.R;

public class ButtonClicked extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_clicked);
        
    }

    public void btnClickHandler(View view) {
    	Toast.makeText(this, "btn is clicked", Toast.LENGTH_SHORT).show();
    }
    
}
