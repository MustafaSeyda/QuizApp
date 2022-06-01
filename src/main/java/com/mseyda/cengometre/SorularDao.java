package com.mseyda.cengometre;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class SorularDao {

   public ArrayList<Sorular>soru_çekme_üç_secenek(DB_Question vt,String table){
        ArrayList<Sorular>sorular=new ArrayList<>();
        SQLiteDatabase db=vt.getWritableDatabase();
        Cursor cursor=db.rawQuery("SELECT * FROM "+table,null);
        vt.onUpgrade(db,1,1);

        while(cursor.moveToNext()){
            int soru=cursor.getColumnIndex("soru");
            int a=cursor.getColumnIndex("a");
            int b=cursor.getColumnIndex("b");
            int c=cursor.getColumnIndex("c");
            Sorular s=new Sorular(cursor.getString(soru),
                    cursor.getString(a),
                    cursor.getString(b),
                    cursor.getString(c));
            System.out.println(s);
            sorular.add(s);
        }
        return sorular;
    }
    public ArrayList<Sorular>soru_çekme_dört_secenek(DB_Question vt,String table){
        ArrayList<Sorular>sorular=new ArrayList<>();
        SQLiteDatabase db=vt.getWritableDatabase();
        Cursor cursor=db.rawQuery("SELECT * FROM "+table,null);
        vt.onUpgrade(db,1,1);

        while(cursor.moveToNext()){
            int soru=cursor.getColumnIndex("soru");
            int a=cursor.getColumnIndex("a");
            int b=cursor.getColumnIndex("b");
            int c=cursor.getColumnIndex("c");
            int d=cursor.getColumnIndex("d");
            Sorular s=new Sorular(cursor.getString(soru),
                    cursor.getString(a),
                    cursor.getString(b),
                    cursor.getString(c),
                    cursor.getString(d));
            System.out.println(s);
            sorular.add(s);
        }
        return sorular;
    }
    public ArrayList<Sorular>soru_çekme_iki_secenek(DB_Question vt,String table){
        ArrayList<Sorular>sorular=new ArrayList<>();
        SQLiteDatabase db=vt.getWritableDatabase();
        Cursor cursor=db.rawQuery("SELECT * FROM "+table,null);
        vt.onUpgrade(db,1,1);

        while(cursor.moveToNext()){
            int soru=cursor.getColumnIndex("soru");
            int a=cursor.getColumnIndex("a");
            int b=cursor.getColumnIndex("b");

            Sorular s=new Sorular(cursor.getString(soru),
                    cursor.getString(a),
                    cursor.getString(b));
            System.out.println(s);
            sorular.add(s);
        }
        return sorular;
    }
}
