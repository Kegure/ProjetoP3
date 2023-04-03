package com.P3.CinemaProj.salas.sessao.poltrona;

import java.util.LinkedList;
import java.util.Queue;

public class Poltrona {
    private int[][] poltronas;
    private final Thread thread;
    private final Queue<PosicaoPoltronas> poltronasAdjacentesValidas = new LinkedList<>();

    public Poltrona() {
        poltronas = new int[10][15];
        InicializacaoPoltronas inicializacaoPoltronas = new InicializacaoPoltronas(this.poltronas);
        thread = new Thread(inicializacaoPoltronas);
        thread.start();
    }


    public void join() throws InterruptedException {
        thread.join();
    }
    public int[][] getPoltronas() {
        return poltronas;
    }

    public void setPoltronas(int[][] poltronas) {
        this.poltronas = poltronas;
    }

    public boolean poltronaLock(int linha, int coluna) {
        if (poltronas[linha][coluna] == 0) {
            poltronas[linha][coluna] = 1;
            return true;
        }
        return false;
    }

    public void poltronasAdjacentes(int quantidade) {
        if(quantidade > poltronas[0].length){
            return;
        }
        for (int i = 0; i < poltronas.length; i++) {
            int qtd = 0;
            for (int j = 0; j < poltronas[0].length; j++) {
                if(poltronas[i][j] == 0){
                    qtd++;
                    poltronasAdjacentesValidas.add(new PosicaoPoltronas(i, j));
                }else{
                    if (qtd >= quantidade) {
                        preencherPoltronasAdjacentes();
                    }
                    poltronasAdjacentesValidas.clear();
                    qtd = 0;
                }
            }
            preencherPoltronasAdjacentes();
        }
    }

    private void preencherPoltronasAdjacentes() {
        for (int j = 0; j < poltronas[0].length; j++) {
            PosicaoPoltronas poltronaAtual = poltronasAdjacentesValidas.poll();
            poltronas[poltronaAtual.getLinha()][poltronaAtual.getColuna()] = 2;
        }
        poltronasAdjacentesValidas.clear();
    }
    private void resetarPoltronasAdjacentes () {
        for (int i = 0; i < poltronas.length; i++) {
            for (int j = 0; j < poltronas[0].length; j++) {
                if (poltronas[i][j] == 2) {
                    poltronas[i][j] = 0;
                }
            }
        }
    }
    public void poltronaMap ( int quantidade){
        int linhasASC = 65;
        int contadorColunas = 1;
        if (quantidade > 1) {
            poltronasAdjacentes(quantidade);
        }
        System.out.print("  ");
        for (int i = 0; i < poltronas[0].length; i++, contadorColunas++) {
            System.out.print(" " + String.format("%5d", contadorColunas) + " ");
        }
        System.out.println();
        for (int i = 0; i < poltronas.length; i++) {
            System.out.print((char) linhasASC + " | ");
            linhasASC++;
            for (int j = 0; j < poltronas[i].length; j++) {
                System.out.print(" " + poltronaLivre(i, j) + " ");
            }
            System.out.println();
        }
        if (quantidade > 1) {
            resetarPoltronasAdjacentes();
        }
    }
    private String poltronaLivre ( int linha, int coluna){
        if (poltronas[linha][coluna] == 0) {
            return "\033[32m[   ]\033[0m";
        } else if (poltronas[linha][coluna] == 2) {
            return "\u001B[33m[   ]\u001B[0m";
        }
        return "\u001B[30m[ \u001B[31mX \u001B[30m]\u001B[0m";
    }
}
