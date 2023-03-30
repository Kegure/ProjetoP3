// A classe de sala irá compor uma lista de sessões, a lista têm um tamanho fixo com
// uma grade de horário, caso não exista uma sessão em algum horário, aquela sessão
// será registrada como nula e não irá aparecer para o usuário;

package com.P3.CinemaProj.salas;

import com.P3.CinemaProj.salas.sessao.Sessao;

public class Sala {
    private int numero;
    private Sessao[] sessoes;
    private double valor;

    public Sala(int numero){
        this.numero = numero;
        this.sessoes = new Sessao[3];

        if (tipo.equals("sala2d")) {
            setValor(20.0); // Preço da sala 2D é R$ 20
        } else if (tipo.equals("sala3d")) {
            setValor(30.0); // Preço da sala 3D é R$ 30
        } else if (tipo.equals("salaDeluxe")) {
            setValor(50.0); // Preço da sala Deluxe é R$ 50
        } else if (tipo.equals("salaVip")) {
            setValor(60.0); // Preço da sala VIP é R$ 60
        }
    }
    public int getNumero(){
        return numero;
    }
    public Sessao getSessao(int i){
        return sessoes[i];
    }
    public double getValor(){
        return valor;
    }
    public void setSessao(int i, Sessao sessao){
        sessoes[i] = sessao;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    // CRIAR TIPOS DE SALAS COMO (ex. 2D, 3D, DELUXE, VIP )
}
