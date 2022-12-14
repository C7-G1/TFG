package com.example.tfg;

public class ListaPreguntas {
    int numero;
    String pregunta;
    String respuesta1;
    String respuesta2;
    String respuesta3;
    String respuesta4;
    String respuestaCorrecta;
    String tematica;

    ListaPreguntas(int numero,String pregunta,String respuesta1,String respuesta2,String respuesta3,String respuesta4, String respuestaCorrecta,String tematica){
        this.numero=numero;
        this.pregunta=pregunta;
        this.respuesta1=respuesta1;
        this.respuesta2=respuesta2;
        this.respuesta3=respuesta3;
        this.respuesta4=respuesta4;
        this.respuestaCorrecta=respuestaCorrecta;
        this.tematica=tematica;
    }
    ListaPreguntas(){

    }

    public int getNumero() {
        return numero;
    }

    public String getPregunta() {
        return pregunta;
    }

    public String getRespuesta1() {
        return respuesta1;
    }

    public String getRespuesta2() {
        return respuesta2;
    }

    public String getRespuesta3() {
        return respuesta3;
    }

    public String getRespuesta4() {
        return respuesta4;
    }

    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public String getTematica() {
        return tematica;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public void setRespuesta1(String respuesta1) {
        this.respuesta1 = respuesta1;
    }

    public void setRespuesta2(String respuesta2) {
        this.respuesta2 = respuesta2;
    }

    public void setRespuesta3(String respuesta3) {
        this.respuesta3 = respuesta3;
    }

    public void setRespuesta4(String respuesta4) {
        this.respuesta4 = respuesta4;
    }

    public void setRespuestaCorrecta(String respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

}

