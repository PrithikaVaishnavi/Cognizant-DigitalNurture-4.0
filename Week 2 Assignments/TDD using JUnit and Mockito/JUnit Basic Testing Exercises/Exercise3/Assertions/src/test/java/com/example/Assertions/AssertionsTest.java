package com.example.Assertions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest 
{
    @Test
    public void testAssertions() 
    {
        assertEquals(5, 2 + 3);
        assertTrue(5 > 3);
        assertFalse(5 < 3);

        String str = null;
        assertNull(str);

        Object obj = new Object();
        assertNotNull(obj);
    }
}
