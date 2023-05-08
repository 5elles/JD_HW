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



    public void first() {
        System.out.println("1-й элемент: " + this.value1);
    }

    public void last() {
        System.out.println("2-й элемент: " + this.value2);
    }

    public void swap() {
        T temp = this.value1;
        value1 = (T) value2;
        value2 = (U) temp;
    }

    public void replaceFirst(Object newVal){
        this.value1 = (T) newVal;
    }

    public void replaceLast(Object newVal){
        this.value2 = (U) newVal;
    }
}
