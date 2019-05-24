package com.example.dino;

import android.arch.lifecycle.LiveData;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface CoverTodoDao {
    @Insert
    void insert(CoverTodo covertodo);
    @Update
    void update(CoverTodo covertodo);
    @Delete
    void delete(CoverTodo covertodo);
    @Query("DELETE FROM coverTodo_table")
    void deleteAlltodos();
    @Query("SELECT * FROM coverTodo_table ORDER BY covertodo DESC")
    LiveData<List<CoverTodo>> getAllCoverTodo();
}
