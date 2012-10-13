package com.uc.widget.stackview;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class StackViewAdapter extends BaseAdapter {

	public static final String TAG = "StatckViewAdapter";
	
	private static final int TEST_VIEW_COUNT = 3;
	private View[] mTestViews = new View[TEST_VIEW_COUNT];
	
	private Context mContext;
	public StackViewAdapter(Context context) {
		mContext = context;
		fillupTestViews();
	}
	
	private static int[] mFakeRamdomColors = new int[]{
		Color.RED, Color.GREEN, Color.BLUE
	};
	public void fillupTestViews() {
		for (int i=0; i<TEST_VIEW_COUNT; i++) {
			mTestViews[i] = new View(mContext);
			mTestViews[i].setBackgroundColor(mFakeRamdomColors[i%mFakeRamdomColors.length]);
		}
	}
	
	@Override
	public int getCount() {	
		return mTestViews.length;
	}

	@Override
	public Object getItem(int arg0) {
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		return mTestViews[position];
	}

}
