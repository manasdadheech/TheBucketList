package com.example.thebucketlist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Question extends Activity {
	ImageButton mBean;
	ImageButton mJack;
	
	public void bean(){
		Intent intent=new Intent();
		intent.setClass(this,Beanpage.class);
		startActivity(intent);
	}
	public void jack(){
			Intent intent=new Intent();
			intent.setClass(this,Jackpage.class);
			startActivity(intent);	
	}
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
       mBean=(ImageButton)findViewById(R.id.bean);
       mJack=(ImageButton)findViewById(R.id.jack);
       mBean.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {
				// TODO Auto-generated method stub
				bean();
				
			}
       	
       });
       mJack.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {
				// TODO Auto-generated method stub
				jack();
				
			}
       	
       });
       
       
       
    }

   

	

}
