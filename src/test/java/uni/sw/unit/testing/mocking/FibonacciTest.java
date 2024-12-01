package uni.sw.unit.testing.mocking;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import uni.sw.unit.testing.Fibonacci;


class FibonacciMockTest {

    private void mockFibonacci(int n, int expected) {
        Fibonacci fibonacci = mock(Fibonacci.class);
    
        when(fibonacci.getFibonacci(n)).thenReturn(expected);
    
        assertEquals(expected, fibonacci.getFibonacci(n));
    
        verify(fibonacci).getFibonacci(n);
    }

    @BeforeAll
    public static void startMessage() {
        System.out.println("Starting mock tests for Fibonacci class");
    }
    
    @Test
    @DisplayName("Fibonacci mock test (n = 15)")
    void mockFibonacci1() {
        mockFibonacci(15, 610);
    }
    
    @Test
    @DisplayName("Fibonacci mock test (n = 20)")
    void mockFibonacci2() {
        mockFibonacci(20, 6765);
    }
}