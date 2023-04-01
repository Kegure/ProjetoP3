package com.P3.CinemaProj.salas.sessao.poltrona;

public class PosicaoPoltronas {
    private int linha;
    private int coluna;

    public PosicaoPoltronas(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    public int getLinha() {
        return linha;
    }
    public int getColuna() {
        return coluna;
    }
}
