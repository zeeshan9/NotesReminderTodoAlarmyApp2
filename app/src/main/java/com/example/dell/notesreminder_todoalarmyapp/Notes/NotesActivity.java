package com.example.dell.notesreminder_todoalarmyapp.Notes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.dell.notesreminder_todoalarmyapp.R;

public class NotesActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private NotesAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        mRecyclerView = (RecyclerView) findViewById(R.id.notes_recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);

        mAdapter = new NotesAdapter();
        mRecyclerView.setAdapter(mAdapter);

    }
}
