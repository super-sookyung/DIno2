package com.example.dino;

import android.arch.lifecycle.LiveData;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface SmallTodoDao {
    @Insert
    void insert(SmallTodo smalltodo);
    @Update
    void update(SmallTodo smalltodo);
    @Delete
    void delete(SmallTodo smalltodo);
    @Query("DELETE FROM smallTodo_table")
    void deleteAlltodos();
    @Query("SELECT * FROM smallTodo_table ORDER BY smallTodo DESC")
    LiveData<List<SmallTodo>> getAllSmallTodos();
}
