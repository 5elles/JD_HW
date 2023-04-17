package com.academy.burtsevich.lesson4;

public class Task1 {
    public static void main(String[] args) {
        double aFirst = 756.13;
        double xFirst = 0.3;
        double aSecond = 1.21;
        double bSecond = 0.371;
        double xThird = 12.1;
        double aDeltaThird = 3.75;
        double aMinThird = -5;
        double aMaxThird = 12;
        System.out.println("Task1: " + expressionOne(aFirst, xFirst));
        System.out.println("***********************");
        System.out.println("Task2: " + expressionTwo(aSecond, bSecond));
        System.out.println("***********************");
        System.out.println("Task3: ");
        expressionThree(xThird, aMinThird, aMaxThird, aDeltaThird);
    }

    public static double expressionOne(double a, double x) {
        double z = Math.cos(Math.pow((Math.pow(x, 2) + Math.PI / 6), 5)) -
                Math.sqrt(x * Math.pow(a, 3) - Math.log(Math.abs((a - 1.12 * x) / 4)));
        return z;
    }

    public static double expressionTwo(double a, double b) {
        double y = Math.tan(Math.pow((a + b), 2)) - Math.cbrt(a + 1.5) + a * Math.pow(b, 5) - b / Math.log(Math.pow(a, 2));
        return y;
    }

    public static void expressionThree(double x, double aMin, double aMax, double aDelta) {
        System.out.printf("%-10s%-10s%n", "Параметр", "Результат");
        System.out.println("---------------------------------");
        for (double i = aMin; i < aMax; i += aDelta) {
            System.out.printf("%-10.2f%-30f%n", i, (Math.pow(Math.E, i * x) - 3.45 * i));
//            System.out.println(Math.pow(Math.E, i * x) - 3.45 * i);
        }
    }
}
