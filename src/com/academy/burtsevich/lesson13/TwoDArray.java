package com.academy.burtsevich.lesson13;

import java.util.Iterator;

public class TwoDArray<T> implements Iterable<T> {

    private T[][] array;

    public TwoDArray(T[][] a) {
        this.array = a;
    }

    public T[][] getArray() {
        return array;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator(array);
    }
}
