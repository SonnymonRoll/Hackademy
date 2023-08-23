package Ejercicios1;

import java.util.Objects;
import java.util.Scanner;

public class Login {
    String usr = "sonnymon_roll";
    String pass = "passwXrd";

    void verif (String usuario, String password) {
        if (Objects.equals(usuario, usr) & Objects.equals(password, pass)) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }
    }

    public static void main(String[] args) {
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);

        String usr;
        String pass;

        System.out.println("Ingrese su usuario:");
        usr = scanner.next();
        System.out.println("Ingrese su contraseña:");
        pass = scanner.next();

        login.verif(usr, pass);

    }
}
