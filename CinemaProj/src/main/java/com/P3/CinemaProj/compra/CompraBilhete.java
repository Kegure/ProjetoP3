package com.P3.CinemaProj.compra;

import com.P3.CinemaProj.itens.Bilhete;
import com.P3.CinemaProj.salas.Sala;
import com.P3.CinemaProj.salas.sessao.poltrona.Poltrona;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class CompraBilhete{
    private ArrayList<Bilhete> listaBilhetes;

    public void adcionarBilhete(Bilhete bilhete){
        listaBilhetes.add(bilhete);
    }
    public void comprarBilhete(Sala sala,ArrayList<Bilhete> listaBilhetes){
        int indexSessao,quantidadeBilhetes,linha,coluna;
        boolean flag;
        this.listaBilhetes = listaBilhetes;
        Scanner in = new Scanner(System.in);
        System.out.println("Qual sessao?");
        indexSessao = in.nextInt();
        Bilhete bilhete = new Bilhete(sala);
        bilhete.setIndexSessao(indexSessao);

        System.out.println("Quantidade de bilhetes que deseja desta sessao");
        quantidadeBilhetes = in.nextInt();
        Poltrona poltrona = bilhete.getSala().getSessao(bilhete.getIndexSessao()).getPoltronas();
        System.out.println("Qual Poltrona Livre voce deseja, As poltronas livres sao verdes, e as amarelas sugestoes onde voce podera comprar seus bilhetes juntos");
        poltrona.poltronaMap(quantidadeBilhetes);
        for(int i = 0 ; i < quantidadeBilhetes ; i++){
            System.out.println("Digite a linha e coluna que deseja com os valores numericos de 1-15 para colunar e 1-10 para a linha");
            do{
                System.out.println("Digite a linha");
                linha = in.nextInt();
                System.out.println("Digite a coluna");
                coluna = in.nextInt();
                flag = poltrona.poltronaLock(linha-1,coluna-1);
                if(flag){
                    System.out.println("Bilhete comprado com sucesso.");
                }else{
                    System.out.println("Poltrona invalida escolha outra");
                }
            } while(!flag);
        }
        poltrona.poltronaMap(0);
    }
}