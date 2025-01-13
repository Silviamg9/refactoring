package refactoring;

import java.util.Random;

public class Ejercicio2 {


    public static void main(String[] args) {
        Random random = new Random();

        int[] vowelFrequency = new int[5];
        char[] vowelTable = new char[20];
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < vowelTable.length; i++) {
            char randomVowel = vowels[random.nextInt(vowels.length)];
            vowelTable[i] = randomVowel;

            switch (randomVowel) {
                case 'a': vowelFrequency[0]++; break;
                case 'e': vowelFrequency[1]++; break;
                case 'i': vowelFrequency[2]++; break;
                case 'o': vowelFrequency[3]++; break;
                case 'u': vowelFrequency[4]++; break;
                default: throw new IllegalStateException("Unexpected value: " + randomVowel);
            }
        }

        System.out.println("Tabla de vocales aleatoria:");
        for (char vowel : vowelTable) {
            System.out.print(vowel + " ");
        }
        System.out.println();

        System.out.println("\nFrecuencia de cada vocal:");
        for (int i = 0; i < vowels.length; i++) {
            System.out.println(vowels[i] + ": " + vowelFrequency[i]);
        }
    }
}