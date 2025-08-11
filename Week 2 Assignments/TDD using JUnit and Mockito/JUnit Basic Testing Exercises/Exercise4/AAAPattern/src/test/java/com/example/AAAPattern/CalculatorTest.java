package com.example.AAAPattern;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class CalculatorTest {

    private Calculator calculator;
    @BeforeEach
    void setUp() 
    {
        calculator = new Calculator();
    }
    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    public void testAddition() 
    {
        // Arrange
        int a = 5, b = 3;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(8, result);
    }

    @Test
    public void testSubtraction() {
        int result = calculator.subtract(10, 4);
        assertEquals(6, result);
    }

    @Test
    public void testMultiplication() {
        int result = calculator.multiply(7, 6);
        assertEquals(42, result);
    }

    @Test
    public void testDivision() {
        int result = calculator.divide(20, 4);
        assertEquals(5, result);
    }

    @Test
    public void testDivideByZero_ThrowsException() {
        calculator.divide(10, 0);
    }
}

