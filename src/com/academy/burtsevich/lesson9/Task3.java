package com.academy.burtsevich.lesson9;

public class Task3 {
    public static void main(String[] args) {
        Num<Number> num1 = new Num<>(10);
        Num<Number> num2 = new Num<>(15.2);

        System.out.println(num1.compareNumsAsStrings(1.2));
        System.out.println(num2.compareNumsAsStrings(3432));
    }

}
