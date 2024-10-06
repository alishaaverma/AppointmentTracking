package com.example.appointmenttracking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.LinearInterpolator;

import com.agrawalsuneet.dotsloader.loaders.LazyLoader;

public class MainActivity extends AppCompatActivity {
    Handler handler=new Handler();
    LazyLoader lazyLoader;
    ClientDatabaseHelper clientdb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clientdb=new ClientDatabaseHelper(MainActivity.this);
        lazyLoader=(LazyLoader)findViewById(R.id.lazyloader);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,SecondScreen.class);
                startActivity(intent);
                finish();
            }
        },3500);

        LazyLoader loader = new LazyLoader(this, 30, 20, ContextCompat.getColor(this, R.color.loader_selected),
                ContextCompat.getColor(this, R.color.loader_selected),
                ContextCompat.getColor(this, R.color.loader_selected));
        loader.setAnimDuration(500);
        loader.setFirstDelayDuration(100);
        loader.setSecondDelayDuration(200);
        loader.setInterpolator(new LinearInterpolator());

        lazyLoader.addView(loader);
    }
}