package com.academy.burtsevich.lesson15;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 20};

        int[] subArray1;
        int[] subArray2;

        if (array.length % 2 == 0) {
            subArray1 = new int[array.length / 2];
            subArray2 = new int[array.length / 2];
            for (int i = 0; i < array.length; i++) {
                if (i < array.length / 2) {
                    subArray1[i] = array[i];
                } else {
                    for (int j = 0; j<subArray2.length; j++) {
                        subArray2[j] = array[i++];
                    }
                }
            }
        } else {
            subArray1 = new int[array.length / 2];
            subArray2 = new int[array.length / 2 + 1];
            for (int i = 0; i < array.length; i++) {
                if (i < array.length / 2) {
                    subArray1[i] = array[i];
                } else {
                    for (int j = 0; j<subArray2.length; j++) {
                        subArray2[j] = array[i++];
                    }
                }
            }
        }

        ArraySum thread1 = new ArraySum(subArray1);
        ArraySum thread2 = new ArraySum(subArray2);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Сумма всех элементов: "+ (thread1.getSum() + thread2.getSum()));
    }
}
