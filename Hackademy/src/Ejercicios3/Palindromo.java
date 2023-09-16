package Ejercicios3;
import java.util.Scanner;
public class Palindromo {
    String word;
    String test = "";
    String response;

    String tryString (String word) {
        this.word = word;
        String custom = word.toLowerCase();
        for (int i = 0; i < custom.length(); i++) {
            char c = custom.charAt(i);
            if (c != ' ') {
                test += c;
            }
        }

        boolean bool = true;
        int len = test.length() - 1;

        for (int i = 0; i < test.length(); i++) {
            char c = test.charAt(i);
            char cInv = test.charAt(len);
            if (c != cInv) {
                bool = false;
            }
            len -= 1;
        }

        if (bool) {
            response = "La frase/palabra '" + word + "' es un palíndromo";
        } else {
            response = "La frase/palabra '" + word + "' no es un palíndromo";
        }
        return response;
    }

    public static void main(String[] args) {
        Palindromo palindromo = new Palindromo();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la frase/palabra a probar sin acentos:");
        String input = scanner.nextLine();

        System.out.println(palindromo.tryString(input));

    }
}
