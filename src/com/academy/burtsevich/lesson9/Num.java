package com.academy.burtsevich.lesson9;

public class Num<T extends Number> {
    private T value;

    public Num(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public boolean compareNumsAsStrings(T num){
        return value.toString().length() == num.toString().length();
    }
}
