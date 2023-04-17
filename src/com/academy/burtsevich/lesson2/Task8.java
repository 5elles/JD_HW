package com.academy.burtsevich.lesson2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вещественное число:");
        double num = scanner.nextDouble();
        System.out.print("Число после округления: ");
        System.out.printf("%.3f", num);
    }
}
