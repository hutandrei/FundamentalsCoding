package com.exercise.curs1;

import java.util.Scanner;

/**
 * Cititi un String de la tastatura. Afisati acel string inversat
 */
public class StringInvers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduceti un string : ");
        String string  = scanner.next();
        for (int i=string.length()-1; i>=0; --i){
            System.out.print(string.charAt(i));
        }

    }
}
