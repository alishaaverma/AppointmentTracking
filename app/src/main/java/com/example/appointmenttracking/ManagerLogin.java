package com.example.appointmenttracking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ManagerLogin extends AppCompatActivity {
EditText loginidd,loginpasss;
Button btnloginn;
    ClientDatabaseHelper clientdb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager_login);
        clientdb=new ClientDatabaseHelper(ManagerLogin.this);

        loginidd=findViewById(R.id.loginid);
        loginpasss=findViewById(R.id.loginpass);
        btnloginn=findViewById(R.id.btnlogin);

        btnloginn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String adminemail=loginidd.getText().toString();
                String adminpassword=loginpasss.getText().toString();
                if(adminemail.equals("Admin123") && adminpassword.equals("Admin123@"))
                {
                    Intent adminlogin=new Intent(ManagerLogin.this,ManagerPage.class);
                    startActivity(adminlogin);
                    Toast.makeText(ManagerLogin.this,"Login Successfully",Toast.LENGTH_LONG).show();
                }
                else if (TextUtils.isEmpty(loginidd.getText().toString()) || TextUtils.isEmpty(loginpasss.getText().toString())){
                    Toast.makeText(ManagerLogin.this, "please enter userid & password", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(ManagerLogin.this, "id or password is incorrect", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}