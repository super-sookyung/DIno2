package com.example.dino;

import android.app.Application;
import android.os.AsyncTask;

import java.util.List;
import android.arch.lifecycle.LiveData;



public class TodoRepository {
    private BigTodoDao BigtodoDao;
    private CoverTodoDao CovertodoDao;
    private SmallTodoDao SmalltodoDao;

    private LiveData<List<BigTodo>> bigAllTodos;
    private LiveData<List<CoverTodo>> coverAlltodos;
    private LiveData<List<SmallTodo>> smallAlltodos;

    public TodoRepository(Application application){
        TodoDatabase todoDatabase = TodoDatabase.getInstance(application);
        BigtodoDao = todoDatabase.BigTodoDao();
        CovertodoDao = todoDatabase.CoverTodoDao();
        SmalltodoDao = todoDatabase.SmallTodoDao();
//        bigAllTodos = BigTodoDao.getAllBidTodos();
    }

    public void Biginsert(BigTodo todo){
        new InsertTodoAsyncTask(BigtodoDao).execute(todo);

    }
    public  void update(BigTodo todo){
        new UpdateTodoAsyncTask(BigtodoDao).execute(todo);

    }
    public void delete(BigTodo BigtodoDao){

    }
    public LiveData<List<BigTodo>> getAllBigTodos(){
        return bigAllTodos;
    }

//    public void Coverinsert(CoverTodo todo){
//        new InsertTodoAsyncTask( CovertodoDao ).execute( todo );
//    }


    private static class InsertTodoAsyncTask extends AsyncTask<BigTodo, Void, Void>{
        private BigTodoDao bigTodoDao;
        private CoverTodoDao coverTodoDao;
        private SmallTodoDao smallTodoDao;

        private InsertTodoAsyncTask(BigTodoDao bigTodoDao){
            this.bigTodoDao = bigTodoDao;
        }
        private InsertTodoAsyncTask(CoverTodoDao coverTodoDao){
            this.coverTodoDao = coverTodoDao;
        }
        private InsertTodoAsyncTask(SmallTodoDao smallTodoDao){
            this.smallTodoDao = smallTodoDao;
        }

        @Override
        protected Void doInBackground(BigTodo... todos) {
            bigTodoDao.insert(todos[0]);
            return null;
        }
    }

    private static class UpdateTodoAsyncTask extends AsyncTask<BigTodo, Void, Void>{
        private BigTodoDao bigTodoDao;

        private UpdateTodoAsyncTask(BigTodoDao bigTodoDao){
            this.bigTodoDao = bigTodoDao;
        }

        @Override
        protected Void doInBackground(BigTodo... todos) {
            bigTodoDao.update(todos[0]);
            return null;
        }
    }

    private static class DeleteTodoAsyncTask extends AsyncTask<BigTodo, Void, Void>{
        private BigTodoDao bigTodoDao;

        private DeleteTodoAsyncTask(BigTodoDao bigTodoDao){
            this.bigTodoDao = bigTodoDao;
        }

        @Override
        protected Void doInBackground(BigTodo... todos) {
            bigTodoDao.delete(todos[0]);
            return null;
        }
    }

}
