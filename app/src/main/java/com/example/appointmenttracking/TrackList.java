package com.example.appointmenttracking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TrackList extends AppCompatActivity {
    ClientDatabaseHelper clientdb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_list);
        clientdb=new ClientDatabaseHelper(TrackList.this);
    }
}