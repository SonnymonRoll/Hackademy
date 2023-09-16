package Ejercicios2;
import java.util.Scanner;
public class PositivosNegativos {
    int[] nums = new int[10];
    int[] result = new int[2];
    int positiveCount;
    int negativeCount;

    int[] conteoNumeros (int[] nums) {
        this.nums = nums;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                positiveCount += 1;
            } else {
                negativeCount += 1;
            }
        }
        result[0] = positiveCount;
        result[1] = negativeCount;
        return result;
    }

    public static void main(String[] args) {
        PositivosNegativos positivosNegativos = new PositivosNegativos();
        Scanner scanner = new Scanner(System.in);

        int[] input = new int[10];

        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            input[i] = scanner.nextInt();
        }

        int [] result = positivosNegativos.conteoNumeros(input);

        System.out.println("Usted ingresó " + result[0] + " números positivos y " +
                result[1] + " números negativos");
    }
}
