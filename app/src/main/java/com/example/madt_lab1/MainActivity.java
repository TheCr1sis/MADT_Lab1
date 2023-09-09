package com.example.madt_lab1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.graphics.Color;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(View v){
        TextView tv = findViewById(R.id.textView);
        tv.setText("Completely new text!");
    }

    public void changeColor(View v) {
        TextView tv = findViewById(R.id.textView);
        tv.setTextColor(Color.RED);
    }
}