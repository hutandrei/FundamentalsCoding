package com.exercise.curs3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Fiind date 2 arrayuri a, b de dimensiuni diferite n si m. Se populeaza de la tastatura
 * Afisati toate elementele comune ale celor 2 arrayuri
 */
public class ArraysCommonElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduceti lungimea arrayului:");
        int n = scanner.nextInt();
        int a[]=new int[n];

        //citim arrayul
        for (int i=0; i<n; i++) {
            System.out.print("a["+i + "]: ");
            a[i]=scanner.nextInt();
        }

        System.out.print("\nIntroduceti lungimea arrayului:");
        int m = scanner.nextInt();
        int b[]=new int[m];

        //citim arrayul
        for (int i=0; i<m; i++) {
            System.out.print("b["+i + "]: ");
            b[i]=scanner.nextInt();
        }

        System.out.printf("Arrayul a este: %s ", Arrays.toString(a));
        System.out.printf("Arrayul b este: %s \n", Arrays.toString(b));
        System.out.print("Valorile comune :");
        int z=0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++ ){
                if (a[i]==b[j])
                {
                    int c[]=new int[z-1];
                    z=(z++);
                    c[z-1]=a[i];
                    System.out.print(a[i]+ " ");
                }
            }
        }
    }
}
