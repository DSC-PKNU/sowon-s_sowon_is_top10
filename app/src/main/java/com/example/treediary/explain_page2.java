package com.example.treediary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.os.Bundle;

public class explain_page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.explain_page2);
    }

    public void home_button(View view) {
        Intent intent = new Intent( getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

}