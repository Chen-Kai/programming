package org.vhow.android.basic.anim;

import org.vhow.android.basic.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class AnimActivity extends Activity {
	private Button mBtnStartTranslate;
	private Button mBtnStartScale;
	private Button mBtnStartRotate;
	private Button mBtnStartAlpha;
	private Button mBtnView;
	private BtnOnClickListener mBtnOnClickListener;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.anim_activity_ui);

		mBtnView = (Button) findViewById(R.id.btn_anim_view);
		mBtnStartTranslate = (Button) findViewById(R.id.btn_anim_start_translate);
		mBtnStartScale = (Button) findViewById(R.id.btn_anim_scale);
		mBtnStartRotate = (Button) findViewById(R.id.btn_anim_rotate);
		mBtnStartAlpha = (Button) findViewById(R.id.btn_anim_alpha);

		mBtnOnClickListener = new BtnOnClickListener();
		mBtnStartTranslate.setOnClickListener(mBtnOnClickListener);
		mBtnStartScale.setOnClickListener(mBtnOnClickListener);
		mBtnStartRotate.setOnClickListener(mBtnOnClickListener);
		mBtnStartAlpha.setOnClickListener(mBtnOnClickListener);
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
			}
			mBtnView.startAnimation(mAnimation);
		}
	}
}
