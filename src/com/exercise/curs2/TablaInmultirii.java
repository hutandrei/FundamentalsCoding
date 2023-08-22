package com.exercise.curs2;

import java.util.Scanner;

/**
 * Scrieti o apliaatie care citeste un nr pozitiv n si afiseaza pe fiecare rand tabla inmultiri pana la 10 cu acel nr.
 * ex : 3
 * 1x 3 =3
 * 2x3=6
 * ...
 * 10x3=30
 */
public class TablaInmultirii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduceti un numar :");
        int n = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n",i, n, i*n);
        }
    }

}
