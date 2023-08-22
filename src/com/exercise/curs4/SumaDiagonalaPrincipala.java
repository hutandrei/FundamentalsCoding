package com.exercise.curs4;

import java.util.Scanner;

/**
 * Cititi dimensiunea unei matrici patratice si popualti-o
 * Afisati suma elementelor de pe diagonala principala.(referinta 00,11 si 22)
 */
public class SumaDiagonalaPrincipala {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //citim dimensiunile array-ului
        System.out.print("\nIntroduceti nr de linii si coloane: ");
        int n =  scanner.nextInt();
        int matricePatratica[][]=new int[n][n];


        //citim arrayul
        for (int i=0; i<n; i++) {
            System.out.println("Elementele de pe linia "+i);
            for (int j=0; j<n; j++){
                System.out.printf("array[%d][%d]: ",i,j);
                matricePatratica[i][j]=scanner.nextInt();
            }
        }

        //afisare array
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++){
                System.out.print(matricePatratica[i][j]+" ");
            }
            System.out.println();
        }

        //suma diagonala
        int suma=0;
        for (int i=0; i<n; i++) {
                suma=suma+matricePatratica[i][i];
        }
        System.out.println("Suma elementelor de pe diagonala principala este "+ suma);
    }
}
