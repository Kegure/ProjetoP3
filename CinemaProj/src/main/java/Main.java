import com.P3.CinemaProj.salas.sessao.Sessao;
import com.P3.CinemaProj.salas.sessao.filme.Filme;
import com.P3.CinemaProj.salas.sessao.poltrona.Poltrona;
import com.P3.CinemaProj.usuario.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Usuario> listaUsuarios = new ArrayList<>();
        Filme filme = new Filme("Jabulani");
        Sessao sessao = new Sessao(filme);
        Poltrona j = sessao.getPoltronas();
        try {
            j.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        j.poltronaMap(16);
    }
}

