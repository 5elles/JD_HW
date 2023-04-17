package com.academy.burtsevich.lesson2;

import java.math.BigInteger;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        BigInteger randomNum = BigInteger.valueOf((int) (Math.random() * 100));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число с порядком более чем 10^20: ");
        BigInteger bigNum = scanner.nextBigInteger();
        System.out.println("Случайное число: " + randomNum);
        System.out.println("Произведение чисел: " + bigNum.multiply(randomNum));

    }
}
