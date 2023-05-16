package com.academy.burtsevich.lesson10;

public class Task1 {
    public static void main(String[] args) {
        String s = null;
        try {
            if (Math.random() > 0.5) {
                s.length();
            } else {
                Integer.parseInt(s);
            }
        } catch (NullPointerException | NumberFormatException e) {
            System.err.println("Исключение: " + e.getClass());
        }
    }
}
