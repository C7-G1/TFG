package com.example.tfg;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class crearBD extends SQLiteOpenHelper {
    public crearBD(@Nullable Context context){super(context,"bdPreguntas.sbd", null, 1);

    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table if not exists preguntas(codigo varchar(10) primary key, pregunta varchar(100), respuesta1 varchar(50),respuesta2 varchar(50),respuesta3 varchar(50),respuesta4 varchar(50),respuestaCorrecta varchar(50), tematica varchar(50));");    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
