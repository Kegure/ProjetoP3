// A classe bilhete irá conter as seguintes informações: user, CPF, sala,
// sessão, filme, valor(o valor é calculado baseado no filme e na sala escolhidos),
// cadeira comprada;

package com.P3.CinemaProj.itens;
import com.P3.CinemaProj.salas.Sala;
import com.P3.CinemaProj.usuario.Usuario;

public class Bilhete<T> {
    private Usuario usuario;
    private Sala sala;
    private double valor;
    private int[][] poltrona;

    public Bilhete(Sala sala){
        this.sala = sala;
        this.valor = sala.getValor();
    }
    public Usuario getUser(){
        return usuario;
    }
    public Sala getSala(){
        return sala;
    }
    public double getValor(){
        return valor;
    }
    public void setUser(Usuario user){
        this.usuario = user;
    }
    public void setSala(Sala sala){
        this.sala = sala;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
}
