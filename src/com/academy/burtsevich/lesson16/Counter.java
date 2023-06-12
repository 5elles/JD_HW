package com.academy.burtsevich.lesson16;

public class Counter implements Runnable {
    public static final String MONITOR = "";
    public static int counter = 0;
    void increment(){
        synchronized (MONITOR){
            counter++;
        }
    }

    @Override
    public void run() {
        for (int i=0; i<100; i++){
            increment();
        }
    }
}
