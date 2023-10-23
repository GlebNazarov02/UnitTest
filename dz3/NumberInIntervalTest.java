package dz3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberInIntervalTest {
    @Test
    public void testNotInInterval() {
        Number Number = new Number();
        boolean result = Number.numberInInterval(6);
        assertTrue(result);
    }

    @Test
    public void testRight() {
        Number Number = new Number();
        boolean result = Number.numberInInterval(100);
        assertFalse(result);
    }
//123
    @Test
    public void testLeft() {
        Number Number = new Number();
        boolean result = Number.numberInInterval(25);
        assertTrue(result);
    }

    @Test
    public void testInside() {
        Number Number = new Number();
        boolean result = Number.numberInInterval(30);
        assertTrue(result);
    }
}
