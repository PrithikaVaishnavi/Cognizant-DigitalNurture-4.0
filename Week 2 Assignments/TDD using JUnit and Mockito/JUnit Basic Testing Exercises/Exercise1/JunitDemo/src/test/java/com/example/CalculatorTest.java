package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class CalculatorTest 
{
    private Calculator calculator;

    @Before
    public void setUp() 
    {
        calculator = new Calculator();
    }

    @Test
    public void testAddition() 
    {
        assertEquals("Addition failed", 10, calculator.add(7, 3));
    }

    @Test
    public void testSubtraction() 
    {
        assertEquals("Subtraction failed", 4, calculator.subtract(9, 5));
    }

    @Test
    public void testMultiplication() 
    {
        assertEquals("Multiplication failed", 15, calculator.multiply(3, 5));
    }

    @Test
    public void testDivision() 
    {
        assertEquals("Division failed", 4, calculator.divide(20, 5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionByZero() 
    {
        calculator.divide(10, 0);
    }
}
