package com.example.tfg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button pokemon;
Button marvel;
crearBD preguntasBD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pokemon=(Button) findViewById(R.id.btPokemon);
        marvel=(Button) findViewById(R.id.btMarvel);
        preguntasBD = new crearBD(this);
        SQLiteDatabase bd;
        //bd=preguntasBD.getWritableDatabase();
        //Pokemon
        //bd.execSQL("INSERT INTO preguntas VALUES(1, '¿De que tipo de Pikachu?', 'Fuego','Agua','Electrico','Planta','Electrico', 'Pokemon');");
        //bd.execSQL("INSERT INTO preguntas VALUES(2, '¿De que tipo de Bulbasaur?', 'Fuego','Agua','Electrico','Planta','Planta', 'Pokemon');");
        //bd.execSQL("INSERT INTO preguntas VALUES(3, '¿De que tipo de Charmander?', 'Fuego','Agua','Electrico','Planta','Fuego', 'Pokemon');");
        //bd.execSQL("INSERT INTO preguntas VALUES(4, '¿De que tipo de Squirtle?', 'Fuego','Agua','Electrico','Planta','Agua', 'Pokemon');");
        //bd.execSQL("INSERT INTO preguntas VALUES(5, '¿De que tipo de Abra?', 'Hierro','Dragon','Psiquico','Fantasma','Psiquico', 'Pokemon');");
        //bd.execSQL("INSERT INTO preguntas VALUES(6, '¿De que tipo de Duskull?', 'Hierro','Dragon','Psiquico','Fantasma','Fantasma', 'Pokemon');");
        //bd.execSQL("INSERT INTO preguntas VALUES(7, '¿De que tipo de Axew?', 'Hierro','Dragon','Psiquico','Fantasma','Dragon', 'Pokemon');");
        //bd.execSQL("INSERT INTO preguntas VALUES(8, '¿De que tipo de Lapras?', 'Dragon-Lucha','Fantasma-Toxico','Agua-Hielo','Siniestro','Agua-Hielo', 'Pokemon');");
        //bd.execSQL("INSERT INTO preguntas VALUES(9, '¿De que tipo de Articuno?', 'Hielo-Volador','Agua-Hielo','Fantasma-Toxico','Siniestro','Hielo-Volador', 'Pokemon');");
        //bd.execSQL("INSERT INTO preguntas VALUES(10, '¿De que tipo de Wishcash?', 'Agua-Electrico','Agua-Hielo','Dragon-Agua','Agua-Lucha','Agua-Electrico', 'Pokemon');");
        //bd.execSQL("INSERT INTO preguntas VALUES(11, '¿De que tipo de Oshawott?', 'Hielo','Agua','Fantasma','Planta','Agua', 'Pokemon');");
        //bd.execSQL("INSERT INTO preguntas VALUES(12, '¿De que tipo de Ariados?', 'Hielo-Acero','Agua-Normal','Bicho','Bicho-Veneno','Bicho-Veneno', 'Pokemon');");
        //bd.execSQL("INSERT INTO preguntas VALUES(13, '¿De que tipo de Panshear?', 'Hielo','Agua','Fuego','Planta','Fuego', 'Pokemon');");
        //bd.execSQL("INSERT INTO preguntas VALUES(14, '¿De que tipo de Pansage?', 'Hielo','Agua','Fantasma','Planta','Planta', 'Pokemon');");
        //bd.execSQL("INSERT INTO preguntas VALUES(15, '¿De que tipo de Pampour?', 'Hielo','Agua','Fantasma','Planta','Agua', 'Pokemon');");

        //Marvel
        //bd.execSQL("INSERT INTO preguntas VALUES(1, '¿Quien es el director de SHIELD?', 'Viuda Negra','Tony Stark','Phill Couson','Nick Furia','Nick Furia', 'Marvel');");
        //bd.execSQL("INSERT INTO preguntas VALUES(2, '¿Quien es el director de SHIELD?', 'Viuda Negra','Tony Stark','Phill Couson','Nick Furia','Nick Furia', 'Marvel');");
        //bd.execSQL("INSERT INTO preguntas VALUES(3, '¿Quien es Iron Man?', 'Viuda Negra','Tony Stark','Phill Couson','Nick Furia','Tony Stark', 'Marvel');");
        //bd.execSQL("INSERT INTO preguntas VALUES(4, '¿Quien es Natasha Romanoff?', 'Viuda Negra','Kate Bishop','Spider-Gwen','She-Hulk','Viuda Negra', 'Marvel');");
        //bd.execSQL("INSERT INTO preguntas VALUES(5, '¿Quien es Peter Parker?', 'Spider-Man','Ojo Halcon','Thor','Loki','Spider-Man', 'Marvel');");
        //bd.execSQL("INSERT INTO preguntas VALUES(6, '¿Quien dios es Loki?', 'Dios del trueno','Dios de la sabiduria','Dios del engaño','Dios de la muerte','Dios del engaño', 'Marvel');");
        //bd.execSQL("INSERT INTO preguntas VALUES(7, '¿Quien dios es Thor?', 'Dios del trueno','Dios de la sabiduria','Dios del engaño','Dios de la muerte','Dios del trueno', 'Marvel');");
        //bd.execSQL("INSERT INTO preguntas VALUES(8, '¿Que animal es Rocket?', 'Gato','Perro','Pez','Mapache','Mapache', 'Marvel');");
        //bd.execSQL("INSERT INTO preguntas VALUES(9, '¿Que animal es Cosmo?', 'Gato','Perro','Pez','Mapache','Perro', 'Marvel');");
        //bd.execSQL("INSERT INTO preguntas VALUES(10, '¿Quien es Hulk?', 'Bruce Banner','Tony Stark','Mary Jane','Loki','Bruce Banner', 'Marvel');");
        //bd.execSQL("INSERT INTO preguntas VALUES(11, '¿Quien es Black Cat?', 'Mary Jane','Gwen Staisy','Felicia Hardy','Harley Quinn','Felicia Hardy', 'Marvel');");
        //bd.execSQL("INSERT INTO preguntas VALUES(12, '¿Que es Venom?', 'Una persona','El amigo de Spider-Man','Un simbionte','El padre de Spider-Man','Un simbionte', 'Marvel');");
        //bd.execSQL("INSERT INTO preguntas VALUES(13, '¿Quien es el Duende Verde?', 'Harry Osborn','Dende','Norman Osborn','Otto Octavius','Norman Osborn', 'Marvel');");
        //bd.execSQL("INSERT INTO preguntas VALUES(14, '¿Quien es el Profesor Octopus?', 'Harry Osborn','Dende','Norman Osborn','Otto Octavius','Otto Octavius', 'Marvel');");
        //bd.execSQL("INSERT INTO preguntas VALUES(15, '¿Que guerra combatio el Capitan America?', 'Primera Guerra Mundial','Segunda Guerra Mundial','Guerra Fria','Guerra Civil Española','Segunda Guerra Mundial', 'Marvel');");


        preguntasBD.close();
    }

    public void preguntasPokemon(View v){
        String tematica;
        Intent i=new Intent(this,Preguntas.class);
        tematica="pokemon";
        i.putExtra("Pokemon",tematica);
        System.out.println("Hola");
        startActivity(i);
    }

    public void pantallaPreguntas(View v){
        String tematica;
        Intent i=new Intent(this,Preguntas.class);

        if(pokemon.hasOnClickListeners()){
            tematica=pokemon.getText().toString();
            i.putExtra("Pokemon",tematica);
        }
        if(marvel.callOnClick()){
            tematica=marvel.getText().toString();
            i.putExtra("Marvel",tematica);
        }


    }

        }


