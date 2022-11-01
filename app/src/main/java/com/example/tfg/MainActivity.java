package com.example.tfg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button empezar;
crearBD preguntasBD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        empezar=findViewById(R.id.btEmpezar);
        preguntasBD = new crearBD(this);
        SQLiteDatabase bd;
        bd=preguntasBD.getWritableDatabase();
        bd.execSQL("INSERT INTO preguntas VALUES(1, '¿De que tipo de Pikachu?', 'Fuego','Agua','Electrico','Planta','Electrico', 'Pokemon');");
        bd.execSQL("INSERT INTO preguntas VALUES(2, '¿De que tipo de Bulbasaur?', 'Fuego','Agua','Electrico','Planta','Planta', 'Pokemon');");
        bd.execSQL("INSERT INTO preguntas VALUES(3, '¿De que tipo de Charmander?', 'Fuego','Agua','Electrico','Planta','Fuego', 'Pokemon');");
        bd.execSQL("INSERT INTO preguntas VALUES(4, '¿De que tipo de Squirtle?', 'Fuego','Agua','Electrico','Planta','Agua', 'Pokemon');");
        bd.execSQL("INSERT INTO preguntas VALUES(5, '¿De que tipo de Abra?', 'Hierro','Dragon','Psiquico','Fantasma','Psiquico', 'Pokemon');");
        bd.execSQL("INSERT INTO preguntas VALUES(6, '¿De que tipo de Duskull?', 'Hierro','Dragon','Psiquico','Fantasma','Fantasma', 'Pokemon');");
        bd.execSQL("INSERT INTO preguntas VALUES(7, '¿De que tipo de Axew?', 'Hierro','Dragon','Psiquico','Fantasma','Dragon', 'Pokemon');");
        bd.execSQL("INSERT INTO preguntas VALUES(8, '¿De que tipo de Lapras?', 'Dragon-Lucha','Fantasma-Toxico','Agua-Hielo','Siniestro','Agua-Hielo', 'Pokemon');");
        bd.execSQL("INSERT INTO preguntas VALUES(9, '¿De que tipo de Articuno?', 'Hielo-Volador','Agua-Hielo','Fantasma-Toxico','Siniestro','Hielo-Volador', 'Pokemon');");
        bd.execSQL("INSERT INTO preguntas VALUES(10, '¿De que tipo de Wishcash?', 'Agua-Electrico','Agua-Hielo','Dragon-Agua','Agua-Lucha','Agua-Electrico', 'Pokemon');");
        bd.execSQL("INSERT INTO preguntas VALUES(11, '¿De que tipo de Oshawott?', 'Hielo','Agua','Fantasma','Planta','Agua', 'Pokemon');");
        bd.execSQL("INSERT INTO preguntas VALUES(12, '¿De que tipo de Ariados?', 'Hielo-Acero','Agua-Normal','Bicho','Bicho-Veneno','Bicho-Veneno', 'Pokemon');");
        bd.execSQL("INSERT INTO preguntas VALUES(13, '¿De que tipo de Panshear?', 'Hielo','Agua','Fuego','Planta','Fuego', 'Pokemon');");
        bd.execSQL("INSERT INTO preguntas VALUES(14, '¿De que tipo de Pansage?', 'Hielo','Agua','Fantasma','Planta','Planta', 'Pokemon');");
        bd.execSQL("INSERT INTO preguntas VALUES(15, '¿De que tipo de Pampour?', 'Hielo','Agua','Fantasma','Planta','Agua', 'Pokemon');");

    }
    public void listaTemas(View v){

    }

    public void pantallaPreguntas(View v){
        Intent i=new Intent(this,Preguntas.class);
        startActivity(i);
    }
        }


