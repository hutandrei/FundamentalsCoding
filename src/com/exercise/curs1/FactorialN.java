package com.exercise.curs1;

import java.util.Scanner;

/**
 * Calcualti produsul a primelor n numere unde n este citit de la tastatura
 */
public class FactorialN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduceti nr. intreg 'n': ");
        int n = scanner.nextInt();
        int factN=1;
        for (int i=1; i<=n; i++){
            factN=factN*i;
        }
        System.out.println("Factorial de " + n + " este "+ factN );
    }
}
