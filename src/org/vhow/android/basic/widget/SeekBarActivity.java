package org.vhow.android.basic.widget;

import org.vhow.android.basic.R;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;

public class SeekBarActivity extends Activity {
	private SeekBar mSeekBar;
	private TextView mTextView;
	private Context mContext;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.seekbar_activity_ui);

		mContext = this;

		mSeekBar = (SeekBar) findViewById(R.id.seekbar);
		mTextView = (TextView) findViewById(R.id.tv_seekbar);
		mSeekBar.setOnSeekBarChangeListener(mOnSeekBarChangeListener);
	}

	private OnSeekBarChangeListener mOnSeekBarChangeListener = new OnSeekBarChangeListener() {

		@Override
		public void onStopTrackingTouch(SeekBar seekBar) {
			Toast.makeText(mContext,
					"onStopTrackingTouch() at " + seekBar.getProgress(),
					Toast.LENGTH_SHORT).show();
		}

		@Override
		public void onStartTrackingTouch(SeekBar seekBar) {
			Toast.makeText(mContext,
					"onStartTrackingTouch() at " + seekBar.getProgress(),
					Toast.LENGTH_SHORT).show();
		}

		@Override
		public void onProgressChanged(SeekBar seekBar, int progress,
				boolean fromUser) {
			mTextView.setText("Current Prograss: " + String.valueOf(progress));
		}
	};

	// TODO learn the usage of OnSeekCompleteListener.
	private OnSeekCompleteListener mOnSeekCompleteListener = new OnSeekCompleteListener() {

		@Override
		public void onSeekComplete(MediaPlayer mp) {
			Toast.makeText(mContext, "onSeekComplete()", Toast.LENGTH_SHORT)
					.show();
		}
	};
}
