package com.academy.burtsevich.lesson4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
        System.out.println("Введите количество чисел Фибоначчи: ");
        number = scanner.nextInt();}
        while (number <= 0);
        System.out.println("Числа Фибоначчи: ");
        for (int i = 0; i < number; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    public static int fib(int number){
        if (number <= 1){
            return number;
        } else {
            return (fib(number -1) + fib(number-2)) ;
        }
    }
}
