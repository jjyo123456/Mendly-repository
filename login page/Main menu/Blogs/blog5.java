package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;

public class blog5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog5);

        @SuppressLint({"WrongViewCast", "MissingInflatedId", "LocalSuppress"}) Button blogtext = findViewById(R.id.blog5);
    }
}