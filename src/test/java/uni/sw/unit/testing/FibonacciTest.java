package uni.sw.unit.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;


class FibonacciTest {

    private void testFibonacci(int n, int expected) {
        Fibonacci fibonacci = new Fibonacci();
    
        int actual = fibonacci.getFibonacci(n);
        assertEquals(expected, actual, n + "th Fibonacci: expected " + expected + ", got " + actual);
    }

    @BeforeAll
    public static void startMessage() {
        System.out.println("Starting unit tests for Fibonacci class");
    }

    @Test
    @DisplayName("Fibonacci unit test (n = 8)")
    void testFibonacci1() {
        testFibonacci(8, 21);
    }

    @Test
    @DisplayName("Fibonacci unit test (n = 23)")
    void testFibonacci2() {
        testFibonacci(23, 28657);
    }

    @Test
    @DisplayName("Fibonacci unit test (negative n)")
    void testFibonacciNegative() {
        Fibonacci fibonacci = new Fibonacci();
        
        assertThrows(IllegalArgumentException.class, () -> fibonacci.getFibonacci(-1));
    }
}
