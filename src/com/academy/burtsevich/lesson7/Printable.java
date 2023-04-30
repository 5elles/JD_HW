package com.academy.burtsevich.lesson7;

public interface Printable {
    default void print(){
        System.out.println("Документ отправлен на печать!");
    }
}
