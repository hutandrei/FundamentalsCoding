package com.exercise.curs3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Fiind dat un array 'a' de dimensiunia 'n' de nr intregi citite de la tastatura
 * Sa se inverseze primul si ultimul element din array intre ele
 * Afisati arrayul rezultat
 */
public class ArraySwap {
    public static void main(String[] args) {
        //citim dimensiunea
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduceti lungimea arrayului:");
        int n = scanner.nextInt();
        int a[]=new int[n];

        //citim arrayul
        for (int i=0; i<n; i++) {
            System.out.print("\nIntroduceti elementul de pe pozitia "+i + " ");
            a[i]=scanner.nextInt();
        }

        //rezolvam problema
        int v=a[n-1];
        a[n-1]=a[0];
        a[0]=v;
        System.out.printf("Noul array este: %s ", Arrays.toString(a));
    }
}
