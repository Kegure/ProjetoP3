package com.P3.CinemaProj;

import com.P3.CinemaProj.usuario.Usuario;
import com.P3.CinemaProj.usuario.login.ControleLogin;
import com.P3.CinemaProj.usuario.registro.ControleRegistro;

import java.util.List;
import java.util.Scanner;

public class Menu {
    private ControleRegistro registroControls;
    private ControleLogin loginControls;
    public Menu(List<Usuario> listaUsuarios) {
        this.registroControls = new ControleRegistro(listaUsuarios);
        this.loginControls = new ControleLogin(listaUsuarios);
    }
    public void console(){
        Menu.exibirMenuLoginRegistro();
        Scanner in = new Scanner(System.in);
        int op = in.nextInt();
        switch (op) {
            case 1 -> {
                Usuario usuario = loginControls.logar();
                if (usuario != null) {
                    if (usuario.isAdmin()) {
                        exibirMenuAdministrador();
                    } else exibirMenuPrincipal();
                } else System.out.println("Login Falhou.");
            }
            case 2 -> registroControls.registrarUsuario();
            default -> {
                System.out.println("Opção inválida tente novamente!");
                console();
            }
        }
    }
    private static void exibirMenuLoginRegistro(){
        System.out.println("Opções:");
        System.out.println("1 - Login");
        System.out.println("2 - Registro");
    }
    private static void exibirMenuAdministrador(){
        System.out.println("Opções:");
        System.out.println("1 - Gerenciar Salas");
        System.out.println("2 - Gerenciar Sessao");
        System.out.println("3 - Gerenciar Filme");
        System.out.println("4 - Gerenciar Poltronas");
        System.out.println("5 - Gerenciar Bilhete");
        System.out.println("6 - Gerenciar Itens(Em Construção, Talvez...)");
        System.out.println("0 - Deslogar");
    }

    private static void opcoesGerenciamento(){

    }
    private static void exibirMenuPrincipal(){
        System.out.println("Opções:");
        System.out.println("1 - Ver lista de Filmes");
        System.out.println("2 - Comprar Bilhete");
        System.out.println("3 - Comprar Consumiveis");
        System.out.println("0 - Deslogar");
    }
//     do{
//        op = in.nextInt();
//        in.nextInt();
//        switch(op){
//            case 1:
//                break;
//            case 2:
//                break;
//            case 3:
//                break;
//            case 4:
//                break;
//            case 5:
//                break;
//            case 6:
//                break;
//            default:
//                break;
//        }
//    }
}
