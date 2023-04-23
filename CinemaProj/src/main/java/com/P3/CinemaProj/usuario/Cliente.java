package com.P3.CinemaProj.usuario;

import com.P3.CinemaProj.compra.CompraBilhete;
import com.P3.CinemaProj.compra.Loja;
import com.P3.CinemaProj.itens.Bilhete;
import com.P3.CinemaProj.itens.CupomPromocional;
import com.P3.CinemaProj.itens.Item;
import com.P3.CinemaProj.salas.Sala;

import java.util.ArrayList;

public class Cliente extends Usuario{
    private ArrayList<Item> inventario = new ArrayList();
    private ArrayList<Bilhete> listaBilhetes = new ArrayList<>();
    private CupomPromocional cupomPromocional;
    public Cliente(String usuario, String senha) {
        super(usuario, senha);
        this.setAdmin(false);
        this.cupomPromocional = CupomPromocional.CUPOM_DEFAULT;
    }

    public CupomPromocional getCupomPromocional() {
        return cupomPromocional;
    }

    public void setCupomPromocional(CupomPromocional cupomPromocional) {
        this.cupomPromocional = cupomPromocional;
    }

    public void comprarItens(){
        Loja loja = new Loja(inventario,getPessoa());
        loja.comprar();
    }

    public ArrayList<Item> getInventario() {
        return inventario;
    }

    public void setInventario(ArrayList<Item> inventario) {
        this.inventario = inventario;
    }

    public ArrayList<Bilhete> getListaBilhetes() {
        return listaBilhetes;
    }

    public void setListaBilhetes(ArrayList<Bilhete> listaBilhetes) {
        this.listaBilhetes = listaBilhetes;
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
        int quantidadeBilhetes  = compraBilhete.comprarBilhete(sala,this.listaBilhetes);
        double valor = quantidadeBilhetes * (sala.getValor() * this.cupomPromocional.getDesconto());
    }
}