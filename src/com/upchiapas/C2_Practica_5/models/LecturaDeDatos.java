package com.upchiapas.C2_Practica_5.models;

import java.util.Scanner;

public class LecturaDeDatos {
    Scanner teclado = new Scanner(System.in);
    public void leer(){
         Procesos procesos=new Procesos();
        int hora,minuto,segundo;

        System.out.println("Ingrese la hora: ");
        hora = teclado.nextInt();
        System.out.println("Ingrese el minuto: ");
        minuto = teclado.nextInt();
        System.out.println("Ingrese el segundo: ");
        segundo = teclado.nextInt();
        Datos datos=new Datos(hora,minuto,segundo);
        procesos.restriccion(datos);
    }
}
