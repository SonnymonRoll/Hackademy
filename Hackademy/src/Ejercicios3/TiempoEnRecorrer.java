package Ejercicios3;
import java.util.Scanner;
public class TiempoEnRecorrer {
    double v;
    double d;
    double t;

    double time (double v, double d) {
        this.v = v;
        this.d = d;

        t = d / v;

        return t;
    }

    public static void main(String[] args) {
        TiempoEnRecorrer tiempoEnRecorrer = new TiempoEnRecorrer();
        Scanner scanner = new Scanner(System.in);

        double v;
        double d;
        double t;

        System.out.println("Ingrese la velocidad del coche [km/hr]:");
        v = scanner.nextDouble();
        System.out.println("Ingrese la distancia a recorrer [km]:");
        d = scanner.nextDouble();

        t = tiempoEnRecorrer.time(v,d);

        String response = String.format("Al coche le tomaría %.2f hrs recorrer %.2f km a %.2f km/hr", t, d, v);
        System.out.println(response);
    }
}
