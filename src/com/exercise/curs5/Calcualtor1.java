package com.exercise.curs5;

import java.util.Scanner;

/**
 * Sa se creeze un calculator de buzunar capabil sa creeze operatii de aduanre, scadre, inmulire , impartire.
 * Sa se citeasca de la tastatura 2 operanzi a si b tip double.
 * Sa se citeasca semnul operatei care dorim efectuata + - * /
 * sa se afiseze rezultatul operatiei alese
 * folositi switch in loc de if else
 *
 */
public class Calcualtor1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduceti primul nr: ");
        double nr1 = scanner.nextInt();
        System.out.print("\nintroduceti operatorul: ");
        String operator = scanner.next();
        System.out.print("\nIntroduceti al doilea numar: ");
        double nr2 = scanner.nextInt();
        System.out.println();
        double rez=0;
        switch (operator){
            case "+":
                rez=nr1+nr2;
                break;
            case "-":
                rez=nr1-nr2;
                break;
            case "*":
                rez=nr1*nr2;
                break;
            case "/":
                rez=nr1/nr2;
                break;
        }
        System.out.printf("%.2f %s %.2f = %.2f",nr1,operator,nr2,rez);

    }
}
