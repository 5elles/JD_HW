package com.academy.burtsevich.lesson9;

public class Parallelepiped<T extends Number> extends Rectangle {
    private T sideC;

    public Parallelepiped() {
    }

    public Parallelepiped(Number sideA, Number sideB, T sideC) {
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
