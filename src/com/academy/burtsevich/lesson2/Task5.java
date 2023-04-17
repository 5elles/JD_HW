package com.academy.burtsevich.lesson2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество лет: ");
        int numOfYears = scanner.nextInt();
        String years = " лет", year = " год", yearA = " года";
        if (numOfYears > 0 && numOfYears < 20) {
            if (numOfYears == 1) {
                System.out.println(numOfYears + year);
            } else if (numOfYears == 2 || numOfYears == 3 || numOfYears == 4) {
                System.out.println(numOfYears + yearA);
            } else {
                System.out.println(numOfYears + years);
            }
        } else {
            if (numOfYears % 10 == 0 || numOfYears % 10 >= 5) {
                System.out.println(numOfYears + years);
            } else if (numOfYears % 10 == 1) {
                System.out.println(numOfYears + year);
            } else {
                System.out.println(numOfYears + yearA);
            }
        }
    }
}

