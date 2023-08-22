package com.exercise.curs2;

import java.util.Scanner;

/**
 * Scrieti o aplicatie care calculeaza BMI si afiseaza daca e optim sau nu. Aplciatia
 * trebuie sa citeasca 2 valori: greutate in kg (tip float) si inaltimea (cm) (tip int)
 * Forumla BMI=greutate[kg]/inaltime[m] la patrat
 * Afisati  "BMI Optim" daca BMI rezultat este  intre  18.5 si 25
 * Altfel "BMI nu e optim"
 */


public class BodyMassIndex {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduceti greutatea[kg] :");
        float greutate = scanner.nextFloat();
        System.out.print("\nIntroduceti inaltimea[cm] :");
        int inaltime = scanner.nextInt();
        float inaltimeM = (float) inaltime /100;
        float bmi = (float)(greutate/Math.pow(inaltimeM,2));
        if (bmi>=18.5 && bmi<25) {
            System.out.println("BMI optim");
        } else {
            System.out.println("BMI nu e optim");
        }



    }
}
