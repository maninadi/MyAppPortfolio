package com.example.mnadimut.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Action listener for the buttons. Shows a toast message
     * @param v - Button clicked
     */
    public void showToast(View v){
        //Don't do anything if it is not clickable;
        if(!v.isClickable())
            return;
        Toast.makeText(getApplicationContext(),
                "This button will launch " + ((Button)v).getText()+" app!",
                Toast.LENGTH_SHORT).show();
    }
}
