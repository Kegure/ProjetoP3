package com.P3.CinemaProj.usuario;

import com.P3.CinemaProj.compra.Loja;
import com.P3.CinemaProj.itens.Item;

import java.util.ArrayList;

public class Cliente extends Usuario{
    private ArrayList inventario = new ArrayList();
    private Loja loja = new Loja();
    public Cliente(String usuario, String senha) {
        super(usuario, senha);
        this.setAdmin(false);
    }

    public void comprar(){
        loja.menuLoja();
    }
}
