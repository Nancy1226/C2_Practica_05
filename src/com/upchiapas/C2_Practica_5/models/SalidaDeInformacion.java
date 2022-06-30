package com.upchiapas.C2_Practica_5.models;

public class SalidaDeInformacion {

    public void impresion(Datos datos){
        System.out.println("*******Los datos son correctos******");
        System.out.println("Hora "+datos.getHora()+" minuto "+datos.getMinuto()+" segundo "+datos.getSegundo());
    }

}
