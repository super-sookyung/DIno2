package com.example.dino;

import android.app.Application;
import android.app.ListActivity;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import java.util.List;

public class TodoViewModel extends AndroidViewModel {

    private TodoRepository repository;
    private LiveData<List<BigTodo>> bigAllToDos;


    public TodoViewModel(@NonNull Application application) {
        super(application);
        repository = new TodoRepository(application);
//        bigAllToDos = repository.getAllBigToDos();
    }

    public void Biginsert(BigTodo todo){
        repository.Biginsert( todo );
    }

    public void Bigupdate(BigTodo todo){
        repository.update(todo);
    }

    public void Bigdelete(BigTodo todo){
        repository.delete(todo);
    }

    public LiveData<List<BigTodo>> getAllBigToDos(){
        return bigAllToDos;
    }
}
