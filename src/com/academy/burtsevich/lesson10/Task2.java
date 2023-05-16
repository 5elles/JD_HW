package com.academy.burtsevich.lesson10;

import java.util.Objects;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        printSquareRoot();
    }

    public static void printSquareRoot() {
        double count = 0;
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        while (!Objects.equals(s, "END")) {
            double temp = 0;
            try {
                temp = Double.parseDouble(s);
                System.out.println("Вещественное число: " + temp);
                count += temp;
                try {
                    if (count >= 0) {
                        System.out.println("Корень из суммы всех чисел: " + Math.sqrt(count));
                    } else throw new ArithmeticException();
                } catch (ArithmeticException e) {
                    System.err.println("Ошибка извлечения корня! " + e.getClass());
                }
            } catch (NumberFormatException e) {
                System.err.println("Ошибка ввода данных! " + e.getClass());
            }
            s = scanner.nextLine();
        }
    }
}

