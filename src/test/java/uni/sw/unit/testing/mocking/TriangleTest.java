package uni.sw.unit.testing.mocking;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import uni.sw.unit.testing.Triangle;


class TriangleMockTest {

    private Triangle mockTriangle;

    @BeforeAll
    public static void startMessage() {
        System.out.println("Starting mock tests for Triangle class");
    }

    @BeforeEach
    void setUp() {
        mockTriangle = mock(Triangle.class);
    }

    @Test
    @DisplayName("Triangle isosceles default value test")
    void mockDefaultIsosceles() {
        assertEquals(false, mockTriangle.isIsosceles());
    }

    @Test
    @DisplayName("Triangle equilateral default value test")
    void mockDefaultEquilateral() {
        assertEquals(false, mockTriangle.isEquilateral());
    }

    @Test
    @DisplayName("Triangle right-angled default value test")
    void mockDefaultRightAngled() {
        assertEquals(false, mockTriangle.isRightAngeled());
    }

    @Test
    @DisplayName("Triangle perimeter default value test")
    void mockDefaultPerimeter() {
        assertEquals(0, mockTriangle.getPerimeter());
    }

    @Test
    @DisplayName("Triangle area default value test")
    void mockDefaultArea() {
        assertEquals(0, mockTriangle.getArea());
    }

    @Test
    @DisplayName("Triangle isosceles mock test")
    void mockIsosceles() {
        boolean expected = true;
        when(mockTriangle.isIsosceles()).thenReturn(expected);

        assertEquals(expected, mockTriangle.isIsosceles());

        verify(mockTriangle, times(1)).isIsosceles();
    }

    @Test
    @DisplayName("Triangle equilateral mock test")
    void mockEquilateral() {
        boolean expected = true;
        when(mockTriangle.isEquilateral()).thenReturn(expected);

        assertEquals(expected, mockTriangle.isEquilateral());

        verify(mockTriangle, times(1)).isEquilateral();
    }

    @Test
    @DisplayName("Triangle right-angled mock test")
    void mockRightAngled() {
        boolean expected = true;
        when(mockTriangle.isRightAngeled()).thenReturn(expected);

        assertEquals(expected, mockTriangle.isRightAngeled());

        verify(mockTriangle, times(1)).isRightAngeled();
    }

    @Test
    @DisplayName("Triangle perimeter mock test")
    void mockPerimeter() {
        int expected = 42;
        when(mockTriangle.getPerimeter()).thenReturn(expected);

        assertEquals(expected, mockTriangle.getPerimeter());

        verify(mockTriangle, times(1)).getPerimeter();
    }

    @Test
    @DisplayName("Triangle area mock test")
    void mockArea() {
        double expected = 12.5;
        when(mockTriangle.getArea()).thenReturn(expected);

        assertEquals(expected, mockTriangle.getArea());

        verify(mockTriangle, times(1)).getArea();
    }

    @Test
    @DisplayName("Triangle isosceles and equilateral mock test")
    void mockIsoscelesAndEquilateral() {
        boolean expected = true;
        when(mockTriangle.isIsosceles()).thenReturn(expected);
        when(mockTriangle.isEquilateral()).thenReturn(expected);

        assertEquals(expected, mockTriangle.isIsosceles());
        assertEquals(expected, mockTriangle.isEquilateral());

        verify(mockTriangle, times(1)).isIsosceles();
        verify(mockTriangle, times(1)).isEquilateral();
    }
}
