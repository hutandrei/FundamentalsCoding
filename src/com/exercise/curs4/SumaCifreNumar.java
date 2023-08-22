package com.exercise.curs4;

import java.util.Scanner;

/**
 * Citeste un nr. int de la tastatura. Sa se afiseze suma cifrelor lui
 */
public class SumaCifreNumar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduceti un numar :");
        int nr= scanner.nextInt();
        int sum=0;

        do {
            sum=sum+(nr%10);
            nr=nr/10;
        }
        while (nr!=0);

        System.out.println(sum);



    }
}
