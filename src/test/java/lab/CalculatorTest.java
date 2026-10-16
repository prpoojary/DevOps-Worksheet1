package lab;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void addsPositiveNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void addsNegativeNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(-1, calculator.add(2, -3));
    }
}
