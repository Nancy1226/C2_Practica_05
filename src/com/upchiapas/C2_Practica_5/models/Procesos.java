package com.upchiapas.C2_Practica_5.models;

import java.util.Scanner;

public class Procesos {
    Scanner teclado=new Scanner(System.in);
    SalidaDeInformacion salidaDeInformacion=new SalidaDeInformacion();

    public void restrinccion(Variables variables) {
            while (variables.getHora() < 0 || variables.getHora() > 24) {
                int h;
                System.out.println("Dato incorrecto");
                System.out.println("Ingrese de nuevo la hora: ");
                h = teclado.nextInt();
                variables.setHora(h);
                System.out.println(variables.getHora());
            }

        while (variables.getMinuto() < 0 || variables.getMinuto() > 59) {
            int m;
            System.out.println("Dato incorrecto");
            System.out.println("Ingrese de nuevo el minuto: ");
                m= teclado.nextInt();
                variables.setMinuto(m);
            }
        while (variables.getSegundo() < 0 || variables.getSegundo() > 59) {
            int s;
            System.out.println("Dato incorrecto");
            System.out.println("Ingrese de nuevo el segundo: ");
                s = teclado.nextInt();
              variables.setSegundo(s);
            }
        salidaDeInformacion.impresion(variables);
    }
}
