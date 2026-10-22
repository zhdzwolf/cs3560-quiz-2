// cyberpunk edgerunners ii was so goated

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testSumPositive() {
        int expected = 3;
        int actual = calculator.sum(1, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void testSumNegative() {
        int expected = -1;
        int actual = calculator.sum(1, -2);
        assertEquals(expected, actual);
    }

    @Test
    public void testSumZero() {
        int expected = 2;
        int actual = calculator.sum(0, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void testSubtractNegative() {
        int expected = 3;
        int actual = calculator.subtract(1, -2);
        assertEquals(expected, actual);
    }

    @Test
    public void testSubtractZero() {
        int expected = 2;
        int actual = calculator.subtract(2, 0);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply() {
        int expected = 25480380;
        int actual = calculator.multiply(19245, 1324);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiplyNegative() {
        int expected = -247;
        int actual = calculator.multiply(19, -13);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiplyZero() {
        int expected = 0;
        int actual = calculator.multiply(0, 7);
        assertEquals(expected, actual);
    }

}
