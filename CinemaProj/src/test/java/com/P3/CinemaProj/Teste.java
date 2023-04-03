package com.P3.CinemaProj;


import com.P3.CinemaProj.salas.sessao.Sessao;
import com.P3.CinemaProj.salas.sessao.filme.Filme;
import com.P3.CinemaProj.salas.sessao.poltrona.Poltrona;
import com.P3.CinemaProj.usuario.Administrador;
import com.P3.CinemaProj.usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {

        List<Usuario> listaUsuario = new ArrayList<>();
        Menu menu = new Menu(listaUsuario);
        listaUsuario.add(new Administrador("admin", "admin"));


        do{
            menu.console();

            Filme filme = new Filme("Jabulani",30);
            Sessao sessao = new Sessao(filme);
            Poltrona j = sessao.getPoltronas();
            try {
                j.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //j.poltronaMap(0);
        }while(true);
    }
}

