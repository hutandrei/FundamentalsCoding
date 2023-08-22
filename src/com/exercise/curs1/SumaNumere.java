package com.exercise.curs1;

import java.util.Scanner;

/**
 * *
 * Calcualti suma a 2 numere cu zecimala introduse d ela tastatura
 */
public class SumaNumere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduceti primul numar : ");
        double nr1 = scanner.nextDouble();
        System.out.print("\nIntroduceti al doilea numar : ");
        double nr2 = scanner.nextDouble();
        System.out.println(nr1 +" + " + nr2 + " = " + (nr1+nr2));

    }
}
