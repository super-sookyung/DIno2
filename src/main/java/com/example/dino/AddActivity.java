package com.example.dino;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newlist);

        b = (Button)findViewById(R.id.add);

        final EditText e1 = (EditText) findViewById(R.id.addHighTodo);
        final EditText e2 = (EditText) findViewById(R.id.addLowTodo);

        b.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AddActivity.this,MainActivity.class);

                intent.putExtra("what",e1.getText().toString());
                intent.putExtra("hu",e2.getText().toString());
                startActivity(intent);

            }
        });


    }
        }
