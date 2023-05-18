package com.P3.CinemaProj.Exceptions;

public class BilheteSemHoraException extends Exception{

    public BilheteSemHoraException() {
        super("A hora do Filme já passou");
    }
}
