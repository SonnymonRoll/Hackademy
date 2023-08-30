package Ejercicios2;
import java.util.Scanner;
public class LeerImprimirNombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;

        System.out.println("Introduzca su nombre:");
        name = scanner.nextLine();

        System.out.println("Tu nombre es " + name);
    }
}
