package com.academy.burtsevich.lesson5;

import com.academy.burtsevich.lesson4.Task2;

public class Fraction {
    private int numerator, denominator;

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public String getFractionInStr(){
        String numeratorString = Integer.toString(this.numerator);
        String denominatorString = Integer.toString(this.denominator);
        return numeratorString + " / " + denominatorString;
    }

    public Fraction getSum(Fraction secondFrac){
        int nod = Math.lcm(this.denominator, secondFrac.denominator);
        int newThisNumerator = this.numerator * (nod / this.denominator);
        int newSecondNumerator = secondFrac.numerator * (nod / secondFrac.denominator);
        return new Fraction(newThisNumerator + newSecondNumerator, nod);

    }

    public Fraction multiplication (int number){
        return new Fraction(this.numerator * number, this.denominator);
    }

    public Fraction division (int number){
        return new Fraction(this.numerator, this.denominator * number);
    }

}
