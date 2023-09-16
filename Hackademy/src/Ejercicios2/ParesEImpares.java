package Ejercicios2;
import java.util.Scanner;
public class ParesEImpares {
    int[] nums = new int[10];
    int[] result = new int[2];
    int evenCount;
    int oddCount;

    int[] conteoNumeros (int[] nums) {
        this.nums = nums;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenCount += 1;
            } else {
                oddCount += 1;
            }
        }
        result[0] = evenCount;
        result[1] = oddCount;
        return result;
    }

    public static void main(String[] args) {
        ParesEImpares paresEImpares = new ParesEImpares();
        Scanner scanner = new Scanner(System.in);

        int[] input = new int[10];

        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            input[i] = scanner.nextInt();
        }

        int [] result = paresEImpares.conteoNumeros(input);

        System.out.println("Usted ingresó " + result[0] + " números pares y " +
                result[1] + " números impares");
    }
}
