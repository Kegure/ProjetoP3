package com.P3.CinemaProj.usuario;

public class Administrador extends Usuario {
    public Administrador(String usuario, String senha) {
        super(usuario,senha);
        this.setAdmin(true);
    }
}
