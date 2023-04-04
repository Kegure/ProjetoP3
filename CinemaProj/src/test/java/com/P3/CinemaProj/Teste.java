package com.P3.CinemaProj;


import com.P3.CinemaProj.itens.Bilhete;
import com.P3.CinemaProj.salas.Sala;
import com.P3.CinemaProj.salas.sessao.Sessao;
import com.P3.CinemaProj.salas.sessao.filme.Filme;
import com.P3.CinemaProj.salas.sessao.poltrona.Poltrona;
import com.P3.CinemaProj.usuario.Administrador;
import com.P3.CinemaProj.usuario.Cliente;
import com.P3.CinemaProj.usuario.Pessoa;
import com.P3.CinemaProj.usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {

        List<Usuario> listaUsuario = new ArrayList<>();
        listaUsuario.add(new Administrador("admin", "admin")); // Iniciando já com uma contade administrador
        // TESTE MENU
        // LOGIN E REGISTRO PRONTOS , CASO QUEIRA TESTAR REMOVA O COMENTARIO DAS LINHAS A SEGUIR(NÃO NECESSARIO PARA PRIMEIRA ENTREGA).
        /*Menu menu = new Menu(listaUsuario);
          menu.console();*/
        // ---------------------------------------------------------------------------------------------------------------
        //                                              PRIMEIRA ENTREGA

        // ORGANIZAÇÃO PARA OS TESTES DA PRIMEIRA ENTREGA ONDE DEVE ESTAR CONSTRUIDO E FUNCIONANDO AS CLASSES
        // USUARIO / SALA / SESSÃO / FILME / BILHETE / COMPRA ;
        // USUARIO EM NOSSO PROJETO É ABSTRATO. ENTÃO PODE-SE DIZER QUE É A CLASSE CLIENTE E ADMNISTRADOR(POR ENQUANTO ADM NÃO SERÁ USADO).
        // SALA, SESSÃO E FILME SÃO PARTES DE UMA COMPOSIÇÃO .
        // COMPRA FOI SEPARADO EM DUAS CLASSES , LOJA E COMPRABILHETE.
        // BILHETE SERA CONSTRUIDO APARTIR DAS INFORMAÇOES ADQUIRIDAS POR MEIO DA CLASSE SALA.
        // TESTES === >
        // INICIALIZAÇÃO CLASSE FILME, PARAMETROS((STRING)NOME DO FILME E (INT) DURACAO DO FILME). | OBS. VAMOS USAR COMO MINUTOS.
        Filme filmeTeste = new Filme("Jabulani",30);
        // INICIALIZAÇÃO CLASSE SALA, PARAMETRO((INT) QUANTIDADE DE SALAS).
        Sala salaTeste = new Sala(3);
        // INICIALIZAÇÃO CLASSE SESSAO, PARAMETRO((FILME) CLASSE FILME).
        salaTeste.setSessao(new Sessao(filmeTeste));
        // PEGANDO A VARIAVEL DAS POLTRONAS .
        Poltrona poltronaTeste = salaTeste.getSessao(0).getPoltronas();
        // ESTE TRY/CATCH É NECESSARIO POR CONTA DA THREAD USADA PARA GERAR AS POLTRONAS.
        try {
            poltronaTeste.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // INICIALIZAÇÃO CLIENTE, PARAMETROS((STRING) USUARIO E (STRING) SENHA).
        Cliente clienteTeste = new Cliente("Jhey","123456");
        // INICIALIZAÇÃO DA CLASSE PESSOA POR MEIO DA CLASSE CLIENTE | OBS. EXISTE VARIOS OUTROS CAMPOS MAS PARA O TESTE VAMOS USAR O ESSENCIAL CPF E NOME E NUMERO CARTAO -
        // CASO DESEJE PREENCHER MAIS APENAS CHAMAR OS RESPECTIVOS SETTERS USANDO (clienteTeste.getPessoa().SETTER).
        clienteTeste.preencherDadosPessoa(1234546455,"Jheymesson",129127);
        // INICIANDO UMA COMPRA DE ITENS PARA O CLIENTE E OS ITENS VAO SER ARMAZENADOS EM UMA LISTA DE INVENTARIO DO TIPO <Item> DENTRO DA CLASSE CLIENTE.
        clienteTeste.comprarItens();
        // PRINTA O ATUAL INVENTARIO DO CLIENTE
        clienteTeste.printInventario();
        // INICIANDO COMPRA BILHETE, PARAMETRO E A CLASSE SALA.
        System.out.println("----------teste Compra Bilhete---------");
        clienteTeste.compraBilhete(salaTeste);
        System.out.println("Teste depois que algumas vagas ja estao preenchidas, tente uma quantidade maior que 1 de bilhetes");
        clienteTeste.compraBilhete(salaTeste);
        //
    }
}

