package com.P3.CinemaProj.compra;

public class Debito implements ValidarPagamento{

    private String flag;
    private double valor;
    private boolean cartaoAceito;
    
    @Override
    public boolean statusDoPagamento() {
        if(cartaoAceito){
            return true;
        }else{
            return false;
        }
    }
}
