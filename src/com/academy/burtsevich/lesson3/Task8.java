package com.academy.burtsevich.lesson3;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] vector = {1, 2, 3};
        matrixVectorMultiplication(matrix, vector);
    }

    public static void matrixVectorMultiplication(int[][] matrix, int[] vector) {
        int vectorLength = vector.length;
        int[] result = new int[vectorLength];
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != vectorLength) {
                System.out.println("Увы, но количество строк в векторе не совпадает с количеством столбцов в матрице :(");
                System.out.printf("Ошибка во вложенном массиве с индексом %d", i);
                return;
            } else {
                for (int j = 0; j < matrix[i].length; j++) {
                    result[i] += matrix[i][j] * vector[j];
                }
            }
        }
        System.out.print("Результат умножения матрицы на вектор: ");
        System.out.println(Arrays.toString(result));
    }
}
