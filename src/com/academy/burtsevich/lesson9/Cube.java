package com.academy.burtsevich.lesson9;

import java.util.Objects;

public class Cube extends Parallelepiped{ //необходимо параметризовать и Parallelepiped и Cube
    public Cube() {
    }

    public Cube(Number sideA, Number sideB, Number sideC) { //Принять параметризованные типы в конструктор
        super(sideA, sideB, sideC);
        if (!Objects.equals(this.getSideA(), this.getSideB()) || !Objects.equals(this.getSideA(), this.getSideC())){
            System.out.println("Куб должен иметь равные стороны!");
        }
    }

    @Override
    public void setSideA(Number sideA) {
        super.setSideA(sideA);
        super.setSideB(sideA);
        super.setSideC(sideA);
    }

    @Override
    public void setSideC(Number sideC) {
        super.setSideC(sideC);
        super.setSideA(sideC);
        super.setSideB(sideC);
    }

    @Override
    public void setSideB(Number sideB) {
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
