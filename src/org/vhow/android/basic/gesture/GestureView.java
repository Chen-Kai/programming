package org.vhow.android.basic.gesture;

import org.vhow.android.basic.gesture.MyGestureLisener.IDoubleTapHandler;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class GestureView extends View {

	private Paint mPaint;
	private MyGestureLisener mMyGestureLisener;
	private GestureDetector mGestureDetector;
	private IDoubleTapHandler mDoubleTapHandler;

	public GestureView(final Context context, AttributeSet attrs) {
		super(context, attrs);
		
		mPaint = new Paint();
		mPaint.setColor(Color.GREEN);
		
		mMyGestureLisener = new MyGestureLisener();
		mDoubleTapHandler = new MyGestureLisener.IDoubleTapHandler() {
			
			@Override
			public void onDoubleTap() {
				Toast.makeText(context, "onDoubleTap", Toast.LENGTH_SHORT).show();
			}
		};
		
		mMyGestureLisener.setDoubleTapHandler(mDoubleTapHandler);
		mGestureDetector = new GestureDetector(context, mMyGestureLisener);
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		int canvasWidth = canvas.getWidth();
		int canvasHeight = canvas.getHeight();
		
		canvas.drawRect(canvasWidth / 4.0F, canvasHeight / 4.0F, 3 * canvasWidth / 4.0F, 3 * canvasHeight / 4.0F, mPaint);
	}
	
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		mGestureDetector.onTouchEvent(event);
		return true;
	}
}
