package com.upchiapas.C2_Practica_5.models;

import java.util.Scanner;

public class Procesos {
    Scanner teclado=new Scanner(System.in);
    SalidaDeInformacion salidaDeInformacion=new SalidaDeInformacion();

    public void restriccion(Datos datos) {
            while (datos.getHora() < 0 || datos.getHora() > 24) {
                int h;
                System.out.println("Dato incorrecto");
                System.out.println("Ingrese de nuevo la hora: ");
                h = teclado.nextInt();
                datos.setHora(h);
                System.out.println(datos.getHora());
            }

        while (datos.getMinuto() < 0 || datos.getMinuto() > 59) {
            int m;
            System.out.println("Dato incorrecto");
            System.out.println("Ingrese de nuevo el minuto: ");
                m= teclado.nextInt();
                datos.setMinuto(m);
            }
        while (datos.getSegundo() < 0 || datos.getSegundo() > 59) {
            int s;
            System.out.println("Dato incorrecto");
            System.out.println("Ingrese de nuevo el segundo: ");
                s = teclado.nextInt();
              datos.setSegundo(s);
            }
        salidaDeInformacion.impresion(datos);
    }
}
