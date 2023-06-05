package com.academy.burtsevich.lesson15;

public class Printer implements Runnable{
    private String text;

    public Printer(String text){
        this.text = text;
    }


    @Override
    public void run() {
        System.out.println(text + " | " + Thread.currentThread().getName());
    }
}
