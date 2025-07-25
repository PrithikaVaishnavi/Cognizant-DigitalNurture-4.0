package com.example.VerifyingInteractions;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MyServiceTest 
{
    @Test
    public void testVerifyInteraction() 
    {
        // Arrange: Create mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // Act: Call service method
        MyService service = new MyService(mockApi);
        service.fetchData();

        // Assert: Verify interaction
        verify(mockApi).getData();
    }
}
