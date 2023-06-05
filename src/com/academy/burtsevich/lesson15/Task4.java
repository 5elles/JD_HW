package com.academy.burtsevich.lesson15;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество ссылок для парсинга: ");
        int numberOfURLs = scanner.nextInt();
        String[] urls = new String[numberOfURLs];
        System.out.println("Введите ссылки по одной за раз: ");
        for (int i = 0; i < urls.length; i++) {
            urls[i] = scanner.next().trim();
        }

        for (int i = 0; i < urls.length; i++) {
            String fileName = "file";
            new Thread(new Parser(urls[i], fileName + (i + 1) + ".txt")).start();
        }
    }
}
