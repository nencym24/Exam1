package com.example.androidexam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    CardView GetFreeTrial;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GetFreeTrial = findViewById(R.id.GetFreeTrial);

        Intent intent = new Intent(MainActivity.this,TasksActivity.class);
        startActivity(intent);
    }
}