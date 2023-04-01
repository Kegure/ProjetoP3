package com.P3.CinemaProj.usuario.login;


import com.P3.CinemaProj.usuario.Usuario;

import java.util.List;
import java.util.Scanner;

public class LoginControl {
    private List<Usuario> listaUsuario;

    public LoginControl(List<Usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }

    public List<Usuario> getListaUsuario() {
        return listaUsuario;
    }

    public void setListaUsuario(List<Usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }

    public boolean logar(){
        Scanner in = new Scanner(System.in);
        String user,senha;
        System.out.println("Digite seu nome de Usuario");
        user = in.nextLine();
        Usuario usuarioValidado = checkUser(user);
        if(usuarioValidado != null){
            System.out.println("Digite sua senha");
            senha = in.nextLine();
            if(usuarioValidado.getSenha().equals(senha)){
                System.out.println("Efetuado Login");
                return true;
            }else{
                System.out.println("Senha incorreta!");
            }
        }else{
            System.out.println("Usuario não existe");
        }
        return false;
    }

    public Usuario checkUser(String userTry){
        for(int i = 0 ; i < listaUsuario.size(); i++){
            Usuario user = listaUsuario.get(i);
            if(user.getUser().equals(userTry)){
                return listaUsuario.get(i);
            }
        }
        return null;
    }
}
