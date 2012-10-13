package com.uc.widget.stackview;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;

public class StackView extends AdapterView<StackViewAdapter> {

	public static final String TAG = "StackView";
	
	private StackViewAdapter mAdapter;
	
	public StackView(Context context) {
		super(context);
	}
	
	@Override
	public StackViewAdapter getAdapter() {
		return mAdapter;
	}

	@Override
	public View getSelectedView() {	
		return null;
	}

	@Override
	public void setAdapter(StackViewAdapter adapter) {
		mAdapter = adapter;
	}

	@Override
	public void setSelection(int position) {
		
	}
	
	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
	}

	@Override
	protected void onLayout(boolean changed, int left, int top, int right,
			int bottom) {
		super.onLayout(changed, left, top, right, bottom);
	}
}
