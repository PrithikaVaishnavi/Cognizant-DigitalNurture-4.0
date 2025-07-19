package com.example.AAAPattern;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest 
{

	    private Calculator calc;

	    // Setup method: runs before every test
	    @Before
	    public void setUp() 
	    {
	        calc = new Calculator();  // Arrange
	        System.out.println("Setup complete");
	    }

	    // Teardown method: runs after every test
	    @After
	    public void tearDown() 
	    {
	        calc = null;
	        System.out.println("Teardown complete");
	    }

	    @Test
	    public void testAdd() 
	    {
	        // Arrange done in setUp()

	        // Act
	        int result = calc.add(4, 6);

	        // Assert
	        assertEquals(10, result);
	    }

	    @Test
	    public void testSubtract() 
	    {
	        // Arrange done in setUp()

	        // Act
	        int result = calc.subtract(9, 4);

	        // Assert
	        assertEquals(5, result);
	    }
}
