import com.P3.CinemaProj.salas.sessao.Sessao;
import com.P3.CinemaProj.salas.sessao.filme.Filme;
import com.P3.CinemaProj.salas.sessao.poltronas.Poltronas;

public class Main {
    public static void main(String[] args) {
        // Apenas testes
        Filme filme = new Filme("Jabulani");
        Sessao sessao = new Sessao(filme);
        Poltronas.poltronaMap();
    }
}
