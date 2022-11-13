package com.example.tfg;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Preguntas extends AppCompatActivity {

    Button botonA;
    Button botonB;
    Button botonC;
    Button botonD;
    int vidas=3;
    int aciertos=0;
    crearBD preguntasBD;
    Intent i=getIntent();
    String tematica;
    Cursor contenido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas);
        botonA=(Button)findViewById(R.id.btA);
        botonB=(Button)findViewById(R.id.btB);
        botonC=(Button)findViewById(R.id.btC);
        botonD=(Button)findViewById(R.id.btD);
        crearLista();


    }


    public void datos(){

        if(tematica.equals(i.getStringExtra("Pokemon"))){
            preguntasBD = new crearBD(this);
            SQLiteDatabase bd;
            bd=preguntasBD.getReadableDatabase();
             contenido = bd.rawQuery("select * from preguntas where tematica='" + tematica + "';", null);
        }

        if(tematica.equals(i.getStringExtra("Marvel"))) {
            preguntasBD = new crearBD(this);
            SQLiteDatabase bd;
            bd = preguntasBD.getReadableDatabase();
             contenido = bd.rawQuery("select * from preguntas where tematica='" + tematica + "';", null);
        }
        List<Object>listaPreguntas=new ArrayList<Object>();
            ListaPreguntas lp=new ListaPreguntas(contenido.getInt(1),contenido.getString(2),contenido.getString(3),contenido.getString(4),contenido.getString(5),contenido.getString(6),
                    contenido.getString(7),contenido.getString(8));




    }

    public static void crearLista(){

    }

    public void preguntas(View v){
        Random azar=new Random();
        int op=azar.nextInt(2)+1;
        int puntos=0;



    }
    public void contadorAciertos(int  aciertos){
        System.out.println(aciertos);
        if(aciertos==15){
            victoria(this);
        }

    }
    public void contadorVidas(int vidas){
        vidas--;
        if (vidas==0){
            derrota(this);
        }
    }

    public void victoria(Context contexto){
        Toast t= Toast.makeText(contexto,"Has ganado",Toast.LENGTH_LONG);
        t.show();
    }
    public void derrota(Context contexto) {
        Toast t = Toast.makeText(contexto, "Has perdido", Toast.LENGTH_LONG);
        t.show();
    }


}