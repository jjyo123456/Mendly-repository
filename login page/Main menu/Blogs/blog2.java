package com.example.recyclerview;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class blog2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog1);
         @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView textblog = findViewById(R.id.blog2);
    }
}