package com.academy.burtsevich.lesson9;

public class Pair<T, U> {
    private T value1;
    private U value2;

    public Pair(T value1, U value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getValue1() {
        return value1;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public U getValue2() {
        return value2;
    }

    public void setValue2(U value2) {
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "Class Pair{" +
                "\n\tvalue1 = " + value1 +
                ",\n\tvalue2 = " + value2 +
                "\n}";
    }

    public T first() {
        return this.value1;
    }

    public U last() {
        return this.value2;
    }

    public Pair<U, T> swap() {
        return new Pair<>(value2, value1);
    }

    public void replaceFirst(T newVal) {
        this.value1 = newVal;
    }

    public void replaceLast(U newVal) {
        this.value2 = newVal;
    }
}
