package com.exercise.curs2;
import java.util.Scanner;

/**
 * Afisati nr de cuvinte dintr-un enunt dat de la tastatura
 */
public class WordsCount {
    public static int numaraCuvinte(String text1) {
        String[] text = text1.split("\\s+");
        return text.length;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduceti un string :");
        String text = scanner.nextLine();
        System.out.printf("Numarul de cuvinte in fraza '%s' este : %d %n", text, numaraCuvinte(text));

    }
}
