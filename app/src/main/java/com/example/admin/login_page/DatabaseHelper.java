package com.example.admin.login_page;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "text.db";

    public static final int DATABASE_VERSION = 1;

    public static final String TABLE_NAME = "user";

    public static final String FULL_NAME =  "full_name";

    public static final String EMAIL_ID = "email_id";

    public static final String USER_NAME = "user_name";

    public static final String PASSWORD = "password";

    DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        /*String query = "create table "+TABLE_NAME+"("
                + FULL_NAME + " TEXT,"
                +EMAIL_ID+ " text, "
                +USER_NAME+ " text unique,"
                +PASSWORD+" text)";*/
        Log.d("DatabaseHelper", "inside onCreate()");
        String query = "CREATE TABLE " + TABLE_NAME + "("
                + FULL_NAME + " TEXT,"
                + EMAIL_ID + " TEXT, "
                + USER_NAME + " TEXT UNIQUE, "
                + PASSWORD + " TEXT );";

        sqLiteDatabase.execSQL(query);
    }

    public void inert_user(UserModel userModel){

        SQLiteDatabase writable = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(FULL_NAME,userModel.getFullname());
        contentValues.put(EMAIL_ID,userModel.getEmail_id());
        contentValues.put(USER_NAME,userModel.getUsername());
        contentValues.put(PASSWORD,userModel.getPassword());
        writable.insert(TABLE_NAME,null,contentValues);
    }

   /* public boolean checkmail(UserModel userModel){

        SQLiteDatabase readable = this.getReadableDatabase();
        //readable.rawQuery("select * from "+TABLE_NAME+" where userModel.getEmail_id = ?")
    }
*/
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
