package com.academy.burtsevich.lesson5;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(3, 4);
        Matrix matrix2 = new Matrix(3, 4);
        Matrix matrix3 = new Matrix(5, 7);


        System.out.println();
        System.out.println("Матрица №1");
        Matrix.printMatrix(matrix1);
        System.out.println();
        System.out.println("Матрица №2");
        Matrix.printMatrix(matrix2);

        Matrix matrix4 = matrix1.add(matrix2);
        System.out.println();
        System.out.println("Результат сложения матриц №1 и №2");
        Matrix.printMatrix(matrix4);

        Matrix matrix5 = matrix1.multiply(matrix2);
        System.out.println();
        System.out.println("Результат умножения матриц №1 и №2");
        Matrix.printMatrix(matrix5);

        Matrix matrix6 = matrix1.subtract(matrix2);
        System.out.println();
        System.out.println("Результат вычитания матриц №1 и №2");
        Matrix.printMatrix(matrix6);

        System.out.println();
        System.out.println("Попытка сложить разные по размеру матрицы:");
        Matrix matrix7 = matrix3.add(matrix2);
        System.out.println();

        System.out.println();
        System.out.println("Попытка умножить разные по размеру матрицы:");
        Matrix matrix8 = matrix3.multiply(matrix2);
        System.out.println();

    }
}


