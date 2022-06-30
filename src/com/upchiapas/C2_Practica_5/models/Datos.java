package com.upchiapas.C2_Practica_5.models;

public class Datos {
        private int hora;
        private int minuto;
        private int segundo;

        public
    Datos(int hora,int minuto,int segundo) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        }

        public int getHora() {return hora;}

        public void setHora(int hora) {this.hora = hora;}

        public int getMinuto() {return minuto;}

        public void setMinuto(int minuto) {this.minuto = minuto;}

        public int getSegundo() {return segundo;}

        public void setSegundo(int segundo) {this.segundo = segundo;}

}
