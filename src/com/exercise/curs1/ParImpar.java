package com.exercise.curs1;

import java.util.Scanner;

/**
 * Fie un nr intreg n citit de la tastatura. Ptr fiecare nr de la 1 la n afisati pe fiecare rand cuvantul "par" daca este par si "impar" daca nu este
 */
public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduceti un numar :");
        int n = scanner.nextInt();
        for (int i = 1; i<=n; i++){
            if (i%2==0){
                System.out.println(i +" este par");
            }
            else {
                System.out.println(i +" este impar");
            }
        }
    }
}
