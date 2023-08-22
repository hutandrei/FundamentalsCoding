package com.exercise.curs3;

import java.util.Scanner;

/**
 * Fiind dat un array 'a' de dimensiunia 'n' de nr intregi citite de la tastatura
 * Afisati care este cel mai mare nr continut de array-ul a
 */
public class MaxItemInList {
    public static void main(String[] args) {
        //citim dimensiunea
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduceti lungimea arrayului:");
        int n = scanner.nextInt();
        int a[]=new int[n];

        //citim arrayul
        System.out.print("Introduceti arrayul : ");
        for (int i=0; i<n; i++) {

                a[i]=scanner.nextInt();
        }



        //rezolvam enuntul
        for (int i=1; i<n; i++){
            if (a[i]>a[i-1] && a[i]>a[n-1]) {
                a[n-1]=a[i];
            }
        }
        System.out.println(a[n-1]);




    }
}
