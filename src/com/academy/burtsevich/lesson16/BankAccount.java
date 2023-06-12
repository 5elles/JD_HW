package com.academy.burtsevich.lesson16;

public class BankAccount {

    public static final String MONITOR = "";
    public double balance = 0;

    public void decrease(){
        synchronized (MONITOR){
            balance -= 200;
        }
    }

    public void increase(){
        synchronized (MONITOR){
            balance += 100;
        }
    }
}
