package org.vhow.android.basic.touch;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.Toast;

public class MyButton extends Button {

	private static final String TAG = "MyButton";
	private static final boolean DEBUG = true;

	private Context mContext = null;

	public MyButton(Context context, AttributeSet attrs) {
		super(context, attrs);

		mContext = context;
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		StringBuilder info = new StringBuilder();
		int touchedPointsNum = event.getPointerCount();
		info.append("Touched ");
		info.append(touchedPointsNum);
		info.append(touchedPointsNum > 1 ? " points" : " point");
		
		Toast.makeText(mContext, info, Toast.LENGTH_SHORT).show();
		
		return super.onTouchEvent(event);
	}

}
