package com.academy.burtsevich.lesson20;

import java.util.Locale;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String baseName = "com.academy.burtsevich.lesson20.messages";
        System.out.println("Введите локацию: ");
        String inputLocale = scanner.nextLine();

        while (!Objects.equals(inputLocale, "end")){
            Locale locale = new Locale(inputLocale);
            ResourceBundle bundle = ResourceBundle.getBundle(baseName, locale);
            String string = bundle.getString("greeting");
            System.out.println(string);
            inputLocale = scanner.nextLine();
        }
    }
}
