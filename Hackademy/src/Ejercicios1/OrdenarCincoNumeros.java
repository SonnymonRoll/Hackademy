package Ejercicios1;
import java.util.Scanner;
public class OrdenarCincoNumeros {
    double[] numbers = new double[5];
    double help;

    double[] arrange(double[] numbers) {
        this.numbers = numbers;
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (numbers[i] < numbers[j]) {
                    help = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = help;
                }
            }
        }
        return numbers;
    }

    public static void main(String[] args) {
        OrdenarCincoNumeros ordenarCincoNumeros = new OrdenarCincoNumeros();
        Scanner scanner = new Scanner(System.in);

        double[] input = new double[5];

        System.out.println("Ingrese los 5 números a ordenar");
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el número " + (i + 1) + ":");
            input[i] = scanner.nextDouble();
        }

        input = ordenarCincoNumeros.arrange(input);

        System.out.println("Los números ordenados de mayor a menor serían los siguientes:");
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
    }
}
