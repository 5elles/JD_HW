package com.academy.burtsevich.lesson11;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MySet<T> implements Set<T> {
    /*
    реализует методы
    + add(T e),
    + remove(Object o),
    + contains(Object o),
    + size(),
    + isEmpty(),
    + addAll(List<?> c),
    + containsAll(Collection<?> c),
    + removeAll(Collection<?> c) ,
    + toString()
     */


    private T[] setElements = (T[]) new Object[]{};
    private int size;

    @Override
    public boolean add(T t) {
        boolean flag = false;
        for (T setElement : setElements) {
            if (Objects.equals(setElement, t)) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            setElements = Arrays.copyOf(setElements, setElements.length + 1);
            setElements[size++] = t;
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < setElements.length; i++) {
            if (Objects.equals(setElements[i], o)) {
                System.arraycopy(setElements, i + 1, setElements, i, setElements.length - i - 1);
                size--;
                setElements = Arrays.copyOf(setElements, size);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean contains(Object o) {
        boolean flag = false;
        for (int i = 0; i < setElements.length; i++) {
            if (Objects.equals(setElements[i], o)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        T[] cArray = removeDubles(c);
        T[] tempArray = Arrays.copyOf(setElements, setElements.length);
        int destPos = tempArray.length;
        boolean flag;
        for (int i = 0; i < cArray.length; i++) {
            flag = true;
            for (int j = 0; j < setElements.length; j++) {
                if (Objects.equals(cArray[i], setElements[j])) {
                    flag = false;
                }
            }
            if (flag) {
                if (tempArray.length == size) {
                    tempArray = Arrays.copyOf(tempArray, size + 1);
                }
                size++;
                System.arraycopy(cArray, i, tempArray, destPos++, 1);
            }
        }
        setElements = tempArray;
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        boolean flag = true;
        T[] cArray = (T[]) c.toArray();
        for (int i = 0; i < cArray.length; i++) {
            for (int j = 0; j < setElements.length; j++) {
                flag = false;
                if (Objects.equals(setElements[j], cArray[i])) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        T[] cArray = removeDubles(c);

        for (int i = 0; i < cArray.length; i++) {
            for (int j = 0; j < setElements.length; j++) {
                if (Objects.equals(cArray[i], setElements[j])){
                    setElements[j] = null;
                }
            }
        }

        T[] tempArray = (T[]) new Object[setElements.length];
        int length = 0;
        for (int i = 0, j = 0; i < setElements.length; i++) {
            if (setElements[i] != null){
                tempArray[j++] = setElements[i];
            }
            length = j;
        }
        tempArray = Arrays.copyOf(tempArray, length);
        setElements = Arrays.copyOf(tempArray, length);
        Arrays.sort(setElements);
        return true;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        String sep = ", ";
        builder.append("[");
        if (setElements.length > 0) {
            for (int i = 0; i < setElements.length; i++) {
                builder.append(setElements[i]);
                if (i < setElements.length - 1) {
                    builder.append(sep);
                }
            }
        }
        builder.append("]");
        return builder.toString();
    }







    public T[] removeDubles (Collection<?> c) {
        T[] cArray = (T[]) c.toArray();
        Arrays.sort(cArray);

        for (int i = 0; i < cArray.length-1; i++) {
            if (Objects.equals(cArray[i], cArray[i+1])){
                cArray[i] = null;
            }
        }
        T[] tempArray = (T[]) new Object[cArray.length];
        int length = 0;
        for (int i = 0, j = 0; i < cArray.length; i++) {
            if (cArray[i] != null){
                tempArray[j++] = cArray[i];
            }
            length = j;
        }
        cArray = Arrays.copyOf(cArray, length);
        System.arraycopy(tempArray, 0, cArray, 0, length);
        Arrays.sort(cArray);
        return cArray;
    }




    @Override
    public Spliterator<T> spliterator() {
        return Set.super.spliterator();
    }

    @Override
    public <T1> T1[] toArray(IntFunction<T1[]> generator) {
        return Set.super.toArray(generator);
    }

    @Override
    public boolean removeIf(Predicate<? super T> filter) {
        return Set.super.removeIf(filter);
    }

    @Override
    public Stream<T> stream() {
        return Set.super.stream();
    }

    @Override
    public Stream<T> parallelStream() {
        return Set.super.parallelStream();
    }


    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return setElements;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
