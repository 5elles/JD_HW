package com.academy.burtsevich.lesson9;

public class Parallelepiped<T extends Number> extends Rectangle<T> {
    private T sideC;

    public Parallelepiped() {
    }

    public Parallelepiped(T sideA, T sideB, T sideC) {
        super(sideA, sideB);
        this.sideC = sideC;
    }



    public T getSideC() {
        return sideC;
    }

    public void setSideC(T sideC) {
        this.sideC = sideC;
    }
}
