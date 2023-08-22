package com.exercise.curs5;
import java.util.Scanner;

/**
 * Sa se extraga si sa se apeleze operatiile de aduanre, scadere, inmultire, impartie in metode separate.
 * fiecare din cele 4 priemsc ca parametri 2 valori a si b si returneaza rezultatul operatiei
 */

/**
 * Sa se creeze si sa se apeleze o metoda separata care sa se ocupe de citirea operatiei dorite asftel:
 * Metoda trebuie sa returneze un String echivalent al semnului introdus
 * metoda trebuie sa ceara utilizatorului sa introduca semnul operatiei pana cand unul din cele 4 semne e introdus
 * cand nu introduce nicic unul din celel 4 , i se solicita din nou.
 */
public class Calculator2 {

    public static String citire(Scanner scanner){

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
    public static double adunare(double a,double b){
        return a+b;
    }
    public static double scadere(double a,double b){
        return a-b;
    }
    public static double inmultire(double a,double b){
        return a*b;
    }
    public static double impartire(double a,double b){
        return a/b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduceti primul nr: ");
        double nr1 = scanner.nextInt();
        String operator=citire(scanner);
        System.out.print("\nIntroduceti al doilea numar: ");
        double nr2 = scanner.nextInt();
        System.out.println();
        double rez=0;


        switch (operator){
            case "+":
                System.out.printf("%.2f %s %.2f = %.2f",nr1,operator,nr2,adunare(nr1,nr2));
                break;
            case "-":
                System.out.printf("%.2f %s %.2f = %.2f",nr1,operator,nr2,scadere(nr1, nr2));
                break;
            case "*":
                System.out.printf("%.2f %s %.2f = %.2f",nr1,operator,nr2,inmultire(nr1, nr2));
                break;
            case "/":
                System.out.printf("%.2f %s %.2f = %.2f",nr1,operator,nr2,impartire(nr1, nr2));
                break;
            default :
                System.out.println("Operator Invalid!");
        }
    }
}
