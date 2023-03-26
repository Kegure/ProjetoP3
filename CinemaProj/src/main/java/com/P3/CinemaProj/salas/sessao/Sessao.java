// A sessão deve conter o filme exibido juntamente com as cadeiras disponíveis para
// compras, as cadeiras devem ser implementadas de acordo com a seguir sendo que 
// existem 15 colunas.

package com.P3.CinemaProj.salas.sessao;

import com.P3.CinemaProj.salas.sessao.filme.Filme;
import com.P3.CinemaProj.salas.InicializacaoPoltronas;

public class Sessao {
    private Filme filme;
    private int[][] poltronas;

    public Sessao(Filme filme){
        this.filme = filme;
        this.poltronas = new int[10][15];
        InicializacaoPoltronas inicializacaoPoltronas = new InicializacaoPoltronas(this.poltronas);
        Thread thread = new Thread(inicializacaoPoltronas);
        thread.start();
    }
    public Filme getFilme(){
        return filme;
    }
    public int[][] getPoltronas(){
        return poltronas;
    }
    public void setFilme(Filme filme){
        this.filme = filme;
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

    public void poltronaMap(){
        int ASC = 65;
        int count = 1;
        System.out.print(" ");
        for(int i = 0; i < poltronas[0].length; i++,count++) {
            System.out.print(" "+String.format("%5d", count)+" ");
        }
        System.out.println();
        for(int i = 0; i < poltronas.length; i++) {
            System.out.print((char)ASC+"| ");
            ASC++;
            for(int j = 0; j < poltronas[i].length; j++) {
                System.out.print(" "+poltronaLivre(i,j) + " ");
            }
            System.out.println();
        }
    }

    public String poltronaLivre(int i,int j){
        if(poltronas[i][j] == 0){
            return "\033[32m[   ]\033[0m";
        }
        return "\u001B[30m[ \u001B[31mX \u001B[30m]\u001B[0m";
    }
}
