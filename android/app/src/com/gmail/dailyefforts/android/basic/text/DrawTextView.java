package com.gmail.dailyefforts.android.basic.text;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class DrawTextView extends View {

	private Paint mPaint;
	private Rect mTextBounds;
	private String TAG = "DrawTextView";

	public DrawTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		mPaint = new Paint();
		mPaint.setColor(Color.BLUE);
		mPaint.setTextSize(100F);
		mPaint.setTextAlign(Align.CENTER);
		mTextBounds = new Rect();
		String text = "g";
		mPaint.getTextBounds(text, 0, 1, mTextBounds);
		Log.d(TAG, text + "'s left   : " + mTextBounds.left);
		Log.d(TAG, text + "'s top    : " + mTextBounds.top);
		Log.d(TAG, text + "'s right  : " + mTextBounds.right);
		Log.d(TAG, text + "'s bottom : " + mTextBounds.bottom);
		Log.d(TAG, "=========================================");
		text = "h";
		mPaint.getTextBounds(text, 0, 1, mTextBounds);
		Log.d(TAG, text + "'s left   : " + mTextBounds.left);
		Log.d(TAG, text + "'s top    : " + mTextBounds.top);
		Log.d(TAG, text + "'s right  : " + mTextBounds.right);
		Log.d(TAG, text + "'s bottom : " + mTextBounds.bottom);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		canvas.drawColor(Integer.parseInt("3300FF00", 16));
		canvas.drawLine(20, 100, 300, 100, mPaint);
		canvas.drawLine(170, 100, 170, 500, mPaint);
		canvas.drawText("p", 20, 100, mPaint);
		canvas.drawText("h", 170, 100, mPaint);

	}

}
