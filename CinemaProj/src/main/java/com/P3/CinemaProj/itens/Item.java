package com.P3.CinemaProj.itens;

public enum Item {
    PIPOCA_S(1, 15),
    PIPOCA_M(2,25),
    PIPOCA_L(3,40),
    REFRIGERANTE(4, 8),
    DOCE(5, 8),
    CACHORRO_QUENTE(6, 12),
    SUCO(7,7),
    AGUA(8, 5),
    VINHO_TACA(9, 23),
    COBERTOR(10, 20),
    TRAVESSEIRO(11, 20);

    private final int itemID;
    private final double preco;
    private int quantidade;

    private Item(int id, double preco) {
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
