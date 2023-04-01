package com.P3.CinemaProj.usuario.registro;

import com.P3.CinemaProj.usuario.Usuario;
import java.util.List;
import java.util.Scanner;

public class RegistroControl {
    private List<Usuario> listaUsuario;

    public RegistroControl(List<Usuario> listaUsuario) {
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
                    System.out.println("Muitas Tentativas, Redirecionando para o Menu.\n");
                    return;
                }
            }else{
                System.out.println("Usuario está Disponivel prossiga...");
            }
        }while(checkUser(user));
        System.out.println("Senha:");
        senha = in.nextLine();
        listaUsuario.add(new Usuario(user,senha));
    }
    public boolean checkUser(String userTry){
        for(int i = 0 ; i < listaUsuario.size(); i++){
            Usuario user = listaUsuario.get(i);
            if(user.getUser().equals(userTry)){
                return true;
            }
        }
        return false;
    }

}
