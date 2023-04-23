package com.P3.CinemaProj.itens;

public enum CupomPromocional {
    CUPOM_DEFAULT(0,1),
    CUPOM_PROMO_ESTUDANTE(1,0.5),
    CUPOM_PROMO_PRIMEIRA_COMPRA(2,0.3),
    CUPOM_PROMO_LEALDADE(3,0.2);

    private int cupomID;
    private double desconto;
    CupomPromocional(int cupomID,double desconto) {
        this .cupomID = cupomID;
        this.desconto = desconto;
    }

    public int getCupomID() {
        return cupomID;
    }
    public double getDesconto() {
        return desconto;
    }
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
