package com.example.ta.finalexamcpsu2016.Database;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

public class History {
    private static final String DATABASE_NAME = "HistoryPeople.db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_NAME = "People";       // ชื่อเทเบิล
    public static final String COL_id = "_id";              // บอกไอดี
    public static final String COL_name = "name";           // เก็บชื่อคน
    public static final String COL_username = "username";   // เก็บยูสเซอร์
    public static final String COL_password = "password";   // เก็บพาสเวริด์

    private static final String SQL_CRATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COL_id + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + COL_name + " TEXT, "
                    + COL_username + " TEXT, "
                    + COL_password + " IEXT"
                    +")";

//   public History(Context context) {
//      super(context, DATABASE_NAME, null, DATABASE_VERSION);
//   }

   // @Override
    private void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CRATE_TABLE);
        insertInitialData(db);
    }

    private void insertInitialData(SQLiteDatabase db){
        ContentValues cv = new ContentValues();
        cv.put(COL_id, "1");
        cv.put(COL_name, "Android Studio");
        cv.put(COL_username,"android");
        cv.put(COL_password,"123456");
        db.insert(TABLE_NAME, null, cv);

    }
   // @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }


}
