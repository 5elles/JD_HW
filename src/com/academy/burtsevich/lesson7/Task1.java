package com.academy.burtsevich.lesson7;

import java.util.Arrays;
import java.util.Objects;

public class Task1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Document doc1 = new Document("Кому на Руси жить хорошо", 34, true);
        Document doc2 = new Document("Курица", 7, true);
        Document doc3 = new Document("Всякая чушь", 2, true);
        Document doc4 = doc1.clone();
        Document doc5 = null;
        String doc6 = "Контроль";
        Object object = doc4;
        Printable printable = (Printable) object;


        Document[] documents = {doc1, doc2, doc3};

        Arrays.sort(documents);
        System.out.println("_____________________________________");
        System.out.println("Сортировка массива по возрастанию: ");
        System.out.println(Arrays.toString(documents));
        System.out.println("_____________________________________");
        System.out.print("Сравнение клона через ==: ");
        System.out.println(doc1 == doc4);
        System.out.print("Сравнение исходного объекта и клонированного через equals: ");
        System.out.println(doc1.equals(doc4));
        System.out.print("Сравнение клонированного объекта с др. объектом этого же класса через equals: ");
        System.out.println(doc4.equals(doc3));
        System.out.print("Сравнение исходного объекта c null: ");
        System.out.println(doc1.equals(doc5));
        System.out.print("Сравнение исходного объекта и объекта др. класса: ");
        System.out.println(doc1.equals(doc6));
        System.out.println("_____________________________________");
        System.out.println("Печать через метод объекта printable: ");
        printable.print();
        System.out.println("_____________________________________");
        System.out.println("Проверка хэша на объектах, равных по equals: ");
        System.out.println("Хэш объекта doc1: " + doc1.hashCode());
        System.out.println("Хэш объекта doc4: " + doc4.hashCode());


    }
}
