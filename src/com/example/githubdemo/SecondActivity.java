package com.example.githubdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends Activity {
	
	private Activity mActivity;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_second);
		mActivity = this;
		
		initView();
		
		
	}

	private void initView() {
		Toast.makeText(mActivity, "hello dabin", 0).show();
		
		System.out.println("aaaaaaaaaaaaaa");
		System.out.println("bbbbbbbbbbbbb");
		
	}


}
