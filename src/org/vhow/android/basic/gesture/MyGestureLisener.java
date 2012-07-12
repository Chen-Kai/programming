package org.vhow.android.basic.gesture;

import android.view.GestureDetector;
import android.view.MotionEvent;

public class MyGestureLisener extends GestureDetector.SimpleOnGestureListener {
	
	IDoubleTapHandler mDoubleTapHandler;
	
	public void setDoubleTapHandler(IDoubleTapHandler mDoubleTapHandler) {
		this.mDoubleTapHandler = mDoubleTapHandler;
	}

	@Override
	public boolean onSingleTapUp(MotionEvent e) {
		return super.onSingleTapUp(e);
	}

	@Override
	public void onLongPress(MotionEvent e) {
		super.onLongPress(e);
	}

	@Override
	public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX,
			float distanceY) {
		return super.onScroll(e1, e2, distanceX, distanceY);
	}

	@Override
	public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
			float velocityY) {
		return super.onFling(e1, e2, velocityX, velocityY);
	}

	@Override
	public void onShowPress(MotionEvent e) {
		super.onShowPress(e);
	}

	@Override
	public boolean onDown(MotionEvent e) {
		return super.onDown(e);
	}

	@Override
	public boolean onDoubleTap(MotionEvent e) {
		mDoubleTapHandler.onDoubleTap();
		return true;
	}

	@Override
	public boolean onDoubleTapEvent(MotionEvent e) {
		return super.onDoubleTapEvent(e);
	}

	@Override
	public boolean onSingleTapConfirmed(MotionEvent e) {
		return super.onSingleTapConfirmed(e);
	}
	
	public interface IDoubleTapHandler {
		void onDoubleTap();
	}
	
}
