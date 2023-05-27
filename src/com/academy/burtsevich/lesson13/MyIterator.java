package com.academy.burtsevich.lesson13;

import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {

    private T[][] tDa;
    int indexI = 0;
    int indexJ = 0;

    public MyIterator(T[][] array) {
        this.tDa = array;
    }

    @Override
    public boolean hasNext() {
        return !(indexI == tDa.length - 1 & indexJ == tDa[indexI].length);
    }

    @Override
    public T next() {
        T result = tDa[indexI][indexJ++];
        if (indexJ >= tDa[indexI].length & indexI < tDa.length - 1) {
            indexI++;
            indexJ = 0;
        }
        return (T) result;
    }


}
