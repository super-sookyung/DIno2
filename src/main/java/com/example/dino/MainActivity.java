package com.example.dino;

import android.support.v4.app.Fragment;
import android.arch.lifecycle.ViewModelProviders;
import android.arch.lifecycle.Observer;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;




public class MainActivity extends AppCompatActivity {

    private TodoViewModel todoViewModel;
    private static final String TAG = "MainActivity";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.todo_list_item);

        todoViewModel = ViewModelProviders.of(this).get( TodoViewModel.class );
        todoViewModel.getAllBigToDos().observe(this, new Observer<List<BigTodo>>() {
            @Override
            public void onChanged(@Nullable List<BigTodo> todos) {
                Toast.makeText( MainActivity.this, "onChanged",Toast.LENGTH_SHORT).show();

            }
        });

        onClick(findViewById(R.id.plus));
    }


    public void onClick(View view){
        Button btn_plus = (Button) findViewById(R.id.plus);
        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddActivity.class);
                startActivity(intent);
            }
        });
    }


}




