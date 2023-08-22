package com.exercise.curs6;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Cititi un string de la tastatura
 * verificati daca contine doar spatii, litere a-z (mici sai mari) si/sau cifre 0-9
 * Daca da, afisati : "se potriveste " altfel afisati "nu se potriveste"
 */
public class RegexLitereCifre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduceti un string :");
        String text = scanner.nextLine();

        if (Pattern.matches("[A-Za-z0-9 ]*", text)){  ///sau text.matches ("[A-Za-z0-9 ]*"))
            System.out.println("Se potriveste ");
        }
        else {
            System.out.println("Nu se potriveste ");
        }

    }
}
