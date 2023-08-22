package com.exercise.curs4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Creati o aplicatie care sa afiseze data siora curenta in fromatul  yyyy-MM-dd HH-mm-ss
 */
public class LocalDateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime dataSiTimpul=LocalDateTime.now();
        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
        String dataCompleta =formatter.format(dataSiTimpul);
        System.out.println(dataCompleta);

    }
}
