package com.example.thebucketlist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
public class Jackpage extends Activity {
	Button button;
	public void result3(){
 		Intent intent=new Intent();
 		intent.setClass(this,End.class);
 		startActivity(intent);
 	}
	 public void result4(){
	 		Intent intent1=new Intent();
	 		intent1.setClass(this,End2.class);
	 		startActivity(intent1);
	 	}
	 public void result5(){
	 		Intent intent=new Intent();
	 		intent.setClass(this,End3.class);
	 		startActivity(intent);
	 	}
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jackpage);
        final CheckBox mcheckBox = (CheckBox) findViewById(R.id.cliff);
        final CheckBox mcheckBox1 = (CheckBox) findViewById(R.id.kiss);
         final CheckBox mcheckBox2 = (CheckBox) findViewById(R.id.gta);
         
         button=(Button)findViewById(R.id.result);
         
         button.setOnClickListener(new OnClickListener(){

  			public void onClick(View v) {
  				// TODO Auto-generated method stub
  				
  				if (mcheckBox.isChecked()&&mcheckBox1.isChecked()&&mcheckBox2.isChecked())
  				   	  result3();
  				else if(mcheckBox.isChecked()||mcheckBox1.isChecked()||mcheckBox2.isChecked())	
  					result5();		        
  				 else 
  				 	 result4();
  				 
  			}
          	
          });
         
    }

   

}
