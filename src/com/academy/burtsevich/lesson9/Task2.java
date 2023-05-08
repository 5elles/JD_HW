package com.academy.burtsevich.lesson9;

public class Task2 {
    public static void main(String[] args) {
        Pair<?, ?> pair1 = new Pair<>(1, 2);
        Pair<?, ?> pair2 = new Pair<>("first", "second");
        Pair<?, ?> pair3 = new Pair<>("first", 2);

        System.out.println("************");
        pair1.first();
        System.out.println("************");
        pair2.last();
        System.out.println("************");
        System.out.println("Pair3 до применения swap:\n" + pair3.toString());
        pair3.swap();
        System.out.println("Pair3 после swap:\n" + pair3.toString());
        System.out.println("************");
        System.out.println("До применения метода \"replaceFirst\":\n" + pair1.toString());
        pair1.replaceFirst("new value");
        System.out.println("После \"replaceFirst\":\n" + pair1.toString());
        System.out.println("************");
        System.out.println("До  \"replaceLast\":\n" + pair2.toString());
        pair2.replaceLast(123);
        System.out.println("После \"replaceLast\":\n" + pair2.toString());


    }
}
