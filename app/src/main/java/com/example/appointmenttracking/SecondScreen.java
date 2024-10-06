package com.example.appointmenttracking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondScreen extends AppCompatActivity {
Button agtbtn,mgrbtn;
ClientDatabaseHelper clientdb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        clientdb=new ClientDatabaseHelper(SecondScreen.this);

        agtbtn=findViewById(R.id.agtbtn);
        mgrbtn=findViewById(R.id.mnrbtn);

        agtbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SecondScreen.this,AgentPage.class);
                startActivity(intent);
            }
        });
        mgrbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SecondScreen.this,ManagerLogin.class);
                startActivity(intent);
            }
        });
    }
}