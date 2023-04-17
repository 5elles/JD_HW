package com.academy.burtsevich.lesson2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = scanner.nextInt();
        if (num % 2 == 0){
            System.out.println("Вы ввели четное число.");
        } else {
            System.out.println("Вы ввели нечетное число.");
        }
    }
}



