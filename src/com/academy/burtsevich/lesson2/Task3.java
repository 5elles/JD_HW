package com.academy.burtsevich.lesson2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        if (number != 0) {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (number % 3 == 0) {
                System.out.println("Fizz");
            } else {
                // при вводе любого числа, не кратного 3 и 5 показывает Buzz.
                //Buzz должно выводиться тогда и только тогда когда число кратно 5
                System.out.println("Buzz");
            }
        } else {
            System.out.println("Попробуйте другую цифру.");
        }
    }
}
