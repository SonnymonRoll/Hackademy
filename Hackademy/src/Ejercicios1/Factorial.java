package Ejercicios1;
import java.util.Scanner;
public class Factorial {
    int num;
    int result;
    int calcularFactorial (int num) {
        this.num = num;
        if (num == 0) {
            result = 1;
        } else {
            result = num;
            for (int i = num; i > 1;) {
                result *= (--i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        Scanner scanner = new Scanner(System.in);

        int input;

        System.out.println("Escriba el número a calcular su factorial:");
        input = scanner.nextInt();
        System.out.println("El factorial del número introducido es: " +
                factorial.calcularFactorial(input));
    }
}
