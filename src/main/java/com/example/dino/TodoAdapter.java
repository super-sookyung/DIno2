package com.example.dino;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class TodoAdapter extends RecyclerView.Adapter<TodoAdapter.TodoHolder> {
    private List<BigTodo> todos = new ArrayList <>(  );
    @NonNull
    @Override
    public TodoHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate( R.layout.todo_list_item,parent,false );
        return new TodoHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull TodoHolder todoHolder, int i) {


    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class TodoHolder extends RecyclerView.ViewHolder{
        private TextView textViewBig;
        private TextView textViewCover;
        private TextView textViewsmall;


        public TodoHolder(@NonNull View itemView) {
            super( itemView );
            if ( itemView.findViewById( R.id.addLowTodo ) == null){
                textViewCover = itemView.findViewById( R.id.addHighTodo );}
            else {
                textViewBig = itemView.findViewById( R.id.addHighTodo );
                textViewsmall = itemView.findViewById( R.id.addLowTodo );
            }
        }
    }
}
