package com.P3.CinemaProj.compra;

import com.P3.CinemaProj.itens.Item;

import java.util.ArrayList;

public class Loja {
    private ArrayList<Item> itens;

    public Loja(){
        this.itens = new ArrayList<>();
    }

    public void comprarItem(int itemId) {
        for (Item meuItem : Item.values()) {
            if (meuItem.getItemID() == itemId) {
                itens.add(meuItem);
                break;
            }
        }
    }
    public double valorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPreco();
        }
        return total;
    }
    public void cancelarTodosItens(){
        itens.clear();
    }

    public void menuLoja(){
        System.out.println("Digite o id correspondente para comprar:");
        System.out.println("1 - Pipoca 40 R$");
        System.out.println("2 - Refrigerante 8 R$");
        System.out.println("3 - Doce 5 R$");
        System.out.println("4 - Taça de Vinho 23 R$");
        System.out.println("5 - Cobertor 20 R$");
        System.out.println("6 - Travesseiro 20 R$");
        System.out.println("0 - Sair");
    }
}