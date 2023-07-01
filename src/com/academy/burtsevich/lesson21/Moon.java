package com.academy.burtsevich.lesson21;

public final class Moon {
    private static volatile Moon instance;

    private Moon() {}

    public static Moon getInstance() {
        if (instance == null) {
            synchronized (Moon.class) {
                if (instance == null) {
                    instance = new Moon();
                }
            }
        }
        return instance;
    }
}
