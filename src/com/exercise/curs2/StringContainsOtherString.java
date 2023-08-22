package com.exercise.curs2;
import java.util.Scanner;
/**
 * Scrieti un program in care sunt citite 2 stringuri t1, t2.
 * Cautati pe t2 in t1 si afisati pozitia la care a fost in functie de caz
 */
public class StringContainsOtherString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduceti un string :");
        String t1 = scanner.nextLine();
        System.out.print("\nIntroduceti un string :");
        String t2 = scanner.nextLine();
        if (!t1.contains(t2)){
            System.out.println(t2+" nu este continut in "+t1);
        }
        else {
            System.out.println(t2 + " este continut in  " +t1 + " la indexul " + t1.indexOf(t2));
        }
    }
}
