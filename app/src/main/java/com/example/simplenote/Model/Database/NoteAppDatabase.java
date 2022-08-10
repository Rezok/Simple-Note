package com.example.simplenote.Database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Item.class}, version = 1)
public abstract class NoteAppDatabase extends RoomDatabase {

    public abstract ItemDAO getItemDAO();
}
