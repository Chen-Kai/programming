package com.gmail.dailyefforts.android.basic.text;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;

public class TextPopupWindow extends PopupWindow {

	private static final String TAG = "TextPopupWindow";
	private static final boolean DEBUG = true;
	private int height;
	private int width;

	public TextPopupWindow(Context context, String text) {
		super(context);
		setContentView(new MyTextView(context, text));
		width = getHeight();
		height = getWidth();
	}

	private class MyTextView extends View {
		private Context mContext;
		private Paint mTextPaint;
		private Rect mTextBounds;
		private String mText;
		private FontMetrics mFontMetrics;

		public MyTextView(Context context, String text) {
			super(context);
			mContext = context;
			mText = text;
			mTextPaint = new Paint();
			mTextPaint.setColor(Color.BLACK);
			mTextPaint.setStrokeWidth(5F);
			mTextPaint.setTextSize(50F);
			mTextPaint.setTextAlign(Align.CENTER);
			mTextBounds = new Rect();

			mFontMetrics = mTextPaint.getFontMetrics();
			if (DEBUG) {
				Log.d(TAG, text + "'s mFontMetrics.top    : "
						+ mFontMetrics.top);
				Log.d(TAG, text + "'s mFontMetrics.bottom : "
						+ mFontMetrics.bottom);
			}

			mTextPaint.getTextBounds(text, 0, 1, mTextBounds);
			if (DEBUG) {
				Log.d(TAG, text + "'s left   : " + mTextBounds.left);
				Log.d(TAG, text + "'s top    : " + mTextBounds.top);
				Log.d(TAG, text + "'s right  : " + mTextBounds.right);
				Log.d(TAG, text + "'s bottom : " + mTextBounds.bottom);
			}

			text = "a";
			mTextPaint.getTextBounds(text, 0, 1, mTextBounds);
			if (DEBUG) {
				Log.d(TAG, text + "'s left   : " + mTextBounds.left);
				Log.d(TAG, text + "'s top    : " + mTextBounds.top);
				Log.d(TAG, text + "'s right  : " + mTextBounds.right);
				Log.d(TAG, text + "'s bottom : " + mTextBounds.bottom);
				Log.d(TAG, "width  : " + width);
				Log.d(TAG, "height : " + height);
			}
			
		}

		@Override
		protected void onDraw(Canvas canvas) {
			canvas.drawColor(Integer.parseInt("3300FF00", 16));
			canvas.drawText("g", 50, 50 + (0-mTextBounds.top) / 2, mTextPaint);
			canvas.drawLine(0, 50, 100, 50, mTextPaint);
			canvas.drawLine(50, 0, 50, 100, mTextPaint);
		}

	}

}
