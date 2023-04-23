package com.P3.CinemaProj.usuario;

import com.P3.CinemaProj.compra.CompraBilhete;
import com.P3.CinemaProj.itens.CupomPromocional;
import com.P3.CinemaProj.salas.Sala;

public class Estudante extends Cliente{

    public Estudante(String usuario, String senha) {
        super(usuario, senha);
        this.setAdmin(false);
        this.setCupomPromocional(CupomPromocional.CUPOM_PROMO_ESTUDANTE);
    }

    @Override
    public void compraBilhete(Sala sala) {
        CompraBilhete compraBilhete = new CompraBilhete();
        compraBilhete.comprarBilhete(sala,getListaBilhetes());
    }
}