package com.academy.burtsevich.lesson13;

import java.util.Comparator;

public class KeyComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] resultS = o1.split("-");
        String[] resultS2 = o2.split("-");
        if (Integer.parseInt(resultS[2]) - Integer.parseInt(resultS2[2]) < 0) {
            return -1;
        } else if (Integer.parseInt(resultS[2]) - Integer.parseInt(resultS2[2]) > 0) {
            return 1;
        } else if (Integer.parseInt(resultS[1]) - Integer.parseInt(resultS2[1]) < 0) {
            return -1;
        } else if (Integer.parseInt(resultS[1]) - Integer.parseInt(resultS2[1]) > 0) {
            return 1;
        } else if (Integer.parseInt(resultS[0]) - Integer.parseInt(resultS2[0]) < 0) {
            return -1;
        } else if (Integer.parseInt(resultS[0]) - Integer.parseInt(resultS2[0]) > 0) {
            return 1;
        } else return 0;
    }
}
