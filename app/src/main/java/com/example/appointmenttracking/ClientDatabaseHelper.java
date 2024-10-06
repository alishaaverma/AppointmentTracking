package com.example.appointmenttracking;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ClientDatabaseHelper extends SQLiteOpenHelper {
    public static final String DB_NAME="client.db";
    public static final String TABLE_NAME="clientinfo.db";
    public static final String COL_ID="clientid";
    public static final String COL_NAME="clientname";
    public static final String COL_EMAIL="clientemail";
    public static final String COL_NUMBER="clientnumber";
    public static final String COL_ADDRESS="clientaddress";
    public static final String COL_DATE_TIME="clientdatetime";
    public static final String COL_COMMENT="clientcomments";


    public ClientDatabaseHelper(@Nullable Context context) {
        super(context, DB_NAME, null, 1);
        SQLiteDatabase db=this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " +TABLE_NAME+ "(clientid INTEGER PRIMARY KEY AUTOINCREMENT, clientname TEXT,clientemail TEXT,clientnumber TEXT,clientaddress TEXT,clientdatetime TEXT,clientcomments TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists " + TABLE_NAME);
    }
}
