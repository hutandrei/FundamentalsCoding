package com.exercise.curs2;

import java.util.Scanner;

/**
 *  Scrieti o aplicatie care citeste un String text de la tastatura. Verificati daca stringul
 *  este palindrom, si afisati mesajul corespunzator (e palindrom, nu e palidrom).
 *  Folositi o metoda "public static boolean isPalindrom(String text)" pe care apoi o apelati in main
 *  Un string e palindrom daca citit de la coada la cap e identic cu cel original.
 *  Ex: ana, potop, cojoc, capac
 * */
public class Palindrom {

    public static boolean isPalindrom(String text) {
        String invers = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            invers = invers + text.charAt(i);
        }
        if (text.equals(invers)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduceti un string :");
        String cuvant = scanner.nextLine();
        if (isPalindrom(cuvant)){
            System.out.printf("Cuvantul '%s' este palindrom",cuvant);
        }
        else {
            System.out.printf("Cuvantul '%s' nu este palindrom",cuvant);
        }
    }
}
