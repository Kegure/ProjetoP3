import com.P3.CinemaProj.salas.Sala;
import com.P3.CinemaProj.usuario.Usuario;
//import com.P3.CinemaProj.usuario.login.LoginControl;
import com.P3.CinemaProj.usuario.login.LoginControl;
import com.P3.CinemaProj.usuario.registro.RegistroControl;

import java.util.List;
import java.util.Scanner;

public class Menu {
    private RegistroControl registroControls;
    private LoginControl loginControls;
    public Menu(List<Usuario> listaUsuarios) {
        this.registroControls = new RegistroControl(listaUsuarios);
        this.loginControls = new LoginControl(listaUsuarios);
    }
    public RegistroControl getRegistroControls() {
        return registroControls;
    }

    public void setRegistroControls(RegistroControl registroControls) {
        this.registroControls = registroControls;
    }

    public void console(){
        Menu.exibirMenuLoginRegistro();
        Scanner in = new Scanner(System.in);
        int op = in.nextInt();
        switch(op) {
            case 1:
                loginControls.logar();
                break;
            case 2:
                registroControls.registrarUsuario();
                break;
            default:
                System.out.println("Opção inválida tente novamente!");
                console();
        }
    }


    public static void exibirMenuLoginRegistro(){
        System.out.println("Opções:");
        System.out.println("1 - Login");
        System.out.println("2 - Registro");
    }
    public static void exibirMenu(){
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
//     do{
//        op = in.nextInt();
//        in.nextInt();
//        switch(op){
//            case 1:
//                break;
//            case 2:
//                break;
//            case 3:
//                break;
//            case 4:
//                break;
//            case 5:
//                break;
//            case 6:
//                break;
//            default:
//                break;
//        }
//    }
}
