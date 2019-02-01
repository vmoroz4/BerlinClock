package com.ubs.opsit.interviews;

/**
 * Created by vmoroz on 1/30/2019.
 */
public class TimeConverterImpl implements TimeConverter{
    @Override
    public String convertTime(String aTime) {
        return new BerlinClock(aTime).toString();
    }
}
