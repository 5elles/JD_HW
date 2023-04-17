package com.academy.burtsevich.lesson3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int[] array;
        array = returnArray();
        System.out.println("Максимальное значение в массиве:");
        printBiggestNumber(array);
        System.out.println("Минимальное значение в массиве:");
        printSmallestNumber(array);
    }


    /**
     * Метод выводит в консоль максимальное значение из переданного в него массива.
     * @param array Принимает массив из целых чисел.
     *
     */
    public static void printBiggestNumber(int[] array) {
        boolean switcher;
        int size = array.length - 1;
        do {
            switcher = false;
            for (int i = 0; i < size; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = 0;
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    switcher = true;
                }
            }
            size--;
        } while (switcher);
        System.out.println(array[array.length - 1]);
    }

    /**
     * Метод выводит в консоль наименьшее значение из переданного в него массива.
     * @param array Принимает массив.
     */
    public static void printSmallestNumber(int[] array) {
        boolean switcher;
        do {
            switcher = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = 0;
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    switcher = true;
                }
            }
        } while (switcher);
        System.out.println(array[0]);
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
}

