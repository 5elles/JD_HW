package com.academy.burtsevich.lesson4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array = {5, 10, 8, 3, 1, 4, 2, 6, 7, 9};
        System.out.println("Сортировка пузырьком:");
        System.out.println(Arrays.toString(bubbleSort(array)));

    }

    public static int[] bubbleSort(int[] array) {
        int length = array.length;
        int[] sortedArray = Arrays.copyOf(array, length);
        boolean flag;
        do {
            flag = true;
            for (int i = 0; i < length - 1; i++) {
                if (sortedArray[i] > sortedArray[i + 1]) {
                    int temp = sortedArray[i + 1];
                    sortedArray[i + 1] = sortedArray[i];
                    sortedArray[i] = temp;
                    flag = false;
                }
            }
        } while (!flag);
        return sortedArray;
    }
}
