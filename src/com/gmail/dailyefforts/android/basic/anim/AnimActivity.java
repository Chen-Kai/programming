package com.gmail.dailyefforts.android.basic.anim;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.gmail.dailyefforts.android.basic.R;

public class AnimActivity extends Activity {
	private Button mBtnStartTranslate;
	private Button mBtnStartScale;
	private Button mBtnStartRotate;
	private Button mBtnStartAlpha;
	private Button mView;
	private BtnOnClickListener mBtnOnClickListener;
	private Button mBtnStartProperty;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.anim_activity_ui);

		mView = (Button) findViewById(R.id.btn_anim_view);
		mBtnStartTranslate = (Button) findViewById(R.id.btn_anim_start_translate);
		mBtnStartScale = (Button) findViewById(R.id.btn_anim_scale);
		mBtnStartRotate = (Button) findViewById(R.id.btn_anim_rotate);
		mBtnStartAlpha = (Button) findViewById(R.id.btn_anim_alpha);
		mBtnStartProperty = (Button) findViewById(R.id.btn_anim_property);

		mBtnOnClickListener = new BtnOnClickListener();
		mBtnStartTranslate.setOnClickListener(mBtnOnClickListener);
		mBtnStartScale.setOnClickListener(mBtnOnClickListener);
		mBtnStartRotate.setOnClickListener(mBtnOnClickListener);
		mBtnStartAlpha.setOnClickListener(mBtnOnClickListener);
		mBtnStartProperty.setOnClickListener(mBtnOnClickListener);
	}

	class BtnOnClickListener implements View.OnClickListener {
		private Animation mAnimation;

		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.btn_anim_start_translate:
				mAnimation = AnimationUtils.loadAnimation(AnimActivity.this,
						R.anim.translate);
				break;
			case R.id.btn_anim_scale:
				mAnimation = AnimationUtils.loadAnimation(AnimActivity.this,
						R.anim.scale);
				break;
			case R.id.btn_anim_rotate:
				mAnimation = AnimationUtils.loadAnimation(AnimActivity.this,
						R.anim.rotate);
				break;
			case R.id.btn_anim_alpha:
				mAnimation = AnimationUtils.loadAnimation(AnimActivity.this,
						R.anim.alpha);
				break;
			case R.id.btn_anim_property:
				AnimatorSet animation = (AnimatorSet) AnimatorInflater
						.loadAnimator(AnimActivity.this, R.animator.animator_set);
				animation.setTarget(mView);
				animation.start();
				return;
			}
			mView.startAnimation(mAnimation);
		}
	}
}
