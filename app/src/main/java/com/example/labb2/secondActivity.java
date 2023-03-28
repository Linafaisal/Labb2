package com.example.labb2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    Intent i = getIntent();
    String s = i.getStringExtra(  "PersonName");

    TextView tv = findViewById(R.id.received_value_id);
    tv.setText("Hello " +s+" !");
    }
}