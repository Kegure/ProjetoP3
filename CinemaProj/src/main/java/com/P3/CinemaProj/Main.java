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
        List<Usuario> listaUsuario = new ArrayList<>();
        Menu menu = new Menu(listaUsuario);

        listaUsuario.add(new Administrador("admin", "admin"));

        menu.console();

//        código comentado importante nao apaguem
//        Poltrona j = sessao.getPoltronas();
//        try {
//            j.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}

