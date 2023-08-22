package com.exercise.curs3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Fiind dat un array 'a' de dimensiunia 'n' de nr intregi citite de la tastatura si un nr intreg 'm' citit tot de la tastatura
 * Sa se caute valaorea lui m in array-ul A si sa se afiseze pe ce pozitie s-a gasit prima data. Daca nu se gaseste afisati -1.
 *
 */
public class LinearSearch {
    public static void main(String[] args) {

        //citim dimeniunea
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduceti lungimea arrayului:");
        int n = scanner.nextInt();
        int a[]=new int[n];

        //citim arrayul
        for (int i=0; i<n; i++) {
            System.out.println("Introduceti elementul de pe pozitia "+i);
            a[i]=scanner.nextInt();
        }
        //citim nr m
        System.out.println("Introduceti valoarea 'm': ");
        int m = scanner.nextInt();
        boolean flag=false;
        for (int j = 0; j<n; j++){
            if (a[j]==m){
                System.out.printf("Valoarea %d se afla pe pozitia %d in array-ul %s.",m ,j, Arrays.toString(a));
                flag=true;
                break;
            }
        }
        if (!flag) {
            System.out.println("-1");
        }

    }
}
