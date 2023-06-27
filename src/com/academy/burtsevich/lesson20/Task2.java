package com.academy.burtsevich.lesson20;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        Map<LocalDate, String> holidays = Stream.of(new Object[][]{
                {LocalDate.of(2023, 1, 1), "Новый год"},
                {LocalDate.of(2023, 1, 2), "Новый год"},
                {LocalDate.of(2023, 1, 7), "Рождество Христово (православное Рождество)"},
                {LocalDate.of(2023, 3, 8), "День женщин"},
                {LocalDate.of(2023, 4, 25), "Радуница"},
                {LocalDate.of(2023, 5, 9), "День Победы"},
                {LocalDate.of(2023, 7, 3), "День Республики"},
                {LocalDate.of(2023, 12, 25), "Рождество Христово (католическое Рождество)"},
        }).collect(Collectors.toMap(objects -> (LocalDate) objects[0], objects -> (String) objects[1]));

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("------------------------------------------------------");
        System.out.printf("%-12s %s\n", "Дата", "Название праздника");
        System.out.println("------------------------------------------------------");
        holidays.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(localDateStringEntry -> {
                            LocalDate date = localDateStringEntry.getKey();
                            String holidayName = localDateStringEntry.getValue();
                            System.out.printf("%-12s %s\n", dateTimeFormatter.format(date), holidayName);
                        }
                );
    }
}
