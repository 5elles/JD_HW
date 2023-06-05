package com.academy.burtsevich.lesson15;

public class ArraySum extends Thread {
    private final int[] array;
    private int sum;

    public ArraySum(int[] array) {
        this.array = array;
    }

    public int getSum() {
        return this.sum;
    }

    public void sum() {
        for (int j : array) {
            sum += j;
        }
    }

    @Override
    public void run() {
        try {
            sum();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
