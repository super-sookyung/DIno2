package com.example.dino;

import java.util.List;
import android.arch.lifecycle.LiveData;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface BigTodoDao {
    @Insert
    void insert(BigTodo bigtodo);
    @Update
    void update(BigTodo bigtodo);
    @Delete
    void delete(BigTodo bigtodo);
    @Query("DELETE FROM bigTodo_table")
    void deleteAlltodos();
    @Query("SELECT * FROM bigTodo_table ORDER BY bigTodo DESC")
    LiveData<List<BigTodo>> getAllBigToDos();
}
