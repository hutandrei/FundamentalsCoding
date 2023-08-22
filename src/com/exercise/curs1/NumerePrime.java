package com.exercise.curs1;

import java.util.Scanner;

/**
 * Afisati toate nr prime intre 1 si n
 * Folositi o metoda care primeste ca parametru un nuamr si returneaza boolean true/false daca acel nr e prim sau nu
 */
public class NumerePrime {
    public static boolean isPrim(int numar) {
        if (numar < 2) {
            return false;
        } else {
            //Object sqrt;
            for (int i = 2; i <= Math.sqrt(numar); i++) {
                if (numar % i == 0) {
                    return false;
                }

            }
            return true;

        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduceti un numar :");
        int n = scanner.nextInt();
        if (!isPrim(n)) {
            System.out.println("Numarul nu este prim ");
        } else {
            System.out.println("Numarul este prim ");
        }

        System.out.print("Numerele prime pana la "+ n + " : ");
        for (int i=1; i<=n; i++){
            if (isPrim(i)) {
                System.out.print(i+ " ");
            }
        }

    }
}
