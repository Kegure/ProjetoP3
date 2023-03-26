package com.P3.CinemaProj.salas.sessao.poltrona;

public class Poltrona {
    static int[][] poltronas;

    public Poltrona() {
        this.poltronas = new int[10][15];
        InicializacaoPoltronas inicializacaoPoltronas = new InicializacaoPoltronas(this.poltronas);
        Thread thread = new Thread(inicializacaoPoltronas);
        thread.start();
    }

    public int[][] getPoltronas(){
        return poltronas;
    }

    public void setPoltronas(int[][] poltronas){
        this.poltronas = poltronas;
    }

    public boolean poltronaLock(int l, int c){
        if(poltronas[l][c] == 0){
            poltronas[l][c] = 1;
            return true;
        }
        return false;
    }
    public static String[][] poltronasAdjacentes(int quantidade) {
        String[][] poltronaAdjacente = new String[poltronas.length][poltronas[0].length];
        for (int i = 0; i < poltronas.length; i++) {
            for (int j = 0; j < poltronas[i].length; j++) {
                if (poltronas[i][j] == 0 && quantidade > 0) {
                    int poltronasConjuntas = 0;
                    while (poltronasConjuntas < quantidade && j + poltronasConjuntas < poltronas[i].length && poltronas[i][j + poltronasConjuntas] == 0) {
                        poltronasConjuntas++;
                    }
                    if (poltronasConjuntas == quantidade) {
                        for (int l = 0; l < quantidade; l++) {
                            poltronaAdjacente[i][j + l] = poltronaLivre(i, j + l, true);
                        }
                    }
                    quantidade -= poltronasConjuntas;
                }
            }
        }
        return poltronaAdjacente;
    }
    public static void poltronaMap ( int quantidade){
        String[][] poltronasAdjacentes = poltronasAdjacentes(quantidade);
        int ASC = 65;
        int count = 1;
        System.out.print(" ");
        for (int i = 0; i < poltronas[0].length; i++, count++) {
            System.out.print(" " + String.format("%5d", count) + " ");
        }
        System.out.println();
        for (int i = 0; i < poltronas.length; i++) {
            int poltronasConjunta = 0;
            System.out.print((char) ASC + "| ");
            ASC++;
            for (int j = 0; j < poltronas[i].length; j++) {

                System.out.print(" " + poltronaLivre(i, j, quantidade > 0) + " ");
            }
            System.out.println();
        }
    }
    public static String poltronaLivre ( int i, int j, boolean flag){
        if (poltronas[i][j] == 0) {
            if (flag) {
                return "\u001B[33m[   ]\u001B[0m";
            } else {
                return "\033[32m[   ]\033[0m";
            }
        }
        return "\u001B[30m[ \u001B[31mX \u001B[30m]\u001B[0m";
    }
}
