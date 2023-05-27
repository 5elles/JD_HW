package com.academy.burtsevich.lesson13;

import java.util.Iterator;

public class Task3 {
    public static void main (String[] args){
        TwoDArray<Integer> twoDArray = new TwoDArray<>(new Integer[][]{{1}, {2, 3, 4}});
        Iterator<Integer> myIterator = twoDArray.iterator();
        TwoDArray<String> twoDArrayString = new TwoDArray<>(new String[][]{{"one", "two"}, {"three"}, {"four", "five", "six"}});
        Iterator<String> stringIterator = twoDArrayString.iterator();


        while (myIterator.hasNext()) {
            System.out.println(myIterator.next());
        }
        System.out.println("###########################");
        while (stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }
    }
}
