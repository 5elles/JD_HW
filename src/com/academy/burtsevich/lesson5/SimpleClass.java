package com.academy.burtsevich.lesson5;

public class SimpleClass {
    private int a;
    private char b;

    public SimpleClass(){
        this(0, 'a');
    }

    public SimpleClass (int a, char b){
        this.a = a;
        this.b = b;
    }

    public void setA(int a){
        this.a = a;
    }

    public int getA(){
        return this.a;
    }

    public void setB(char b){
        this.b = b;
    }

    public char getB(){
        return this.b;
    }
}
