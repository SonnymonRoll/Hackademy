package Ejercicios2;

import java.util.Scanner;
import static java.lang.Math.*;
public class VolumenEsfera {
    double radius;
    double result;

    double volume (double radius) {
        this.radius = radius;
        this.result = (4 * Math.PI * Math.pow(radius, 3))/3;

        return result;
    }

    public static void main(String[] args) {
        VolumenEsfera volumenEsfera = new VolumenEsfera();
        Scanner scanner = new Scanner(System.in);

        double radius;

        System.out.println("Ingrese el radio de la esfera a obtener el volumen en cm:");
        radius = scanner.nextDouble();

        System.out.println("El volumen de la esfera con las medidas ingresadas es: " +
                volumenEsfera.volume(radius) + " cm^3");
    }
}
