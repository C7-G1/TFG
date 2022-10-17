package com.example.tfg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;
import java.util.Random;

public class Preguntas extends AppCompatActivity {

    ImageView foto;
    Button botonA;
    Button botonB;
    Button botonC;
    Button botonD;
    int vidas=3;
    int aciertos=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas);
        foto=(ImageView)findViewById(R.id.imgFoto);
        botonA=(Button)findViewById(R.id.btA);
        botonB=(Button)findViewById(R.id.btB);
        botonC=(Button)findViewById(R.id.btC);
        botonD=(Button)findViewById(R.id.btD);



    }

    public void preguntas(View v){
        Random azar=new Random();
        int op=azar.nextInt(2)+1;
        int puntos=0;

        switch (op){
            case 1:
                ImageView img1=new ImageView(this); img1.setBackgroundResource(R.drawable.ironman);
                foto=img1;
                botonA.setText("Iron Man");
                botonB.setText("Spider-Man");
                botonC.setText("Thor");
                botonD.setText("Ojo de Halcón");
                String respuesta1= (String) botonA.getText();
                if (respuesta1==respuesta1){
                    aciertos=puntos+1;
                    contadorAciertos(aciertos);

                }else{
                    contadorVidas(vidas);
                }

                break;
            case 2:
                ImageView img2=new ImageView(this); img2.setBackgroundResource(R.drawable.blackcat);
                foto=img2;
                botonA.setText("Bruja Escarlata");
                botonB.setText("Catwoman");
                botonC.setText("Black Cat");
                botonD.setText("Mary Jane");
                String respuesta2= (String) botonC.getText();
                if (respuesta2==respuesta2){
                    aciertos=puntos+1;
                    contadorAciertos(aciertos);

                }else{
                    contadorVidas(vidas);
                }
        }
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