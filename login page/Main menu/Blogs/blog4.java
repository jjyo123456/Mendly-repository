package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class blog4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog4);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView blogtext = findViewById(R.id.blog4);
    }
}