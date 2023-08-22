package com.exercise.curs4;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * Scrieti o aplicatie care sa calculeze pe rand diferenta  in or e, minute si secunde intre 2 date calendaristice
 * data curenta si + 2 zile si 2 ore;
 * java.time.LocalDateTime si java.timeDuration
 */
public class DurationBetweenTwoDates {
    public static void main(String[] args) {
        LocalDateTime dataSiTimpul=LocalDateTime.now();
        LocalDateTime dataSiTimpul2 = dataSiTimpul.plusDays(2).plusHours(2);
        Duration durata =   Duration.between(dataSiTimpul,dataSiTimpul2);
        Long nrOre = durata.toHours();
        Long nrMinute = durata.toMinutes();
        Long nrSecunde = durata.toSeconds();
        System.out.printf("Diferenta dintre cele 2 date este %d ore, %d minute si %d secunde",nrOre, nrMinute,nrSecunde);
    }
}
