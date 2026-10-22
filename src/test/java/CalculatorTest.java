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

}
