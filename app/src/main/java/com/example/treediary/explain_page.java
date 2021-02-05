package com.example.treediary;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class explain_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.explain_page);
    }

    public void ClickButton1(View view) {
        Intent intent = new Intent(getApplicationContext(), explain_page2.class);
        startActivity(intent);
    }
}