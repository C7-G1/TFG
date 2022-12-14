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
import android.widget.TextView;
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
    TextView textoPregunta;
    int numPregunta=0;
    int vidas=3;
    int aciertos=0;
    crearBD preguntasBD;
    List<ListaPreguntas> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas);
        botonA=(Button)findViewById(R.id.btA);
        botonB=(Button)findViewById(R.id.btB);
        botonC=(Button)findViewById(R.id.btC);
        botonD=(Button)findViewById(R.id.btD);
        textoPregunta=(TextView)findViewById(R.id.tvPregunta);
        preguntasBD = new crearBD(this);
        String tematica=getIntent().getStringExtra("tema");
        System.out.print(tematica);
        lista= (ArrayList<ListaPreguntas>) datos(tematica);
        verPregunta();


    }


    public List<ListaPreguntas> datos(String tematica){
        Cursor contenido;

        SQLiteDatabase bd;
        bd=preguntasBD.getReadableDatabase();
        System.out.println(tematica);
        contenido = bd.rawQuery("select * from preguntas where tematica='"+tematica+"';", null);
        System.out.println("consulta");
        List<ListaPreguntas>lista=new ArrayList();
        while (contenido.moveToNext()){
            System.out.println(contenido.getInt(1));
            ListaPreguntas lp=new ListaPreguntas(contenido.getInt(0),contenido.getString(1),contenido.getString(2),contenido.getString(3),
                    contenido.getString(4),contenido.getString(5),contenido.getString(6),contenido.getString(7));
            lista.add(lp);
        }
        return lista;
    }



    public void verPregunta(){
        Random azar=new Random();
        int numPregunta=azar.nextInt(lista.size())+1;
        textoPregunta.setText(lista.get(numPregunta).getPregunta());
        botonA.setText(lista.get(numPregunta).getRespuesta1());
        botonB.setText(lista.get(numPregunta).getRespuesta2());
        botonC.setText(lista.get(numPregunta).getRespuesta3());
        botonD.setText(lista.get(numPregunta).getRespuesta4());
    }

    public void comprobarRespuesta(View v){
        String respuesta="";
        switch(v.getId()){
            case R.id.btA: respuesta=lista.get(numPregunta).getRespuesta1();
                break;
            case R.id.btB: respuesta=lista.get(numPregunta).getRespuesta2();
                break;
            case R.id.btC:respuesta=lista.get(numPregunta).getRespuesta3();
                break;
            case R.id.btD:respuesta=lista.get(numPregunta).getRespuesta4();
                break;
        }
        if (respuesta.equals(lista.get(numPregunta).getRespuestaCorrecta())){
            aciertos++;
            Toast toast = Toast.makeText(getApplicationContext(), "C O R R E C T A \n\n ACIERTOS:"+aciertos, Toast.LENGTH_LONG);
            toast.show();
        }else{
            Toast toast = Toast.makeText(getApplicationContext(),"F A L L O \n\n ACIERTOS:"+aciertos, Toast.LENGTH_LONG);
            toast.show();
        }

        if(aciertos==15){
            Toast toast = Toast.makeText(getApplicationContext(), "PRUEBA COMPLETADA \n ACIERTOS:"+aciertos, Toast.LENGTH_LONG);
            toast.show();
            this.finish();
        }else {
            verPregunta();
        }
    }

}