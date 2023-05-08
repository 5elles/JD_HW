package com.academy.burtsevich.lesson9;

import java.lang.reflect.Array;

public class AnyType<T> {
    private T[] array;

    public AnyType(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public String getElementFromArray(int index) {
        if (index < 0 || index > this.array.length - 1) {
            return "Индекс за пределами массива!";
        } else {
            return this.array[index].toString();
        }

    }
}
