package com.exercise.curs4;

import java.util.Scanner;

/**
 * Cititi dimensiunea 'n' si 'm' ale unui array bidimensional si populati-l.
 * pentru fiecare linie a matricii afisati suma elementelor de pe linie
 */
public class SumaLiniiMatrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //citim dimensiunile array-ului
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

        //rezolvare
        for (int i=0; i<n; i++) {
            System.out.printf("Suma elementelor de pe linia %d este ",i);
            int suma=0;
            for (int j=0; j<m; j++){
                suma=suma+array[i][j];
            }
            System.out.println(suma);
        }

        for (int i=0; i<m; i++) {
            System.out.printf("Suma elementelor de pe coloana %d este ",i);
            int suma=0;
            for (int j=0; j<n; j++){
                suma=suma+array[j][i];
            }
            System.out.println(suma);
        }


    }
}
