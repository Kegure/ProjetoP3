// A classe de usuário representa quem está comprando os bilhetes online, este
// usuário deve ter os seguintes atributos: user, CPF, senha, idade, sexo, email,
// nome do cartão, número do cartão e código verificador do cartão; Além disto
// o usuário pode realizar, alterar ou cancelar uma compra. A classe de compra
// será explanada a seguir.

package com.P3.CinemaProj.usuario;

public abstract class Usuario {
    private String usuario;
    private String senha;
    private Pessoa pessoa;
    private boolean isAdmin;

    public Usuario(String user, String senha) {
        this.usuario = user;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public void preencherDadosPessoa(int cpf, String nome, int numeroCartao) {
        this.pessoa = new Pessoa(cpf, nome, numeroCartao);
    }
}