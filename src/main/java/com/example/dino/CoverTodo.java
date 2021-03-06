package com.example.dino;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "coverTodo_table")
public class CoverTodo {
    @PrimaryKey(autoGenerate = true)
    private int coverId;
    private String CoverTodo;
    private boolean mon;
    private boolean tue;
    private boolean wed;
    private boolean thu;
    private boolean fri;
    private boolean sat;
    private boolean sun;

    public CoverTodo(String coverTodo, boolean mon, boolean tue, boolean wed, boolean thu, boolean fri, boolean sat, boolean sun) {
        CoverTodo = coverTodo;
        this.mon = mon;
        this.tue = tue;
        this.wed = wed;
        this.thu = thu;
        this.fri = fri;
        this.sat = sat;
        this.sun = sun;
    }

    public void setCoverId(int coverId) {
        this.coverId = coverId;
    }

    public int getCoverId() {
        return coverId;
    }

    public String getCoverTodo() {
        return CoverTodo;
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



