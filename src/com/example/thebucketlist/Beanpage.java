package com.example.thebucketlist;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
	
public class Beanpage extends Activity {
	Button button;
	
	public void result(){
 		Intent intent=new Intent();
 		intent.setClass(this,End.class);
 		startActivity(intent);
 	}
	public void result1(){
 		Intent intent=new Intent();
 		intent.setClass(this,End3.class);
 		startActivity(intent);
 	}
	 public void result2(){
	 		Intent intent1=new Intent();
	 		intent1.setClass(this,End2.class);
	 		startActivity(intent1);
	 	}
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beanpage);
        final CheckBox mcheckBox = (CheckBox) findViewById(R.id.wedding);
        final CheckBox mcheckBox1 = (CheckBox) findViewById(R.id.pizza);
         final CheckBox mcheckBox2 = (CheckBox) findViewById(R.id.food);
       
       
        button=(Button)findViewById(R.id.result);
        
       button.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			
			if (mcheckBox.isChecked()&&mcheckBox1.isChecked()&&mcheckBox2.isChecked())
				   	  result();
			else if(mcheckBox.isChecked()||mcheckBox1.isChecked()||mcheckBox2.isChecked())	
						result1();
			else 
				 	 result2();
				 
			}
			
        	
        });
       
    }

   

}
