package com.gmail.dailyefforts.android.basic.media;

import com.gmail.dailyefforts.android.basic.R;
import com.gmail.dailyefforts.android.basic.R.layout;
import com.gmail.dailyefforts.android.basic.R.menu;
import com.gmail.dailyefforts.android.basic.media.MediaPlayerMp3.ButtonClickListener;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MediaPlayerMp3 extends Activity {

	private Button mBtnStop;
	private Button mBtnPlay;
	private MediaPlayer mMediaPlayer;
	private ButtonClickListener mButtonClickListener;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_media_player_mp3);

		mBtnPlay = (Button) findViewById(R.id.btn_media_player_mp3_play);
		mBtnStop = (Button) findViewById(R.id.btn_media_player_mp3_stop);
		
		mButtonClickListener = new ButtonClickListener();
		
		mBtnPlay.setOnClickListener(mButtonClickListener);
		mBtnStop.setOnClickListener(mButtonClickListener);
		
		mMediaPlayer = MediaPlayer.create(this, R.raw.may_it_be);
	}

	class ButtonClickListener implements View.OnClickListener {

		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.btn_media_player_mp3_play:
				startPlaying();
				break;
			case R.id.btn_media_player_mp3_stop:
				stopPlaying();
				break;
			}
		}

	}

	@Override
	protected void onStop() {
		super.onStop();
		if (mMediaPlayer != null) {
			mMediaPlayer.release();
		}
	}

	private void startPlaying() {
		if (mMediaPlayer != null) {
			mMediaPlayer.start();
		}
	}

	public void stopPlaying() {
		if (mMediaPlayer != null && mMediaPlayer.isPlaying()) {
			mMediaPlayer.stop();
		}
	}

}
