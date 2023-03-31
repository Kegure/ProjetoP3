// PARA FAZER AINDA

import java.util.Scanner;
import com.P3.CinemaProj.item.Item;
import com.P3.CinemaProj.salas.sessao.Sessao;
import com.P3.CinemaProj.salas.sessao.filme.Filme;
import com.P3.CinemaProj.salas.sessao.poltrona.Poltrona;
import com.P3.CinemaProj.usuario.Usuario;

    
   int op;

public class Menu {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        do{
            exibeMenu();
            op = s.nextInt();
            s.nextLine();
            switch(op){
                case 1: // A DECIDIR    
                break;
                case 2: // A DECIDIR 
                break;
                case 3: // A DECIDIR 
                break;
                case 4: // A DECIDIR 
                break;
                case 5: // A DECIDIR 
                break;
                case 6: // A DECIDIR 
                break;
                default: // A DECIDIR 
                break;
            }
        }
    }
    public static void exibeMenu(){
        System.out.println("Opções:");
        System.out.println("1 - ");
        System.out.println("2 - ");
        System.out.println("3 - ");
        System.out.println("4 - ");
        System.out.println("5 - ");
        System.out.println("6 - ");
        System.out.println("7 - ");
        System.out.println("0 - ");
    }
}
