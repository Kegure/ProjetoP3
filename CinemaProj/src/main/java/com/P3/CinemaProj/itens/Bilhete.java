// A classe bilhete irá conter as seguintes informações: user, CPF, sala,
// sessão, filme, valor(o valor é calculado baseado no filme e na sala escolhidos),
// cadeira comprada;

package com.P3.CinemaProj.itens;
import com.P3.CinemaProj.salas.Sala;
import com.P3.CinemaProj.usuario.Pessoa;

public class Bilhete {
    private Pessoa cliente;
    private Sala sala;
    private double valor;
    private int indexSessao;
    public Bilhete(Sala sala){
        this.sala = sala;
        this.valor = sala.getValor();
    }
    public Pessoa getCliente(){
        return cliente;
    }
    public Sala getSala(){
        return sala;
    }
    public double getValor(){
        return valor;
    }
    public void setCliente(Pessoa cliente){
        this.cliente = cliente;
    }
    public void setSala(Sala sala){
        this.sala = sala;
    }
    public void setValor(double valor){this.valor = valor;}
    public int getIndexSessao(){
        return this.indexSessao;
    }
    public void setIndexSessao(int indexSessao){
        this.indexSessao = indexSessao;
    }
}
