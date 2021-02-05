package com.example.treediary.dbhelper;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.treediary.entities.DiaryEntity;

@Database(entities = {DiaryEntity.class}, version = 1,exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract DiaryDAO diaryDAO();

}