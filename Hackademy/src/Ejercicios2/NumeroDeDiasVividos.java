package Ejercicios2;
import java.util.Scanner;
import java.time.LocalDate;
public class NumeroDeDiasVividos {
    LocalDate localDate = LocalDate.now();
    int year = localDate.getYear();
    int month = localDate.getMonthValue();
    int day = localDate.getDayOfMonth();
    int totalDays;
    int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 0};

    int daysCount (int inputYear, int inputMonth, int inputDay) {
        // Desglose años sin tomar en cuenta año actual y año de nacimiento:
        for (int i = inputYear + 1; i < year; i++) {
            if (i % 4 == 0) {
                totalDays += 366; //Año bisiesto
            } else {
                totalDays += 365; //Año no bisiesto
            }
        }

        // Desglose año de nacimiento sin tomar en cuenta mes de nacimiento:
        for (int i = inputMonth; i < 13; i++) {
            if ((i == 1) && (inputYear % 4 == 0)) {
                totalDays += months[i] + 1;
                } else {
                    totalDays += months[i];
                }
            }

        // Desglose año actual sin tomar en cuenta mes actual:
        if (month - 1 != 0) {
            for (int i = 0; i < month - 1; i++) {
                if ((i == 1) && (year % 4 == 0)) {
                    totalDays += months[i] + 1;
                    } else {
                        totalDays += months[i];
                }
            }
        }
        
        // Desglose mes de nacimiento:
        if ((inputYear % 4 == 0) & (inputMonth - 1 == 1)) {
            totalDays += (months[inputMonth - 1] - inputDay + 1);
        } else {
            totalDays += (months[inputMonth - 1] - inputDay);
        }

        // Desglose mes actual:
        totalDays += day;

        return totalDays;
    }

    public static void main(String[] args) {
        NumeroDeDiasVividos numeroDeDiasVividos = new NumeroDeDiasVividos();
        Scanner scanner = new Scanner(System.in);

        int usrYear;
        int usrMonth;
        int usrDay;

        boolean validMonth = false;
        boolean validDay = false;

        System.out.println("Ingrese el dìa de su cumpleaños:");
        usrDay = scanner.nextInt();

        while (!validDay) {
            if (0 < usrDay && usrDay < 32) {
                validDay = true;
            } else {
                System.out.println("Día de cumpleaños no válido, intenta de nuevo:");
                usrDay = scanner.nextInt();
            }
        }

        System.out.println("Ingrese el mes de su cumpleaños:");
        usrMonth = scanner.nextInt();

        while (!validMonth) {
            if (0 < usrMonth && usrMonth < 13) {
                validMonth = true;
            } else {
                System.out.println("Mes de cumpleaños no válido, intenta de nuevo:");
                usrMonth = scanner.nextInt();
            }
        }

        System.out.println("Ingrese el año de su cumpleaños:");
        usrYear = scanner.nextInt();

        System.out.println("El número de días que has vivido es de " +
                numeroDeDiasVividos.daysCount(usrYear, usrMonth, usrDay) + " días");
    }
}
