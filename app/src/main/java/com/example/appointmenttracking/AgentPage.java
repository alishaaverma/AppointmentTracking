package com.example.appointmenttracking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AgentPage extends AppCompatActivity {
Button addclientbtn, trackclientbtn;
    ClientDatabaseHelper clientdb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agent_page);
        clientdb=new ClientDatabaseHelper(AgentPage.this);

        addclientbtn=findViewById(R.id.newclintbtn);
        trackclientbtn=findViewById(R.id.listbtn);


        addclientbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AgentPage.this,NewClientAdd.class);
                startActivity(intent);
            }
        });
        trackclientbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AgentPage.this,TrackList.class);
                startActivity(intent);
            }
        });
    }
}