package com.example.group4_inclass02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String button1 = getString(R.string.button);
        String button2 = getString(R.string.button2);
        String button3 = getString(R.string.button3);
        String button5 = getString(R.string.button5);
        String button6 = getString(R.string.button6);
        String button7 = getString(R.string.button7);
    }

}