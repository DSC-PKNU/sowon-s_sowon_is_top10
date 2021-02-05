package com.example.treediary;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.room.Room;

import com.example.treediary.dbhelper.AppDatabase;
import com.example.treediary.entities.DiaryEntity;
import com.example.treediary.utilities.DiaryListAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class ListOfDiaryActivity extends AppCompatActivity {
    public Context context;
    public AppDatabase db;
    public ListView lstvwDiaryList;
    private SearchView searchView;
    DiaryListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listof_diary);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Diaries");



        context = this;

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, CreateNewDiary.class);
                startActivity(intent);
            }
        });
        LoadNotes();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);

        searchView = (SearchView) menu.findItem(R.id.app_bar_search)
                .getActionView();

        searchView.setSubmitButtonEnabled(true);


        return super.onCreateOptionsMenu(menu);

    }



    public void LoadNotes(){
        lstvwDiaryList = (ListView)findViewById(R.id.mydiarysList);
        db = Room.databaseBuilder(this,AppDatabase.class,"DiaryDB").build();

        new AgentAsyncTask().execute();
    }

    private class AgentAsyncTask extends AsyncTask<Void, Void, Integer> {

        @Override
        protected Integer doInBackground(Void... params) {
            List<DiaryEntity> diaryEntities = new ArrayList<>();
            diaryEntities = db.diaryDAO().GetAll();

            adapter = new DiaryListAdapter(context, diaryEntities);

            lstvwDiaryList.setAdapter(adapter);

            return 0;
        }

        @Override
        protected void onPostExecute(Integer agentsCount) {

        }
    }


}