package com.exercise.curs1;

import java.util.Scanner;

/**
* SCrie o aplicatie care sa printeze "Helloe, nume". Numele sa fie citit de la tastatura
 */
public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntrodu numele tau: ");
        String nume = scanner.nextLine();
        System.out.println("Hello, " + nume);

    }
}
