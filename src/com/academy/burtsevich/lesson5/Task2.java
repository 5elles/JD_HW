package com.academy.burtsevich.lesson5;

public class Task2 {
    public static void main(String[] args) {
        Fraction a = new Fraction(1, 5);
        Fraction b = new Fraction(2, 7);
        int number = 3;

        System.out.println("Сумма дробей: " + a.getSum(b).getFractionInStr());
        System.out.println("Умножение на число: " + a.multiplication(number).getFractionInStr());
        System.out.println("Деление на число: " + b.division(number).getFractionInStr());


    }
}
