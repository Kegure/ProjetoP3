package com.P3.CinemaProj.usuario.login;

import com.P3.CinemaProj.usuario.Usuario;

import java.util.List;

public class Login {
    private List usuarios;
    private int qtdUsuarios;

    public Login(List usuarios, int qtdUsuarios) {
        this.usuarios = usuarios;
        this.qtdUsuarios = qtdUsuarios;
    }
}
