import com.P3.CinemaProj.salas.Sala;
import com.P3.CinemaProj.salas.sessao.Sessao;
import com.P3.CinemaProj.salas.sessao.filme.Filme;
import com.P3.CinemaProj.salas.sessao.poltrona.Poltrona;
import com.P3.CinemaProj.usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Usuario> listaUsuario = new ArrayList<>();
        List<Sala> listaSala = new ArrayList<>();
        Menu menu = new Menu(listaUsuario);
        do{
            menu.console();
            Filme filme = new Filme("Jabulani");
            Sessao sessao = new Sessao(filme);
            Poltrona j = sessao.getPoltronas();
            try {
                j.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            j.poltronaMap(0);
        }while(true);
    }
}

