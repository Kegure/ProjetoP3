package com.P3.CinemaProj.usuario.login;


import com.P3.CinemaProj.usuario.Usuario;

import java.util.List;
import java.util.Scanner;

public class ControleLogin {
    private List<Usuario> listaUsuario;

    public ControleLogin(List<Usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }

    public List<Usuario> getListaUsuario() {
        return listaUsuario;
    }

    public void setListaUsuario(List<Usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }

    public Usuario logar(){
        Scanner in = new Scanner(System.in);
        String user,senha;
        System.out.println("Digite seu nome de Usuario");
        user = in.nextLine();
        Usuario usuarioValidado = checkUser(user);
        if(usuarioValidado != null){
            System.out.println("Digite sua senha");
            senha = in.nextLine();
            if(usuarioValidado.getSenha().equals(senha)){
                if(usuarioValidado.isAdmin()){
                    System.out.println("Efetuado Login como Administrador!");
                }else{
                    System.out.println("Efetuado Login");
                }
                return usuarioValidado;
            }else{
                System.out.println("Senha incorreta!");
            }
        }else{
            System.out.println("Usuario não existe");
        }
        return null;
    }
    private Usuario checkUser(String userTry){
        for(int i = 0 ; i < listaUsuario.size(); i++){
            Usuario user = listaUsuario.get(i);
            if(user.getUsuario().equals(userTry)){
                return listaUsuario.get(i);
            }
        }
        return null;
    }
}
