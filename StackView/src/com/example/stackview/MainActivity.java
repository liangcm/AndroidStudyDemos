package com.example.stackview;

import com.uc.widget.stackview.StackView;
import com.uc.widget.stackview.StackViewAdapter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {
	
	public static final String TAG = "MainActivity";
	
	private StackView mStackView;
	private StackViewAdapter mStackViewAdapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mStackView = new StackView(this);
        mStackViewAdapter = new StackViewAdapter(this);
        mStackView.setAdapter(mStackViewAdapter);
        setContentView(mStackView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
