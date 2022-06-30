package com.upchiapas.C2_Practica_5.models;

public class SalidaDeInformacion {

    public void impresion(Variables variables){
        System.out.println("*******Los datos son correctos******");
        System.out.println("Hora "+variables.getHora()+" minuto "+variables.getMinuto()+" segundo "+variables.getSegundo());
    }

}
