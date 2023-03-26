// Filme - É a classe que representa o filme exibido na sessão da sala, ela deve
// ter os seguintes atributos: nome, duração, sinopse, valor.

package com.P3.CinemaProj.salas.sessao.filme;

public class Filme {
    private String nome;
    private int duracao;
    private String sinopse;
    private double valor;

    public Filme(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public int getDuracao(){
        return duracao;
    }
    public String getSinopse(){
        return sinopse;
    }
    public double getValor(){
        return valor;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setDuracao(int duracao){
        this.duracao = duracao;
    }
    public void setSinopse(String sinopse){
        this.sinopse = sinopse;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
}
