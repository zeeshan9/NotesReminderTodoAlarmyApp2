package com.example.dell.notesreminder_todoalarmyapp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatImageView;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dell.notesreminder_todoalarmyapp.Notes.NotesActivity;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout mDrawerLayout;
    ActionBarDrawerToggle mActionBarDrawerToggle;
    NavigationView mNavigationView;
    TextView textView;
    AppCompatImageView appCompatImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView) findViewById(R.id.feather);
        textView.setClickable(true);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mActionBarDrawerToggle = new ActionBarDrawerToggle(this,mDrawerLayout,R.string.Open,R.string.Close);

        mDrawerLayout.addDrawerListener(mActionBarDrawerToggle);
        mActionBarDrawerToggle.syncState();

        mActionBarDrawerToggle.setDrawerSlideAnimationEnabled(true);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mNavigationView = (NavigationView) findViewById(R.id.navigation_view);
        mNavigationView.setNavigationItemSelectedListener(this);


    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(mActionBarDrawerToggle.onOptionsItemSelected(item))
            return true;

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();

        if (id==R.id.homeAsUp)
            Toast.makeText(this,"Home is selected", Toast.LENGTH_LONG).show();

        if (id==R.id.item_1) {
            Toast.makeText(this, "1 is selected", Toast.LENGTH_LONG).show();
        mDrawerLayout.closeDrawer(Gravity.START,true);
        }
        if (id==R.id.item_2)
            Toast.makeText(this,"2 is selected", Toast.LENGTH_LONG).show();
        if (id==R.id.item_3)
            Toast.makeText(this,"3 is selected", Toast.LENGTH_LONG).show();

        return false;
    }



    public void perform_action(View view){

        Toast.makeText(this,"Notes",Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, NotesActivity.class));
    }
}
