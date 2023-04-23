package com.P3.CinemaProj.salas.sessao.filme;

public class Critica {
    private String nomeCritico;
    private String origem;
    private String comentario;


    public Critica(String nomeCritico, String origem) {
        this.nomeCritico = nomeCritico;
        this.origem = origem;
    }

    public void atribuirNota(double nota, Filme filme){
        filme.setNota(filme.getNota()+nota);
        filme.setQuantidadeCriticos(filme.getQuantidadeCriticos()+1);
    }
    public void atribuirCritica(String critica,Filme filme){
        filme.addCritica(critica);
    }
}
