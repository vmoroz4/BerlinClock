package com.ubs.opsit.interviews;

import java.util.LinkedList;
import java.util.List;
import java.util.StringJoiner;

/**
 * Created by vmoroz on 1/30/2019.
 */
public class BerlinClock {
    private List<LampRow> lampRows = new LinkedList();

    BerlinClock(String inTime) {
        BerlinTime time = BerlinTime.timeOf(inTime);

        lampRows.add(new LampRow(time.getSecond() % 2 == 0 ? 1 : 0, "Y"));
        lampRows.add(new LampRow(time.getHour() / 5, "RRRR"));
        lampRows.add(new LampRow(time.getHour() % 5, "RRRR"));
        lampRows.add(new LampRow(time.getMinute() / 5, "YYRYYRYYRYY"));
        lampRows.add(new LampRow(time.getMinute() % 5, "YYYY"));
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(System.lineSeparator());
        for (LampRow row : lampRows) {
            joiner.add(row.toString());
        }
        return joiner.toString();
    }
}
