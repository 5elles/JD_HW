package com.academy.burtsevich.lesson2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, discriminant;
        System.out.println("Введите число 'a': ");
        a = scanner.nextDouble();
        System.out.println("Введите число 'b': ");
        b = scanner.nextDouble();
        System.out.println("Введите число 'c': ");
        c = scanner.nextDouble();
        discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("Корней нет!");
        } else if (discriminant == 0.0) {
            double x = -(b / (2 * a));
            System.out.println("Корень квадратного уровнения: " + x);
        } else {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Первый корень квадратного уравнения: " + x1);
            System.out.println("Второй корень квадратного уравнения: " + x2);
        }
    }
}
