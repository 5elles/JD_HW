package com.academy.burtsevich.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("__________________");
        System.out.println("Считываем из консоли числа и возвращаем их массив:");
        int[] array = returnArray();
        System.out.println("__________________");
        System.out.println("Выводим массив циклом:");
        printArray(array);
        System.out.println("__________________");
        System.out.println("Выводим тот же массив, но без чисел, кратных 7:");
        printExceptSeven(array);

    }
    public static int[] returnArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целые числа через пробел:");
        String input = scanner.nextLine().trim();
        String[] split = input.split(" ");
        int[] integers = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            integers[i] = Integer.parseInt(split[i]);
        }
        return integers;
    }
    public static void printArray(int[] array) {
        for (int number : array){
            System.out.print(number + " ");
        };
        System.out.println();
    }

    public static void printExceptSeven(int[] array){
        for (int number : array){
            if (number % 7 != 0){
                System.out.print(number + " ");
            }
        }
    }
}
