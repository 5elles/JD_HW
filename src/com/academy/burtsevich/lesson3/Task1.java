package com.academy.burtsevich.lesson3;


public class Task1 {
    public static void main(String[] args) {
        int[] multiplication = new int[10];
        for (int i = 0; i < multiplication.length; i++) {
            multiplication[i] = (i+1) * 5;
        }
        System.out.println("Таблица умножения на 5 (в строку):");
        for (int j : multiplication) {
            System.out.print(j + " ");
        }
    }
}
