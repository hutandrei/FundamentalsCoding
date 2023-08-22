package com.exercise.curs2;

import java.util.Scanner;

/**
 * Scrieti o aplciatie care sa afisxeze daca un nr intreg n citit de la tastatura este par sau impar, folosind instructiunea switch
 */
public class ParImparSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduceti un numar :");
        int n = scanner.nextInt();

        switch (n%2) {
            case 0:
                System.out.println("Nr este Par");
                break;
            default:
                System.out.println("Nr nu este par");
                break;

        }
    }
}
