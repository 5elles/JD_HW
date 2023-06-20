package com.academy.burtsevich.lesson18;

public class Bean {

    public Bean(){}

    @Param(a = 4, b = 5)
    public double sum(int a, int b) {
        return a + b;
    }

    @Param(a = 3, b = 5)
    public double max(int a, int b) {
        return Math.max(a, b);
    }

    @Param(a = 2, b = 1)
    public double min(int a, int b) {
        return Math.min(a, b);
    }

    public double avg(int a, int b) {
        return (double) (a + b) / 2;
    }

}
