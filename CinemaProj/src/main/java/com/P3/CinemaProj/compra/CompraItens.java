package com.P3.CinemaProj.compra;

import com.P3.CinemaProj.item.Item;

import java.util.ArrayList;

public class CompraItens {
    private ArrayList<Item> itens;

    public CompraItens(){
        this.itens = new ArrayList<>();
    }

    public void comprarItem(Item item){
        itens.add(item);
    }

    public void cancelarItem(Item item){
        itens.remove(item);
    }

    public void cancelarTodosItens(){
        itens.clear();
    }

}