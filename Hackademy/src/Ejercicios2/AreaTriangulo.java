package Ejercicios2;
import java.util.Scanner;
public class AreaTriangulo {
    double base;
    double height;
    double result;

    double area (double base, double height) {
        this.base = base;
        this.height = height;
        this.result = (base * height) / 2;

        return result;
    }

    public static void main(String[] args) {
        AreaTriangulo areaTriangulo = new AreaTriangulo();
        Scanner scanner = new Scanner(System.in);

        double base;
        double height;

        System.out.println("Ingrese las medidas del triángulo a obtener el área");
        System.out.println("Base [cm]:");
        base = scanner.nextDouble();
        System.out.println("Altura [cm]:");
        height = scanner.nextDouble();

        System.out.println("El área del triángulo con las medidas ingresadas es: " +
                areaTriangulo.area(base, height) + " cm^2");
    }
}