package com.exercise.curs2;

import java.util.Scanner;

/**
 * Citeste de la atstatur aun nr intreg n. Continua sa citesti pana cand utilizatorul introduce un nr n>0
 * Doar dupa ce a introdus un nr pozitiv afisati nr,
 */
public class NumarPozitiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int n;
        do {
            System.out.print("\nIntroduceti un numar :");
            n = scanner.nextInt();
        }
        while (n<=0);
        if (n>0) {
            System.out.println(n);
        }


    }
}
