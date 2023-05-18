package com.P3.CinemaProj.Exceptions;

public class CadeiraJaSelecionadaException extends Exception{

    public CadeiraJaSelecionadaException(){
        super("Esta Cadeira já foi selecionada");
    }
}
