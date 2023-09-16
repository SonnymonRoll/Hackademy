package Ejercicios3;
import java.util.Scanner;
public class Bisiesto {
    int year;
    String response;

    String typeYear (int year) {
        this.year = year;
        if (year % 4 == 0) {
            response = String.format("El año %d sí es bisiesto", year);
        } else {
            response = String.format("El año %d no es bisiesto", year);
        }
        return response;
    }

    public static void main(String[] args) {
        Bisiesto bisiesto = new Bisiesto();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el año a probar:");
        int input = scanner.nextInt();

        System.out.println(bisiesto.typeYear(input));
    }
}
