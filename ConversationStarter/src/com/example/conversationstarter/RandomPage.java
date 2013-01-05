package com.example.conversationstarter;


import java.util.Random;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class RandomPage extends MainActivity{
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.random_page);
		
		
		Random r = new Random();
		int test = r.nextInt(5);
		
		final String[] links = getResources().getStringArray(R.array.test_array);
		
		
		TextView t = (TextView)findViewById(R.id.RtextView);
		t.setText(links[test]);
		
		
		
		
		
	}
	
	
	
}
