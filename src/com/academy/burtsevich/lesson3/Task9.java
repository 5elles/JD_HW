package com.academy.burtsevich.lesson3;

public class Task9 {

    public static void main(String[] args) {

        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = 0, count = 1;

        print(index, count, numbers);

    }

    public static void print(int index, int count, int[] numbers) {
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[index]);

        }
        if (index < numbers.length - 1) {
            print(index + 1, count, numbers);
        } else if (count <= 3) {
            index = 0;
            count++;
            print(index, count, numbers);
        }
    }
}
