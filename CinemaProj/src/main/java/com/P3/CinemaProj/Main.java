package com.P3.CinemaProj;

import com.P3.CinemaProj.salas.Sala;
import com.P3.CinemaProj.salas.sessao.Sessao;
import com.P3.CinemaProj.salas.sessao.filme.Filme;
import com.P3.CinemaProj.salas.sessao.poltrona.Poltrona;
import com.P3.CinemaProj.usuario.Administrador;
import com.P3.CinemaProj.usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Por enquanto usando main como teste
//        List<Usuario> listaUsuario = new ArrayList<>();
//        Menu menu = new Menu(listaUsuario);
//
//        listaUsuario.add(new Administrador("admin", "admin"));
//
//        menu.console();

        Poltrona po = new Poltrona();
        try {
            po.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        po.poltronaLock(0,1);
        po.poltronaLock(1,2);
        po.poltronaLock(2,13);
        po.poltronaLock(3,12);
        po.poltronaMap(2);
    }
}

