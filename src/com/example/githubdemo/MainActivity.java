package com.example.githubdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{

    private Button mButton;
    private Activity mActivity;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initView();
        setListener();
        mActivity = this;
    }

	private void setListener() {
		mButton.setOnClickListener(this);
		
	}

	private void initView() {
		mButton = (Button) findViewById(R.id.button);
		
	}

	

	@Override
	public void onClick(View view) {
		switch(view.getId()){
		case R.id.button:
			startActivity(new Intent(mActivity,SecondActivity.class));
			break;
		}
		
	}


 
    
}
