package com.ubs.opsit.interviews;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * Created by vmoroz on 1/30/2019.
 */
class BerlinTime {

    final private int hour;
    final private int minute;
    final private int second;

    private BerlinTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }


    static BerlinTime timeOf(String time) {
        validate(time);
        String[] timeUnits = time.split(":");
        int hours = Integer.valueOf(timeUnits[0]);
        int minutes = Integer.valueOf(timeUnits[1]);
        int seconds = Integer.valueOf(timeUnits[2]);
        return new BerlinTime(hours, minutes, seconds);
    }

    private static void validate(String time) {
        try {
            DateTimeFormatter.ofPattern("HH:mm:ss").parse(time);
        } catch (DateTimeParseException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }

    int getHour() {
        return hour;
    }

    int getMinute() {
        return minute;
    }

    int getSecond() {
        return second;
    }
}