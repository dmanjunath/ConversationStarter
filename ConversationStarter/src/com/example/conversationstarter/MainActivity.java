package com.example.conversationstarter;


import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.RelativeLayout;


@SuppressLint("ParserError")
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       
        
    }

   
    
    
    private void goToActivity(Class<? extends Activity> activityClass) {
        Intent newActivity = new Intent(this, activityClass);
        startActivity(newActivity);
    }
    
    
    public void showCategoriesPage(View clickedButton) {
        goToActivity(CategoriesPage.class);
    }
    
    public void showCategoriesPage() {
        goToActivity(CategoriesPage.class);
    }
    
    public void showRandom(View clickedButton){
    	goToActivity(RandomPage.class);
    }
    
}
