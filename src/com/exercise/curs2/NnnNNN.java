package com.exercise.curs2;

import java.util.Scanner;

/**Scrieti o aplciatie care priemste un nuamr integer de la tastatura sicare afiseaza pe ecran
*n+nn+nnn
*Exemplu: n=5 => 5+55+555
*      n=12 = >12+1212+121212   folosind printf pentru formatere
*/
public class NnnNNN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduceti un numar :");
        int n = scanner.nextInt();
        System.out.printf("%d + %d%d + %d%d%d\n",n, n, n, n, n, n );
    }


}
