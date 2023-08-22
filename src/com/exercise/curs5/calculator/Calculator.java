package com.exercise.curs5.calculator;

import java.util.Scanner;

public class Calculator {
    public String citire(Scanner scanner){
        System.out.print("\nintroduceti operatorul: ");
        String operator = scanner.next();
        do {
            if (!(operator.equals("+")||operator.equals("-")||operator.equals("*")||operator.equals("/"))) {
                System.out.println("Introduceti operatorul corect ( + - , * sau / :" );
                operator = scanner.next();
            }
        } while (!(operator.equals("+")||operator.equals("-")||operator.equals("*")||operator.equals("/")));

        return operator;
    }

    public double citire1(Scanner scanner){
        System.out.print("\nIntroduceti primul nr: ");
        double nr1 = scanner.nextDouble();
        return nr1;
    }

    public double citire2(Scanner scanner){
        System.out.print("\nIntroduceti al doilea nr: ");
        double nr2 = scanner.nextDouble();
        return nr2;
    }
    public String raspuns(Scanner scanner) {
        System.out.print("\nScrie 'da' daca vreti sa repetati: ");
        String mesaj = scanner.next();
        return mesaj;
    }

    public double adunare(double a,double b){
        return a+b;
    }

    public double scadere(double a,double b){
        return a-b;
    }

    public double inmultire(double a,double b){
        return a*b;
    }

    public double impartire(double a,double b){
        return a/b;
    }
}
