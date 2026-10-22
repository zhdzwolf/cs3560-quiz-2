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
        int expected = 1;
        int actual = calculator.sum(-1, 2);
        assertEquals(expected, actual);
    }

}
