package com.academy.burtsevich.lesson3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String psw = "qwerty12345";
        String input;
        do {
            System.out.println("Введите пароль");
            input = scanner.nextLine();
        } while (!input.equals(psw));
        System.out.println("Пароль верный!");
    }
}

