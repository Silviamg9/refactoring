package refactoring;

import java.util.*;

public class Ejercicio3 {

    public static int contarPalabra(String frase, String palabra) {
        int contador = 0;
        int index = 0;

        while ((index = frase.indexOf(palabra, index)) != -1) {
            contador++;
            index += palabra.length();
        }

        return contador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introducir una frase: ");
        String frase = sc.nextLine();

        System.out.println("Introducir una palabra: ");
        String palabra = sc.nextLine();

        int ocurrencias = contarPalabra(frase, palabra);

        System.out.println("La palabra \"" + palabra + "\" aparece " + ocurrencias + " veces en la frase.");

        sc.close();
    }
}