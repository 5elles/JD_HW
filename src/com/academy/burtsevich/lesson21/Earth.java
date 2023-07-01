package com.academy.burtsevich.lesson21;

public final class Earth {
    private static volatile Earth instance;
    private Earth(){}

    public static Earth getInstance(){
        if (instance == null){
            synchronized (Earth.class){
                if (instance == null){
                    instance = new Earth();
                }
            }
        }
        return instance;
    }
}
