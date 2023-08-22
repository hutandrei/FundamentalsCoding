package com.exercise.curs6;

import java.util.Scanner;

/**
 * Scrieti o metoda care poate primi un nr variabil de valori de acelasi tip (string
 *si afisaeaza pe ecran toate valorile primite
 * Apelati metoda respectiva in main folosind diverse combiantii de apeluri (cu nr diferit de valori(
 * Folositi varargs
 */


public class VarArgs {

    public static void  listaValori(String... valori) {

        for (int i = 0; i < valori.length; i++) {
            System.out.print("Valoarea "+i+": "+valori[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        listaValori("3");
        listaValori("Numele", "meu");
    }
}
