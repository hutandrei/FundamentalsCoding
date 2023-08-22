package com.exercise.curs1;

import java.util.Scanner;

/**
 * Cititi un string S de la tastatura. Afisati  cate litere , spatii, numere sau alte caractere contine stringul
 */
public class InventarString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduceti un string : ");
        String s  = scanner.nextLine();
        int nrLitere=0;
        int nrSpatii=0;
        int nrDigits=0;
        int nrAlteChars=0;
        for (int i=s.length()-1; i>=0; --i){
            if (Character.isLetter(s.charAt(i))){
                ++nrLitere;
            } 
            else if (Character.isSpaceChar(s.charAt(i))) {
                ++nrSpatii;
            } else if (Character.isDigit(s.charAt(i))) {
                ++nrDigits;
            }
            else {
                nrAlteChars++;
            }
        }

        System.out.println("Numar litere: "+ nrLitere);
        System.out.println("Numar spatii: "+ nrSpatii);
        System.out.println("Numar digits: "+ nrDigits);
        System.out.println("Numar alte caractere: "+ nrAlteChars);
    }
}
