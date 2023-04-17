package com.academy.burtsevich.lesson2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int valueOne = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int valueTwo = scanner.nextInt();
        int sum = valueOne + valueTwo;
        System.out.println("Cумма чисел (десятичный формат): " + (sum));
        System.out.println("Cумма чисел (двоичный формат): " + Integer.toBinaryString(sum));
        System.out.println("Cумма чисел (восьмеричный формат): " + Integer.toOctalString(sum));
        System.out.println("Cумма чисел (шестнадцатиричный формат): " + Integer.toHexString(sum).toUpperCase());
    }
}
