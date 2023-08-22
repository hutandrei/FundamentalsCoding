package com.exercise.curs5.calculator;
import java.util.Scanner;

/**
 * Sa se imbunatateasca main-ul astfel incat dupa afisare rezultat utilizatorul
 * sa fie intrebat daca mai vrea sa continue. Daca introduce da, sa se reia procesul
 * daca nu sa se opreasca aplicatia
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        String mesaj;

        do {
        double nr1 = calc.citire1(scanner);
        String semnOperatie=calc.citire(scanner);
        double nr2 = calc.citire2(scanner);
            switch (semnOperatie) {
                case "+":
                    System.out.printf("%.2f %s %.2f = %.2f", nr1, semnOperatie, nr2, calc.adunare(nr1, nr2));
                    break;
                case "-":
                    System.out.printf("%.2f %s %.2f = %.2f", nr1, semnOperatie, nr2, calc.scadere(nr1, nr2));
                    break;
                case "*":
                    System.out.printf("%.2f %s %.2f = %.2f", nr1, semnOperatie, nr2, calc.inmultire(nr1, nr2));
                    break;
                case "/":
                    System.out.printf("%.2f %s %.2f = %.2f", nr1, semnOperatie, nr2, calc.impartire(nr1, nr2));
                    break;
                default:
                    System.out.println("Operator Invalid!");
                    break;
            }
            mesaj= calc.raspuns(scanner);
        }
        while (mesaj.equalsIgnoreCase("da"));
    }
}
