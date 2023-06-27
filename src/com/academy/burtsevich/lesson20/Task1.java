package com.academy.burtsevich.lesson20;

import java.time.*;

public class Task1 {
    public static void main(String[] args) {
        String date1 = "JANUARY 1 2000";
        String date2 = "JANUARY 2 2020";
        String date3 = "FEBRUARY 3 2019";
        String date4 = "SEPTEMBER 8 2001";
        String date5 = "AUGUST 3 2017";

        System.out.println(isDateOdd(date1));
        System.out.println(isDateOdd(date2));
        System.out.println(isDateOdd(date3));
        System.out.println(isDateOdd(date4));
        System.out.println(isDateOdd(date5));
    }

    public static boolean isDateOdd(String date) {
        String[] s = date.split(" ");
        int year = Integer.parseInt(s[2]);
        int month = Month.valueOf(s[0]).getValue();
        int day = Integer.parseInt(s[1]);

        LocalDate startDate = LocalDate.of(year, 1, 1);
        LocalDate endDate = LocalDate.of(year, month, day);
        Period period = Period.between(startDate, endDate);
        return period.getDays() % 2 == 0;
    }

}
