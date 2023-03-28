package com.example.labb2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText e;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        b= (Button) findViewById(R.id.sendButton);
        e= findViewById(R.id.PersonName);
        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = e.getText().toString();
                Intent intent = new Intent(getApplicationContext(),secondActivity.class);
                intent.putExtra("PersonName",s);
                startActivity(intent);
            }
        });


}}