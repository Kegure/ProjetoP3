package com.P3.CinemaProj.compra;

public class Pix implements ValidarPagamento{

    private String flag;
    private double valor;
    private boolean pixRealizado;

    public Pix(String flag, double valor, boolean pixRealizado) {
        this.flag = flag;
        this.valor = valor;
        this.pixRealizado = pixRealizado;
    }

    @Override
    public boolean statusDoPagamento() {
      
        if(pixRealizado){
            return true;
        }else{
            return false;
        }
    }   
}
