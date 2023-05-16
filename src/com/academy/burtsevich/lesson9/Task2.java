package com.academy.burtsevich.lesson9;

public class Task2 {
    public static void main(String[] args) {
        Pair<Integer, Integer> pair1 = new Pair<>(1, 2);
        Pair<String, String> pair2 = new Pair<>("first", "second");
        Pair<String, Integer> pair3 = new Pair<>("first", 2);
        Pair<Line<Number>, Integer> pair4 = new Pair<>(new Line<>(3), 2);

        System.out.println("************");
        System.out.println("1-й элемент: " + pair1.first());
        System.out.println("************");
        System.out.println("2-й элемент: " + pair2.last());
        System.out.println("************");
        System.out.println("Pair3 до применения swap:\n" + pair3);
        pair3.swap();
        System.out.println("Pair3 после swap:\n" + pair3);
        System.out.println("************");
        System.out.println("До применения метода \"replaceFirst\":\n" + pair1);
        pair1.replaceFirst(1234);
        System.out.println("После \"replaceFirst\":\n" + pair1);
        System.out.println("************");
        System.out.println("До  \"replaceLast\":\n" + pair2);
        pair2.replaceLast("newValue");
        System.out.println("После \"replaceLast\":\n" + pair2);

        System.out.println(pair4);
        pair4.swap();
        System.out.println(pair4);
    }
}
