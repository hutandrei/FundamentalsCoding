package com.exercise.curs4;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Creati o aplicatie care sa afiseze ora curenta in formatul HH:mm:ss
 * Folosti java.time.LocalTime
 *         java.time.DateTimeFormatter
 */
public class LocalTimeFormatted {
    public static void main(String[] args) {
        LocalTime timpul = LocalTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        //var1
        String timpFormatat = formatter.format(timpul);
        System.out.println(timpFormatat);
        //var 2
        String timpForm=timpul.format(formatter);
        System.out.println(timpForm);
        //var 3
        System.out.println(timpul.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
}
