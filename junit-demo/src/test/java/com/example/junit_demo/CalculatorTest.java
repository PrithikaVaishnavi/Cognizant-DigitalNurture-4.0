package com.example.junit_demo;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest 
{
		// TODO Auto-generated constructor stub
		@Test
	    public void testAdd() 
		{
	        Calculator calc = new Calculator();
	        int result = calc.add(2,3);
	        assertEquals(5, result);
		}
		
		@Test
	    public void testSubtract() 
		{
	        Calculator calc = new Calculator();
	        int result = calc.subtract(5,3);
	        assertEquals(2,result);
	    }

	    @Test
	    public void testMultiply() 
	    {
	        Calculator calc = new Calculator();
	        int result = calc.multiply(4,3);
	        assertEquals(12,result);
	    }

	    @Test
	    public void testDivide() 
	    {
	        Calculator calc = new Calculator();
	        int result = calc.divide(10,2);
	        assertEquals(5,result);
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void testDivideByZero() 
	    {
	        Calculator calc = new Calculator();
	        calc.divide(10, 0); // This should throw an exception
	    }
}
