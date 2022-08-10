package com.example.simplenote.Database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ItemDAO {

    @Insert
    public long addItem(Item item);

    @Update
    public int updateItem(Item item);

    @Delete
    public void deleteItem(Item item);

    //Select single item from
    @Query("SELECT * FROM items WHERE id ==id")
    public Item getItem();

    //Select all item which are to do
    @Query("SELECT * FROM items WHERE status ==0 ")
    public List<Item> getToDoItems();

    //Select all item which are done
    @Query("SELECT * FROM items WHERE status ==1")
    public List<Item> getDoneItems();
}
