package org.vhow.android.basic.popup;

import org.vhow.android.basic.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

public class MyPopupWindow extends PopupWindow {

	private Context mContext;
	private View mView;

	public MyPopupWindow(Context context) {
		super(context);
		mContext = context;
		LayoutInflater inflater = (LayoutInflater) mContext
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		mView = inflater.inflate(R.layout.my_popup_window_ui, null, false);

		setContentView(mView);
		
		this.setInputMethodMode(INPUT_METHOD_NOT_NEEDED);
//		this.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);

		// this.setSoftInputMode(mode)

	}

}
