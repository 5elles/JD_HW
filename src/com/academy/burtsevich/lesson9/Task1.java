package com.academy.burtsevich.lesson9;

public class Task1 {
    public static void main(String[] args) {
        String[] s = {"one", "two"};
        Integer[] integers = {1,2,3,5,10};
        AnyType<?> array1 = new AnyType<>(s); //wild card допускается использовать в методах и классах, которые принимают значения каких-то неизвестных нам типов. но когда мы объявляем переменную нам нужно явно указать каким типом она будет параметризована
        System.out.println();
        System.out.println(array1.getElementFromArray(0));
        System.out.println(array1.getElementFromArray(5));
        System.out.println();
        AnyType<?> array2 = new AnyType<>(integers); // то же самое
        System.out.println(array2.getElementFromArray(0));
        System.out.println(array2.getElementFromArray(5));
    }
}
