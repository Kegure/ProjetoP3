package com.P3.CinemaProj.salas;

public class InicializacaoPoltronas implements Runnable{
    private int[][] cadeiras;

    public InicializacaoPoltronas(int[][] cadeiras){
        this.cadeiras = cadeiras;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 15; j++) {
                this.cadeiras[i][j] = 0;
            }
        }
    }
}
