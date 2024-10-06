package com.example.appointmenttracking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ManagerPage extends AppCompatActivity {
    ClientDatabaseHelper clientdb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager_page);
        clientdb=new ClientDatabaseHelper(ManagerPage.this);
    }
}