package com.P3.CinemaProj.itens;

public enum Item {
    PIPOCA(1, 40),
    REFRIGERANTE(2, 8),
    DOCE(3, 5),
    CACHORRO_QUENTE(4, 12),
    VINHO_TACA(5, 23),
    COBERTOR(6, 20),
    TRAVESSEIRO(7, 20);

    private final int itemID;
    private final double preco;
    private int quantidade;

    Item(int id, double preco) {
        this.itemID = id;
        this.preco = preco;
    }

    public int getItemID() {
        return itemID;
    }

    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
