package com.exercise.curs3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Cititi dimensiunea 'n' si 'm' ale unui array bidimensional si populati-l.
 * Afisati arrayul.
 */
public class ArrayBidimensional {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduceti nr de linii: ");
        int n = scanner.nextInt();

        System.out.print("\nIntroduceti nr de coloane: ");
        int m = scanner.nextInt();
        int array[][]=new int[n][m];

        //citim arrayul
        for (int i=0; i<n; i++) {
            System.out.println("Elementele de pe linia "+i);
            for (int j=0; j<m; j++){
                System.out.printf("array[%d][%d]: ",i,j);
                array[i][j]=scanner.nextInt();
            }
        }

        //afisare array
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        ////varianta de afisare ////
        System.out.println(Arrays.deepToString(array));

    }
}
