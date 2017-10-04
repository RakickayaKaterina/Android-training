package com.github.rakickayakaterina.testproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"Some message");


        Log.d(TAG,"Some text");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"This method was overridden");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"Method onStop was overridden");
    }
}
