package com.P3.CinemaProj.compra.pagamento;

public class Credito implements ValidarPagamento {

    private String flag;
    private double valor;
    private boolean cartaoAceito;

    public Credito(String flag, double valor, boolean cartaoAceito) {
        this.flag = flag;
        this.valor = valor;
        this.cartaoAceito = cartaoAceito;
    }

    public void taxaCredito(){

        double valorTaxa = this.valor * 0.1;

        this.valor = this.valor + valorTaxa ;

    }

    @Override
    public boolean statusDoPagamento() {
    if(cartaoAceito){

        return true;
        
    }else{
        return false;
      }
    }

    public String getFlag() {
        return flag;
    }
    public void setFlag(String flag) {
        this.flag = flag;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public boolean isCartaoAceito() {
        return cartaoAceito;
    }
    public void setCartaoAceito(boolean cartaoAceito) {
        this.cartaoAceito = cartaoAceito;
    }
}
