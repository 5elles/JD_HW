package com.academy.burtsevich.lesson18;

public class CallOld {
    public static void main(String[] args) {
        System.out.println(call());
    }
    @SuppressWarnings({"deprecation"})
    public static String call() {
        return new TestAnnotation().old();
    }
}
