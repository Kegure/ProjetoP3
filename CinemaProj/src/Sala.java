// A classe de sala irá compor uma lista de sessões, a lista têm um tamanho fixo com
// uma grade de horário, caso não exista uma sessão em algum horário, aquela sessão
// será registrada como nula e não irá aparecer para o usuário;

package ProjetoCinema;

public class Sala {
    private int numero;
    private Sessao[] sessoes;
    private double valor;

    public Sala(int numero){
        this.numero = numero;
        this.sessoes = new Sessao[3];
    }
    public int getNumero(){
        return numero;
    }
    public Sessao getSessao(int i){
        return sessoes[i];
    }
    public double getValor(){
        return valor;
    }
    public void setSessao(int i, Sessao sessao){
        sessoes[i] = sessao;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
}
