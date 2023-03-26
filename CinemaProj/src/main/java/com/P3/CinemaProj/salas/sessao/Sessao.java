// A sessão deve conter o filme exibido juntamente com as cadeiras disponíveis para
// compras, as cadeiras devem ser implementadas de acordo com a seguir sendo que 
// existem 15 colunas.

package com.P3.CinemaProj.salas.sessao;

import com.P3.CinemaProj.salas.sessao.filme.Filme;
import com.P3.CinemaProj.salas.sessao.poltrona.Poltrona;

public class Sessao {
    private Filme filme;
    private Poltrona poltronas;

    public Sessao(Filme filme){
        this.filme = filme;
        poltronas = new Poltrona();
    }
    public Filme getFilme(){
        return filme;
    }
    public void setFilme(Filme filme){
        this.filme = filme;
    }
}
