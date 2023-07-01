package com.academy.burtsevich.lesson21.area;

import java.util.Arrays;

public class Square implements Shape{

private double sideA;
Square(double[] param){
    this.sideA = param[0];
}
    @Override
    public double getArea() {
        return sideA * sideA;
    }
}
