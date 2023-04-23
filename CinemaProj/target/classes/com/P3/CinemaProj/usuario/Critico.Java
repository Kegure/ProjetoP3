package com.P3.CinemaProj.usuario;

import com.P3.CinemaProj.itens.CupomPromocional;
import com.P3.CinemaProj.salas.Sala;

public class Critico extends Cliente{
    private String origem;
    public Critico(String user, String senha) {
        super(user, senha);
        this.setCupomPromocional(CupomPromocional.CUPOM_FREE_PASS);
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }


    @Override
    public void compraBilhete(Sala sala) {
        super.compraBilhete(sala);
    }
}