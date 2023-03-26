package com.P3.CinemaProj.salas.sessao.poltronas;

public class InicializacaoPoltronas implements Runnable{
    private int[][] poltronas;

    public InicializacaoPoltronas(int[][] poltronas){
        this.poltronas = poltronas;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 15; j++) {
                this.poltronas[i][j] = 0;
            }
        }
    }
}
