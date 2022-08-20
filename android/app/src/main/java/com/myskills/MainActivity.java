package com.myskills;

import com.facebook.react.ReactActivity;

import android.os.Bundle; 
import org.devio.rn.splashscreen.SplashScreen; 

public class MainActivity extends ReactActivity {

  @Override
  protected String getMainComponentName() {
    return "myskills";
  }

		// adicionado
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SplashScreen.show(this);  
        super.onCreate(savedInstanceState);
    }
}