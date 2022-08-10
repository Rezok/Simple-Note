package com.example.simplenote.Database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;

@Entity(tableName = "items")
public class Item {

    @ColumnInfo(name = "id")
    private int id;

    @ColumnInfo(name = "title")
    private String title;

    @ColumnInfo(name = "status")
    private int status;

    @Ignore
    public Item(){

    }

    public Item(int id, String title, int status) {
        this.id = id;
        this.title = title;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
