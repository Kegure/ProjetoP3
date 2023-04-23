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
    private TipoSalas tipoSala;
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
