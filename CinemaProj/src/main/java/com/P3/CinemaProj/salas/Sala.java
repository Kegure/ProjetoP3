// A classe de sala irá compor uma lista de sessões, a lista têm um tamanho fixo com
// uma grade de horário, caso não exista uma sessão em algum horário, aquela sessão
// será registrada como nula e não irá aparecer para o usuário;

package com.P3.CinemaProj.salas;

import com.P3.CinemaProj.salas.sessao.Sessao;

import java.util.HashMap;
import java.util.Map;

public class Sala {
    private Sessao[] sessoes;
    private final double valor = 20;                                    // Temporariamente deixando valor fixo.
    private Map<String,Integer> agendaFixa = new HashMap<>(); // Depois podemos otimizar baseado no tempo dos filmes.
    private int contadorSessao = 0;
    public Sala(int quantidadeSalas){
        this.sessoes = new Sessao[quantidadeSalas];
    }
    public Map<String, Integer> getAgendaFixa() {
        return agendaFixa;
    }

    public void setAgendaFixa(Map<String, Integer> agendaFixa) {
        this.agendaFixa = agendaFixa;
    }
    public Sessao getSessao(int i){
        if(i >= sessoes.length){
            System.out.println("Esta sessao não existe!");
            return null;
        }
        return sessoes[i];
    }
    public double getValor(){
        return valor;
    }
    public void setSessao(Sessao sessao){
        if(contadorSessao == sessoes.length - 1){
            System.out.println("Não a sala disponivel para mais sessões");
        }else{
            sessoes[contadorSessao] = sessao;
            contadorSessao++;
        }
    }
}
//        Deixar o tipo de salas para segunda entrega ja que modificar algumas coisas.
//        if (tipo.equals("sala2d")) {
//            setValor(20.0); // Preço da sala 2D é R$ 20
//        } else if (tipo.equals("sala3d")) {
//            setValor(30.0); // Preço da sala 3D é R$ 30
//        } else if (tipo.equals("salaDeluxe")) {
//            setValor(50.0); // Preço da sala Deluxe é R$ 50
//        } else if (tipo.equals("salaVip")) {
//            setValor(60.0); // Preço da sala VIP é R$ 60
//        }
