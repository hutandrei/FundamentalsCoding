package com.exercise.curs4;

import java.time.*;

/**
 * Scrieti o aplicatie care sa afieze nr de ani si de luni ntre 2 date ( 9 noiembrie 2020 si data curenta)
 * hint: folositi java.time.LocalDate
 *                java.time.Period
 */
public class DatesYearsMonths {
    public static void main(String[] args) {
        LocalDate dataSiTimpul=LocalDate.now();
        LocalDate dataSiTimpul2 = LocalDate.of(2020,11,9);
        Period perioada = Period.between(dataSiTimpul2,dataSiTimpul);
        System.out.printf("Intre cele 2 date sunt %d ani si %d luni",perioada.getYears(), perioada.getMonths());
    }
}
