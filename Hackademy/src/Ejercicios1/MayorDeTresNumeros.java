package Ejercicios1;
import java.util.Scanner;
public class MayorDeTresNumeros {
    double[] input = new double[3];
    double biggest;

    double mayorDeTresNumeros (double[] input) {
        this.input = input;
        for (int i = 0; i < 3; i++) {
            if (input[i] > biggest) {
                biggest = input[i];
            }
        }
        return biggest;
    }

    public static void main(String[] args) {
        MayorDeTresNumeros mayorDeTresNumeros = new MayorDeTresNumeros();
        Scanner scanner = new Scanner(System.in);

        double[] inUser = new double[3];

        System.out.println("Ingrese el 1o de los 3 números a comparar:");
        for (int i = 0; i < 3; i++) {
            inUser[i] = scanner.nextDouble();
            if (i != 2) {
                System.out.println("Ingrese el número " + (i + 2) + ":");
            } else {
                System.out.println("El número más grande es: " + mayorDeTresNumeros.mayorDeTresNumeros(inUser));
            }
        }
    }
}
