package com.zyl.ndkdemo002;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.zyl.ndkdemo002.cpp.HelloNDK;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, HelloNDK.stringFromNDK(), Toast.LENGTH_LONG).show();
    }

    static {
        System.loadLibrary("hellondk");
    }
}
