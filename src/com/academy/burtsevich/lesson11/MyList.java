package com.academy.burtsevich.lesson11;

import java.util.*;
import java.util.function.UnaryOperator;

public class MyList<T> implements List<T> {

    /*
    Напишите класс MyList <T>, который реализует методы
    add(T e),
    remove(int index),
    get(int index),
    size(),
    toString(),
    set(int index, T e),
    add(int index, T e),
    addAll(List<?> c),
    clear()
     */

    private T[] elements = (T[]) new Object[]{};
    private int size;

    @Override
    public boolean add(T t) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 3 / 2 + 1);
        }
        elements[size++] = t;
        return true;
    }


    @Override
    public T remove(int index) {
        T t = elements[index];
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        size--;
        return t;
    }

    @Override
    public T get(int index) {
        if (index > size - 1) {
            throw new IndexOutOfBoundsException();
        }
        return elements[index];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String sep = ", ";
        stringBuilder.append("[");
        if (elements.length > 0){
            for (int i = 0; i < size; i++) {
                stringBuilder.append(elements[i]);
                if (i < size - 1) {
                    stringBuilder.append(sep);
                }
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public T set(int index, T element) {
        if (index < 0 || index > size - 1){
            throw new IndexOutOfBoundsException();
        }
        T returningElement = elements[index];
        elements[index] = element;
        return returningElement;
    }

    @Override
    public void add(int index, T element) {
        if (index < 0 || index > size - 1){
            throw new IndexOutOfBoundsException();
        }
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 3 / 2 + 1);
        }
        size++;
        System.arraycopy(elements, index, elements, index + 1, size-index-1);
        elements[index] = element;
    }


    @Override
    public boolean addAll(Collection<? extends T> c) { //метод не работает. всегда исключение java.lang.ArrayIndexOutOfBoundsException
        T[] array = (T[]) c.toArray();
        int positionIndex = elements.length;
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length + c.size());
        }
        size += c.size();
        System.arraycopy(array, 0, elements, positionIndex , array.length);
        return true;
    }

    @Override
    public void clear() {
        elements = (T[]) new Object[0];
        size = 0;
    }








    @Override
    public Object[] toArray() {
        return elements;
    }



    public T[] getElements() {
        return elements;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public void replaceAll(UnaryOperator<T> operator) {
        List.super.replaceAll(operator);
    }

    @Override
    public void sort(Comparator<? super T> c) {
        List.super.sort(c);
    }

    @Override
    public Spliterator<T> spliterator() {
        return List.super.spliterator();
    }


    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }



    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }


    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }

}
