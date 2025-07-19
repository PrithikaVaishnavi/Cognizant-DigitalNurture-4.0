package com.example.AssertionJunit;
import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionTest {
	@Test
    public void testAssertions() 
	{
        // Assert equals
        assertEquals(5, 2 + 3);

        // Assert true
        assertTrue(5 > 3);

        // Assert false
        assertFalse(5 < 3);

        // Assert null
        String str = null;
        assertNull(str);

        // Assert not null
        Object obj = new Object();
        assertNotNull(obj);
    }

}
