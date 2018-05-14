package com.example.brom.activitiesapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class MountainDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountaindetails);





        Intent intent = getIntent();
        String mountain_name = intent.getStringExtra("MOUNTAIN_NAME");
        String mountain_location = intent.getStringExtra("MOUNTAIN_LOCATION");
        String mountain_height = intent.getStringExtra("MOUNTAIN_HEIGHT");
        Toast.makeText(getApplicationContext(),mountain_name, Toast.LENGTH_SHORT).show();
    }

}
