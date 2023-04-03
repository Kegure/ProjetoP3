package com.P3.CinemaProj.usuario.registro;

import com.P3.CinemaProj.usuario.Cliente;
import com.P3.CinemaProj.usuario.Usuario;
import java.util.List;
import java.util.Scanner;

public class ControleRegistro {
    private List<Usuario> listaUsuario;
    public ControleRegistro(List<Usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }

    public List<Usuario> getListaUsuario() {
        return listaUsuario;
    }

    public void setListaUsuario(List<Usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }

    public void registrarUsuario(){
        Scanner in = new Scanner(System.in);
        String user,senha;
        int tentativas = 0;
        do{
            System.out.println("Usuario:");
            user = in.nextLine();
            if(checkUser(user)){
                System.out.println("Usuario Já Existe, Tente Outro.");
                tentativas++;
                if(tentativas > 0){
                    System.out.println("Tentativa ("+tentativas+") de (3)");
                }
                if(tentativas == 3){
                    System.out.println("Muitas Tentativas, Redirecionando para o com.P3.CinemaProj.Menu.\n");
                    return;
                }
            }else{
                System.out.println("Usuario está Disponivel prossiga...");
            }
        }while(checkUser(user));
        System.out.println("Senha:");
        senha = in.nextLine();
        listaUsuario.add(new Cliente(user,senha));
        System.out.println("Registrado com Sucesso!");
    }
    private boolean checkUser(String nomeUsuario){
        for(int i = 0 ; i < listaUsuario.size(); i++){
            Usuario user = listaUsuario.get(i);
            if(user.getUsuario().equals(nomeUsuario)){
                return true;
            }
        }
        return false;
    }

}
