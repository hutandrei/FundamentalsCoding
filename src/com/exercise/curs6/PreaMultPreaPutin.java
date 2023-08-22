package com.exercise.curs6;

import java.util.Random;
import java.util.Scanner;

/**
 * Scrieti o aplicatie care sa mimeze jocul "Prea mult prea putin"
 * generati unnr random intre 0 si 100 folosind metoda Random.nextInt()
 * permiteti utilizatorului sa introduca un nr intreg de la tastatura
 * daca nr introdus este mai mic decat nr generat afisati mesajul "prea mic"
 * daca este > decat nr generat afisati "prea mare"
 * daca nr = nr generat afisati "Bravo ai ghicit"
 * utilizatorul va continua sa introduca numere pana cand ghiceste nr sau pana cand introduce un nr negativ
 */
public class PreaMultPreaPutin {

    public static int nrGenerat(int min, int max){
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    public static int citire(Scanner scanner){

        System.out.print("\nintroduceti un nr: ");
        int nr1 = scanner.nextInt();
        return nr1;
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

       //

        int nr2=nrGenerat(0,100);
        System.out.println(nr2);
        int nr=citire(scanner);


        do {
            if (nr<nr2){
                System.out.println("Prea mic");
                nr= citire(scanner);
            }
            else if (nr>nr2) {
                System.out.println("Prea mare");
                nr=citire(scanner);
            }
            else {
                System.out.println("Bravo");
                break;
            }
        } while (nr>0);


    }
}
