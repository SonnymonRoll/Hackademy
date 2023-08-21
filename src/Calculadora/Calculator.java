package Calculadora;

import java.util.Scanner;

public class Calculator {
    double result;
    double sum (double... numbers) {
        for (double number : numbers) {
            result += number;
        }
        return result;
    }

    double substraction (double... numbers) {
        for (double number : numbers) {
            result -= number;
        }
        return result;
    }

    double division (double dividend, double divisor) {
        if (divisor == 0){
            System.out.println("Indefinido");
        } else {
            result = dividend / divisor;
        }
        return result;
    }

    double multiplication (double... numbers) {
        result = 1;
        for (double number : numbers) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        int len;
        double opResult;
        double[] inputNumbers;

        System.out.println("Ingrese la operación a realizar:" +
                "\nA) Suma\tB) Resta\tC) Multiplicación\tD) División");
        String operation = scanner.next();

        switch (operation) {
            case "A" -> {
                System.out.println("Ingrese la cantidad de números a sumar:");
                len = scanner.nextInt();
                inputNumbers = new double[len];
                for (int i = 0; i < len; i++) {
                    System.out.println("Ingrese el número " + (i + 1) + ":");
                    inputNumbers[i] = scanner.nextDouble();
                }
                opResult = calculator.sum(inputNumbers);
                System.out.println("La suma de los números ingresados es: " + opResult);
            }
            case "B" -> {
                System.out.println("Ingrese la cantidad de números a restar" +
                        "\nen el orden que quiere que sean restados:");
                len = scanner.nextInt();
                inputNumbers = new double[len];
                for (int i = 0; i < len; i++) {
                    System.out.println("Ingrese el número " + (i + 1) + ":");
                    inputNumbers[i] = scanner.nextDouble();
                }
                opResult = calculator.substraction(inputNumbers);
                System.out.println("La resta de los números ingresados es: " + opResult);
            }
            case "C" -> {
                System.out.println("Ingrese la cantidad de números a multiplicar:");
                len = scanner.nextInt();
                inputNumbers = new double[len];
                for (int i = 0; i < len; i++) {
                    System.out.println("Ingrese el número " + (i + 1) + ":");
                    inputNumbers[i] = scanner.nextDouble();
                }
                opResult = calculator.multiplication(inputNumbers);
                System.out.println("La multiplicación de los números ingresados es: " + opResult);
            }
            case "D" -> {
                System.out.println("Ingrese el valor del dividendo:");
                double dividendInput = scanner.nextDouble();
                System.out.println("Ingrese el valor del divisor:");
                double divisorInput = scanner.nextDouble();
                opResult = calculator.division(dividendInput, divisorInput);
                System.out.println("La división de los números ingresados es: " + opResult);
            }
            default -> System.out.println("No se ha ingresado una opción válida, vuelva a intentar");
        }
    }
}