package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();

        int minutesTotal = seconds/60;
        int secondsFinal = seconds%60;
        int hoursTotal = minutesTotal/60;
        int minutesFinal = minutesTotal%60;
        
        int cycles = hoursTotal/24;
        int hoursFinal = hoursTotal - (24*cycles); 
        
        String timeFinal = hoursFinal + ":" + String.format("%02d", minutesFinal) + ":" + String.format("%02d", secondsFinal);
        
        System.out.println(timeFinal);
    }
}
