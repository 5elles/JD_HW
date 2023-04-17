package com.academy.burtsevich.lesson3;

public class Task7 {
    public static void main(String[] args) {
        int[][] matrix = {
                {151, 25, 3},
                {144, 5, 33},
                {15, 10, 123}
        };
        maxSum(matrix);
    }

    public static void maxSum(int[][] array) {
        int[] sumArray = new int[array.length];
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sumArray[i] += array[i][j];
                sortedArray[i] += array[i][j];
            }
        }

        boolean switcher;
        int size = sortedArray.length-1;
        do {
            switcher = false;
            for (int i = 0; i < size; i++) {
                int temp;
                if (sortedArray[i] > sortedArray[i + 1]) {
                    temp = sortedArray[i + 1];
                    sortedArray[i + 1] = sortedArray[i];
                    sortedArray[i] = temp;
                    switcher = true;
                }
            }
            size --;
        } while (switcher);

        for (int i = 0; i < sumArray.length; i++) {
            if (sumArray[i] == sortedArray[sortedArray.length - 1]) {
                System.out.println("Индекс строки с максимальной суммой чисел: " + i);
            }
        }
    }
}
