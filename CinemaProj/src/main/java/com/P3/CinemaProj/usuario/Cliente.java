package com.P3.CinemaProj.usuario;

import com.P3.CinemaProj.compra.CompraBilhete;
import com.P3.CinemaProj.compra.Loja;
import com.P3.CinemaProj.itens.Bilhete;
import com.P3.CinemaProj.itens.Item;
import com.P3.CinemaProj.salas.Sala;
import com.P3.CinemaProj.salas.sessao.Sessao;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends Usuario{
    private ArrayList<Item> inventario = new ArrayList();
    private ArrayList<Bilhete> listaBilhetes = new ArrayList<>();
    public Cliente(String usuario, String senha) {
        super(usuario, senha);
        this.setAdmin(false);
    }

    public void comprarItens(){
        Loja loja = new Loja(inventario,getPessoa());
        loja.comprar();
    }

    public void printInventario(){
        if(inventario.isEmpty()){
            System.out.println("Seu inventario esta vazio");
        }else{
            System.out.println("Seu Inventario :");
        }
        for (Item item : inventario) {
            System.out.println(item.name() + ": " + item.getQuantidade());
        }
    }
    public void compraBilhete(Sala sala){
        CompraBilhete compraBilhete = new CompraBilhete();
        compraBilhete.comprarBilhete(sala,listaBilhetes);
    }
}
