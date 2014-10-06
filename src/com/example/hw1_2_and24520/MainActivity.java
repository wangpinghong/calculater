package com.example.hw1_2_and24520;

import android.R.integer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
private int c,num1,num2,x=2;
private String a="",b="",ans="";
int splitter;
private Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,btPlus,btMin,btC,btA,btans,clear,bt0;
private EditText editText;
private Boolean ab=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clear=(Button) findViewById(R.id.button5);
        bt0=(Button) findViewById(R.id.button21);
        bt1=(Button) findViewById(R.id.button17);
        bt2=(Button) findViewById(R.id.button18);
        bt3=(Button) findViewById(R.id.button19);
        bt4=(Button) findViewById(R.id.button13);
        bt5=(Button) findViewById(R.id.button14);
        bt6=(Button) findViewById(R.id.button15);
        bt7=(Button) findViewById(R.id.button9);
        bt8=(Button) findViewById(R.id.button10);
        bt9=(Button) findViewById(R.id.button11);
        btPlus=(Button) findViewById(R.id.button16);
        btMin=(Button) findViewById(R.id.button12);
        btC=(Button) findViewById(R.id.button7);
        btA=(Button) findViewById(R.id.button8);
        btans=(Button)findViewById(R.id.button20);
        editText=(EditText) findViewById(R.id.editText1);
        bt0.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				if(x==1){
					reset();
					x=2;
				}
				ans+="0";
				if(ab){
					a+="0";
				}else{
					b+="0";
				}
				editText.setText(ans);
			}
		});
        bt1.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				if(x==1){
					reset();
					x=2;
				}
				ans+="1";
				if(ab){
					a+="1";
				}else{
					b+="1";
				}
				editText.setText(ans);
			}
		});
        bt2.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				if(x==1){
					reset();
					x=2;
				}
				ans+="2";
				if(ab){
					a+="2";
				}else{
					b+="2";
				}
				editText.setText(ans);
			}
		});
        bt3.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				if(x==1){
					reset();
					x=2;
				}
				ans+="3";
				if(ab){
					a+="3";
				}else{
					b+="3";
				}
				editText.setText(ans);
			}
		});
        bt4.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				if(x==1){
					reset();
					x=2;
				}
				ans+="4";
				if(ab){
					a+="4";
				}else{
					b+="4";
				}
				editText.setText(ans);
			}
		});
        bt5.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				if(x==1){
					reset();
					x=2;
				}
				ans+="5";
				if(ab){
					a+="5";
				}else{
					b+="5";
				}
				editText.setText(ans);
			}
		});
        bt6.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				if(x==1){
					reset();
					x=2;
				}
				ans+="6";
				if(ab){
					a+="6";
				}else{
					b+="6";
				}
				editText.setText(ans);
			}
		});
        bt7.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				if(x==1){
					reset();
					x=2;
				}
				ans+="7";
				if(ab){
					a+="7";
				}else{
					b+="7";
				}
				editText.setText(ans);
			}
		});
        bt8.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				if(x==1){
					reset();
					x=2;
				}
				ans+="8";
				if(ab){
					a+="8";
				}else{
					b+="8";
				}
				editText.setText(ans);
			}
		});
        bt9.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				if(x==1){
					reset();
					x=2;
				}
				ans+="9";
				if(ab){
					a+="9";
				}else{
					b+="9";
				}
				editText.setText(ans);
			}
		});
        btPlus.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				ans+="+";
				ab=false;
				splitter=1;
				editText.setText(ans);
			}
		});
        btMin.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				ans+="-";
				ab=false;
				splitter=2;
				editText.setText(ans);
			}
		});
        btC.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				ans+="/";
				ab=false;
				splitter=4;
				editText.setText(ans);
			}
		});
        btA.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				ans+="*";
				ab=false;
				splitter=3;
				editText.setText(ans);
			}
		});
        btans.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				if(ab==false){
					if(splitter==1){
						num1=Integer.valueOf(a).intValue();
						num2=Integer.valueOf(b).intValue();
						c=num1+num2;
					}else if(splitter==2){
						c=(Integer.valueOf(a).intValue()-Integer.valueOf(b).intValue());
					}else if(splitter==3){
						
						c=Integer.valueOf(a).intValue()*Integer.valueOf(b).intValue();
					}else if(splitter==4){
						c=Integer.valueOf(a).intValue()/Integer.valueOf(b).intValue();
					}
				}
				editText.setText(String.valueOf(c));
				x=1;
				a="";
				b="";
				ab=true;
			}
		});
        clear.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				reset();
			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void reset(){
    	a="";
    	b="";
    	ans="";
    	ab=true;
    	editText.setText("");
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
