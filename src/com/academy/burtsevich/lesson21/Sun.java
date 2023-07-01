package com.academy.burtsevich.lesson21;

public final class Sun {
    private static volatile Sun instance;

    private Sun(){}

    public static Sun getInstance(){
        if (instance == null){
            synchronized (Sun.class){
                if (instance == null){
                    instance = new Sun();
                }
            }
        }
        return instance;
    }
}
