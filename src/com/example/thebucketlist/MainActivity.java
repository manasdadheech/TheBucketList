package com.example.thebucketlist;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;


public class MainActivity extends Activity {
	
	ImageButton mbucket;
	public void question(){
		Intent intent=new Intent();
		intent.setClass(this,Question.class);
		startActivity(intent);
	}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbucket=(ImageButton)findViewById(R.id.bucket);
        mbucket.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {
				// TODO Auto-generated method stub
				question();				
			}
        	
        });
      
        	
        
    }

   
}
