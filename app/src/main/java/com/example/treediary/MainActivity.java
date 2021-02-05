package com.example.treediary;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.RequiresPermission;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onButtonClicked(View view) {
        Intent intent = new Intent( getApplicationContext(), explain_page.class);
        startActivity(intent);
    }

    public void writeButton(View view) {
        Intent intent = new Intent( getApplicationContext(), CreateNewDiary.class);
        startActivity(intent);
    }

    public void listButton(View view) {
        Intent intent = new Intent( getApplicationContext(), ListOfDiaryActivity.class);
        startActivity(intent);
    }

}