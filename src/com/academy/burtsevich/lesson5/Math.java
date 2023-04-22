package com.academy.burtsevich.lesson5;

public class Math {

    public static int gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static int lcm(int a, int b) {
            return (a * b / gcd(a, b));
    }
}
