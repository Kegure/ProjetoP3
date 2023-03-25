// A classe bilhete irá conter as seguintes informações: user, CPF, sala,
// sessão, filme, valor(o valor é calculado baseado no filme e na sala escolhidos),
// cadeira comprada;

package ProjetoCinema;

public class Bilhete {
    private Usuario user;
    private int cpf;
    private Sala sala;
    private Sessao sessao;
    private Filme filme;
    private double valor;
    private int cadeira;

    public Bilhete(Usuario user, int cpf, Sala sala, Sessao sessao, Filme filme, double valor, int cadeira){
        this.user = user;
        this.cpf = cpf;
        this.sala = sala;
        this.sessao = sessao;
        this.filme = filme;
        this.valor = sala.getValor() + filme.getValor();
        this.cadeira = cadeira;
    }
    public Usuario getUser(){
        return user;
    }
    public int getCpf(){
        return cpf;
    }
    public Sala getSala(){
        return sala;
    }
    public Sessao getSessao(){
        return sessao;
    }
    public Filme getFilme(){
        return filme;
    }
    public double getValor(){
        return valor;
    }
    public int getCadeira(){
        return cadeira;
    }
    public void setUser(Usuario user){
        this.user = user;
    }
    public void setCpf(int cpf){
        this.cpf = cpf;
    }
    public void setSala(Sala sala){
        this.sala = sala;
    }
    public void setSessao(Sessao sessao){
        this.sessao = sessao;
    }
    public void setFilme(Filme filme){
        this.filme = filme;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    public void setCadeira(int cadeira){
        this.cadeira = cadeira;
    }
}
