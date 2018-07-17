package com.example.dell.notesreminder_todoalarmyapp.Notes;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.dell.notesreminder_todoalarmyapp.R;

public class NotesActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private NotesAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        //Following code is to set floating button an action

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NotesActivity.this,AddNewNoteActivity.class);
                startActivity(intent);
            }
        });

        //Following code is to set Recycler View

        mRecyclerView = (RecyclerView) findViewById(R.id.notes_recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);

        mAdapter = new NotesAdapter();
        mRecyclerView.setAdapter(mAdapter);

    }
}
