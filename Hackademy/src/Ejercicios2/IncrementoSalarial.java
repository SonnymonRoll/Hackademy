package Ejercicios2;
import java.util.Scanner;
public class IncrementoSalarial {
    int actual;
    double inc;
    int val;

    double calcular (int actual) {
        this.actual = actual;
        if (actual < 15000) {
            this.val = 20;
            this.inc = actual * 1.2;
        } else {
            this.val = 15;
            this.inc = actual * 1.15;
        }
        return inc;
    }

    public static void main(String[] args) {
        IncrementoSalarial incrementoSalarial = new IncrementoSalarial();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su salario actual:");
        int actualSalary = scanner.nextInt();
        double newSalary = incrementoSalarial.calcular(actualSalary);

        System.out.println("Su nuevo salario tendrá un incremento del " + incrementoSalarial.val +
                "%, por lo que será de " + newSalary);
    }
}
