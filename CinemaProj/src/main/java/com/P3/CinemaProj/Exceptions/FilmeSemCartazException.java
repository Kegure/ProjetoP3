package com.P3.CinemaProj.Exceptions;

public class FilmeSemCartazException extends Exception{

    public FilmeSemCartazException(){
        super("Este filme está sem cartaz");
    }
}
