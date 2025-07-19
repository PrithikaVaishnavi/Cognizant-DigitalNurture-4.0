package com.example.MockingAndStubbing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest 
{
	@Test
    public void testExternalApi() 
	{
        // Step 1: Create mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Stub method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Step 3: Inject mock into service
        MyService service = new MyService(mockApi);

        // Step 4: Act
        String result = service.fetchData();

        // Step 5: Assert
        assertEquals("Mock Data", result);
        
        // to verify whether mock was used
        verify(mockApi).getData();
    }
}
