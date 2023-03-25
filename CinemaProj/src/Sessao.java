// A sessão deve conter o filme exibido juntamente com as cadeiras disponíveis para
// compras, as cadeiras devem ser implementadas de acordo com a seguir sendo que 
// existem 15 colunas.

package ProjetoCinema;

public class Sessao {
    private Filme filme;
    private int[][] cadeiras;

    public Sessao(Filme filme){
        this.filme = filme;
        this.cadeiras = new int[10][15];
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 15; j++){
                this.cadeiras[i][j] = 0;
            }
        }
    }
    public Filme getFilme(){
        return filme;
    }
    public int[][] getCadeiras(){
        return cadeiras;
    }
    public void setFilme(Filme filme){
        this.filme = filme;
    }
    public void setCadeiras(int[][] cadeiras){
        this.cadeiras = cadeiras;
    }
    public boolean venderCadeira(int l, int c){
        if(cadeiras[l][c] == 0){
            cadeiras[l][c] = 1;
            return true;
        }else{
            return false;
        }
    }
}
