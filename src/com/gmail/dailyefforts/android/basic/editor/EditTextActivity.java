package com.gmail.dailyefforts.android.basic.editor;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;

import com.gmail.dailyefforts.android.basic.R;

public class EditTextActivity extends Activity {

	private EditText mEditText;

	InputMethodManager mInputMethodManager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.edittext_activity_ui);

		mEditText = (EditText) findViewById(R.id.et_edittext_activity_01);

		mInputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);

		mEditText.addTextChangedListener(new TextWatcher() {

			@Override
			public void onTextChanged(CharSequence s, int start, int before,
					int count) {

			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {

			}

			@Override
			public void afterTextChanged(Editable s) {

				Toast.makeText(EditTextActivity.this,
						"afterTextChanged(): " + s.toString(),
						Toast.LENGTH_SHORT).show();
				
				if (mEditText.getImeOptions() == EditorInfo.IME_ACTION_DONE) {
					mEditText.setImeOptions(EditorInfo.IME_ACTION_GO);
				}
//				mInputMethodManager.restartInput(mEditText);
//				mInputMethodManager.hideSoftInputFromInputMethod(token, flags)
				mInputMethodManager.showSoftInput(mEditText, 0);

			}
		});
	}

}
