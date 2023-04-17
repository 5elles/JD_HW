package com.academy.burtsevich.lesson3;

public class Task2 {
    public static void main(String[] args) {
        int[] sequence = new int[10000];
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = i;
        }
        for (int number : sequence){
            System.out.println(number);
        }
    }
}
