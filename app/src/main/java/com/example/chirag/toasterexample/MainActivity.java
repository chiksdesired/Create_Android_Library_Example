package com.example.chirag.toasterexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.toasterlibrary.ToasterMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToasterMessage.s(MainActivity.this,"Library is created");


    }
}
