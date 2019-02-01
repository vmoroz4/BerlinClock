package com.ubs.opsit.interviews;

import java.util.Arrays;

/**
 * Created by vmoroz on 1/30/2019.
 */
public class LampRow {
    private int enabledLamps;
    private String lampEnableColorMask;

    private static final char DISABLED_COLOR = 'O';

    LampRow(int enabledLamps, String lampEnableColorMask) {
        this.enabledLamps = enabledLamps;
        this.lampEnableColorMask = lampEnableColorMask;
    }

    @Override
    public String toString() {
        return lampEnableColorMask.substring(0, enabledLamps)
                .concat(getDisabledLampColorMask(lampEnableColorMask.length() - enabledLamps));
    }

    private String getDisabledLampColorMask(int length) {
        char mask[] = new char[length];
        Arrays.fill(mask, DISABLED_COLOR);
        return new String(mask);
    }
}
