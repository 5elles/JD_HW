package com.academy.burtsevich.lesson4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne, numberTwo;
        do {
            System.out.println("Введите первое число больше нуля: ");
            numberOne = scanner.nextInt();
        } while (numberOne <= 0);
        do {
            System.out.println("Введите второе числоо больше нуля: ");
            numberTwo = scanner.nextInt();
        } while (numberTwo <= 0);
        gcd(numberOne, numberTwo);
    }

    public static void gcd(int a, int b) {
        if (a > b) {
            if (a % b == 0) {
                System.out.println("НОД: " + b);
            } else {
                gcd(a % b, b);
            }
        } else {
            if (b % a == 0) {
                System.out.println("НОД: " + a);
            } else {
                gcd(b % a, a);
            }
        }
    }
}
