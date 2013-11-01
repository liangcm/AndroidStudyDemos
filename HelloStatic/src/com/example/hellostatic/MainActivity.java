package com.example.hellostatic;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {
	private static final String TAG = "HelloStatic";

	private static Drawable d;
	private static View v;
	private View notStaticV;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		if (d == null) {
			d = getResources().getDrawable(R.drawable.test);
			Log.d(TAG, "d is null");
			
		} else {
			Log.d(TAG, "d is not null");
		}
		
		if (v == null) {
			v = new View(this);
			Log.d(TAG, "v is null");
			
		} else {
			Log.d(TAG, "v is not null");
		}
		
		if (notStaticV == null) {
			notStaticV = new View(this);
			Log.d(TAG, "notStaticV is null");
			
		} else {
			Log.d(TAG, "notStaticV is not null");
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (item.getItemId() == R.id.action_settings) {
			this.finish();
		}
		return super.onOptionsItemSelected(item);
	}
	
	

}
