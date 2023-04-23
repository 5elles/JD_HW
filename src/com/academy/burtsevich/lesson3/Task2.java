package com.academy.burtsevich.lesson3;

public class Task2 {
    public static void main(String[] args) {

        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < 5; i++) {
            madPrint(numbers, i);
        }
    }

    public static void madPrint(int[] array, int number) {
        for (int k : array) {
            for (int j = 0; j < number; j++) {
                System.out.print(k);
            }
        }
    }
}
