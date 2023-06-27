package com.academy.burtsevich.lesson20;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String baseName = "com.academy.burtsevich.lesson20.messages";
        System.out.println("Введите локацию: ");
        String inputLocale = scanner.nextLine();
        LocalDate date = LocalDate.now();
        DateTimeFormatter byFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        while (!Objects.equals(inputLocale, "end")) {
            Locale locale = new Locale(inputLocale);
            ResourceBundle bundle = ResourceBundle.getBundle(baseName, locale);
            String string = bundle.getString("greeting");
            String formatted = null;
            if (Objects.equals(inputLocale, "ru") || Objects.equals(inputLocale, "be")) {
                formatted = date.format(byFormatter);
            } else {
                DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
                formatted = formatter.withLocale(Locale.US).format(date);
            }
            System.out.printf("%s -> %s\n", string, formatted);
            inputLocale = scanner.nextLine();
        }
    }

}
