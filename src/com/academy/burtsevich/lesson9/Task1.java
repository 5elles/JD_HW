package com.academy.burtsevich.lesson9;

public class Task1 {
    public static void main(String[] args) {
        String[] s = {"one", "two"};
        Integer[] integers = {1,2,3,5,10};
        AnyType<?> array1 = new AnyType<>(s);
        System.out.println();
        System.out.println(array1.getElementFromArray(0));
        System.out.println(array1.getElementFromArray(5));
        System.out.println();
        AnyType<?> array2 = new AnyType<>(integers);
        System.out.println(array2.getElementFromArray(0));
        System.out.println(array2.getElementFromArray(5));
    }
}
