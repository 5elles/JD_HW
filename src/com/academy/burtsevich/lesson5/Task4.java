package com.academy.burtsevich.lesson5;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(3, 4);
        Matrix matrix2 = new Matrix(3, 4);
        Matrix matrix3 = new Matrix(5, 7);


        System.out.println();
        System.out.println("Матрица №1");
        matrix1.printMatrix();

        System.out.println();
        System.out.println("Матрица №2");
        matrix2.printMatrix();

        Matrix matrix4 = matrix1.add(matrix2);
        System.out.println();
        System.out.println("Результат сложения матриц №1 и №2");
        matrix4.printMatrix();

        Matrix matrix5 = matrix1.multiply(matrix2);
        System.out.println();
        System.out.println("Результат умножения матриц №1 и №2");
        matrix5.printMatrix();

        Matrix matrix6 = matrix1.subtract(matrix2);
        System.out.println();
        System.out.println("Результат вычитания матриц №1 и №2");
        matrix6.printMatrix();

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


