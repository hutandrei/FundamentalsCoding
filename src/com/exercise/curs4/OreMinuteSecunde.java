package com.exercise.curs4;

import java.time.LocalTime;
import java.util.Scanner;

/**
 * Scrieti o aplicatie care obtine ora curenta si afiseaza urmatorul mesaj:
 * Este ora X si Y minute si Z secunde.
 * Unde x, y z valori ora minute secunde
 * java.time.LocalTime
 */
public class OreMinuteSecunde {
    public static void main(String[] args) {
        LocalTime timpul=LocalTime.now();
        int ora = timpul.getHour();
        int minutul = timpul.getMinute();
        int secunda = timpul.getSecond();
        System.out.printf("Este ora %d si %d minute si %d secunde", ora, minutul,secunda);

    }
}
