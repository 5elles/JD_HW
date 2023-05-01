package com.academy.burtsevich.lesson5;

import java.util.Arrays;
import java.util.Random;

public class Matrix {
    private int[][] matrix;

    public Matrix(int rows, int columns) {
        this.matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                this.matrix[i][j] = (int) ((java.lang.Math.random() * 20)) - 10;
            }
        }
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int rows, int columns) {
        this.matrix = new int[rows][columns];
    }

    public void printMatrix() {
        for (int i = 0; i < this.getMatrix().length; i++) {
            System.out.println(Arrays.toString(this.getMatrix()[i]));
        }
    }

    public Matrix add(Matrix matrix) {
        if (!compareLength(matrix)) {
            System.out.println("Ошибка! Размер матриц должен совпадать!");
        } else {
            Matrix newMatrix = new Matrix(this.matrix.length, this.getMatrix()[0].length);
            for (int m = 0; m < matrix.getMatrix().length; m++) {
                for (int i = 0; i < matrix.getMatrix()[m].length; i++) {
                    newMatrix.getMatrix()[m][i] = this.matrix[m][i] + matrix.getMatrix()[m][i];
                }
            }
            return newMatrix;
        }
        return matrix;
    }


    public Matrix multiply(Matrix matrix) {
        if (!compareLength(matrix)) {
            System.out.println("Ошибка! Размер матриц должен совпадать!");
        } else {
            Matrix newMatrix = new Matrix(this.matrix.length, this.getMatrix()[0].length);
            for (int m = 0; m < matrix.getMatrix().length; m++) {
                for (int i = 0; i < matrix.getMatrix()[m].length; i++) {
                    newMatrix.getMatrix()[m][i] = this.matrix[m][i] * matrix.getMatrix()[m][i];
                }
            }
            return newMatrix;
        }
        return matrix;
    }

    public Matrix subtract(Matrix matrix) {
        if (!compareLength(matrix)) {
            System.out.println("Ошибка! Размер матриц должен совпадать!");
        } else {
            Matrix newMatrix = new Matrix(this.matrix.length, this.getMatrix()[0].length);
            for (int m = 0; m < matrix.getMatrix().length; m++) {
                for (int i = 0; i < matrix.getMatrix()[m].length; i++) {
                    newMatrix.getMatrix()[m][i] = this.matrix[m][i] - matrix.getMatrix()[m][i];
                }
            }
            return newMatrix;
        }
        return matrix;
    }

    public boolean compareLength(Matrix other) {
        int countOther = 0;
        int countThis = 0;
        for (int i = 0; i < other.getMatrix().length; i++) {
            for (int j = 0; j < other.getMatrix()[i].length; j++) {
                countOther++;
            }
        }
        for (int i = 0; i < this.getMatrix().length; i++) {
            for (int j = 0; j < this.getMatrix()[i].length; j++) {
                countThis++;
            }
        }
        return countOther == countThis;
    }
}


