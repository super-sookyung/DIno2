package com.example.dino;

import com.example.dino.CoverTodo;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;



@Entity(tableName = "smallTodo_table",foreignKeys = @ForeignKey(entity = CoverTodo.class, parentColumns = "CoverTodo",childColumns = "smallTodoId"))
public class SmallTodo{
    @PrimaryKey
    public  int  smallTodoId;

    private String smallTodo;
    private boolean mon;
    private boolean tue;
    private boolean wed;
    private boolean thu;
    private boolean fri;
    private boolean sat;
    private boolean sun;

    public SmallTodo(String smallTodo, boolean mon, boolean tue, boolean wed, boolean thu, boolean fri, boolean sat, boolean sun) {
        this.smallTodo = smallTodo;
        this.mon = mon;
        this.tue = tue;
        this.wed = wed;
        this.thu = thu;
        this.fri = fri;
        this.sat = sat;
        this.sun = sun;
    }

    public int getSmallTodoId() {
        return smallTodoId;
    }

    public String getSmallTodo() {
        return smallTodo;
    }

    public boolean isMon() {
        return mon;
    }

    public boolean isTue() {
        return tue;
    }

    public boolean isWed() {
        return wed;
    }

    public boolean isThu() {
        return thu;
    }

    public boolean isFri() {
        return fri;
    }

    public boolean isSat() {
        return sat;
    }

    public boolean isSun() {
        return sun;
    }
}