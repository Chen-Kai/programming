package com.gmail.dailyefforts.android.basic.widget;

import com.gmail.dailyefforts.android.basic.R;
import com.gmail.dailyefforts.android.basic.R.layout;
import com.gmail.dailyefforts.android.basic.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;
import android.support.v4.app.NavUtils;

public class ViewFlipperActivity extends Activity {

	private static final int SPAN = 200;
	private ViewFlipper mFlipper;
	private GestureDetector mGestureDetector;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_view_flipper);
		mFlipper = (ViewFlipper) findViewById(R.id.viewFlipper1);
		mGestureDetector = new GestureDetector(this,
				new GestureDetector.SimpleOnGestureListener() {
					@Override
					public boolean onFling(MotionEvent e1, MotionEvent e2,
							float velocityX, float velocityY) {
						if (e2.getX() - e1.getX() > SPAN) {
							// left >>> right
							mFlipper.setInAnimation(AnimationUtils
									.loadAnimation(ViewFlipperActivity.this,
											R.anim.push_in_from_left_side));
							mFlipper.setOutAnimation(AnimationUtils
									.loadAnimation(ViewFlipperActivity.this,
											R.anim.push_out_to_right_side));

							mFlipper.showPrevious();
						} else if (e1.getX() - e2.getX() > SPAN) {
							// left <<< right
							mFlipper.setInAnimation(AnimationUtils
									.loadAnimation(ViewFlipperActivity.this,
											R.anim.push_in_from_right_side));
							mFlipper.setOutAnimation(AnimationUtils
									.loadAnimation(ViewFlipperActivity.this,
											R.anim.push_out_to_left_side));

							mFlipper.showNext();
						}
						return true;
					}
				});
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		return mGestureDetector.onTouchEvent(event);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_view_flipper, menu);
		return true;
	}

}
