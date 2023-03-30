// A classe de usuário representa quem está comprando os bilhetes online, este
// usuário deve ter os seguintes atributos: user, CPF, senha, idade, sexo, email,
// nome do cartão, número do cartão e código verificador do cartão; Além disto
// o usuário pode realizar, alterar ou cancelar uma compra. A classe de compra
// será explanada a seguir.

package com.P3.CinemaProj.usuario;

public class Usuario {
    private int cpf;
    private String user;
    private String senha;
    private int idade;
    private char sexo;
    private String email;
    private String numeroCartao;
    private String nomeCartao;
    private String codigoVerificador;

    public Usuario(String user,String senha){
        this.user = user;
        this.senha = senha;
    }

    public int getCpf(){
        return cpf;
    }
    public String getUser(){
        return user;
    }
    public String getSenha(){
        return senha;
    }
    public int getIdade(){
        return idade;
    }
    public char getSexo(){
        return sexo;
    }
    public String getEmail(){
        return email;
    }
    public String getNumCartao(){
        return numeroCartao;
    }
    public String getNomeCartao(){
        return nomeCartao;
    }
    public String getCodVerificador(){
        return codigoVerificador;
    }
    public void setCpf(int cpf){
        this.cpf = cpf;
    }
    public void setUser(String user){
        this.user = user;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setNumCartao(String numeroCartao){
        this.numeroCartao = numeroCartao;
    }
    public void setNomeCartao(String nomeCartao){
        this.nomeCartao = nomeCartao;
    }
}
