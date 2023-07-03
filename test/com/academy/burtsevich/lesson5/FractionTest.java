package com.academy.burtsevich.lesson5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class FractionTest {
    Fraction fraction = new Fraction(1, 2);
    @Test
    public void testGetFractionInStr(){
        String fractionInStr = fraction.getFractionInStr();
        assertEquals("1/2", fractionInStr);
    }
    @Test
    public void testGetSum(){
        Fraction sum = fraction.getSum(new Fraction(3, 2));
        assertEquals(new Fraction(4, 2), sum);
    }

    @Test
    public void testMultiplication(){
        Fraction multiplication = fraction.multiplication(3);
        assertEquals(new Fraction(3, 27), multiplication);
    }

    @Test
    public void testDivision(){
        Fraction division = fraction.division(3);
        assertEquals(new Fraction(1, 6), division);
    }

    @Test
    public void testDivisionByZero(){
        ArithmeticException arithmeticException = assertThrows(ArithmeticException.class, () -> fraction.division(0));
        assertEquals("Division by zero", arithmeticException.getMessage());
    }
}
