package com.example.dino;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = {BigTodo.class,CoverTodo.class,SmallTodo.class}, version = 1)

public abstract class TodoDatabase extends RoomDatabase {
    private static TodoDatabase instance;

    public abstract BigTodoDao BigTodoDao();

    public abstract CoverTodoDao CoverTodoDao();

    public abstract SmallTodoDao SmallTodoDao();

    public static synchronized TodoDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder( context.getApplicationContext(),
                    TodoDatabase.class, "todo_database" ).fallbackToDestructiveMigration()
                    .addCallback( roomCallback )
                    .build();
        }
        return instance;
    }

    private static TodoDatabase.Callback roomCallback = new TodoDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate( db );
            new PopulateDbAsyncTask( instance ).execute();
        }
    };

        private static class PopulateDbAsyncTask extends AsyncTask<Void, Void, Void> {
            private BigTodoDao bigTodoDao;
            private CoverTodoDao coverTodoDao;
            private SmallTodoDao smallTodoDao;

            private PopulateDbAsyncTask(TodoDatabase db) {
                bigTodoDao = db.BigTodoDao();
                coverTodoDao = db.CoverTodoDao();
                smallTodoDao = db.SmallTodoDao();
            }

            @Override
            protected Void doInBackground(Void... voids) {
                bigTodoDao.insert(new BigTodo("Title 1",true,true,true,true,true,true,true));
                coverTodoDao.insert(new CoverTodo( "sssss",true, true,true,true,true,true,true));
                return null;
            }
        }
};



