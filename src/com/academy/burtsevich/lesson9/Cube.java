package com.academy.burtsevich.lesson9;

import java.util.Objects;

public class Cube<T extends Number> extends Parallelepiped<T>{
    public Cube() {
    }

    public Cube(T sideA, T sideB, T sideC) {
        super(sideA, sideB, sideC);
        if (!Objects.equals(this.getSideA(), this.getSideB()) || !Objects.equals(this.getSideA(), this.getSideC())){
            System.out.println("Куб должен иметь равные стороны!");
        }
    }

    @Override
    public void setSideA(T sideA) {
        super.setSideA(sideA);
        super.setSideB(sideA);
        super.setSideC(sideA);
    }

    @Override
    public void setSideC(T sideC) {
        super.setSideC(sideC);
        super.setSideA(sideC);
        super.setSideB(sideC);
    }

    @Override
    public void setSideB(T sideB) {
        super.setSideB(sideB);
        super.setSideA(sideB);
        super.setSideA(sideB);
    }

    @Override
    public String toString() {
        return
                "a = "+ this.getSideA().doubleValue() +
                "\nb = "+ this.getSideB().doubleValue() +
                "\nc = "+ this.getSideC().doubleValue();
    }
}
