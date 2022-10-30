package com.example.tfg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

    }
    public void listaTemas(View v){

    }

    public void pantallaPreguntas(View v){
        Intent i=new Intent(this,Preguntas.class);
        startActivity(i);
    }
        }


