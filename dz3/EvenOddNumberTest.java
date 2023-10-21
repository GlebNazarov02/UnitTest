package dz3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EvenOddNumberTest {
    @Test
    public void testEvenNumber() {
        Number Number = new Number();
        boolean result = Number.evenOddNumber(6);
        assertTrue(result);
    }

    @Test
    public void testOddNumber() {
        Number Number = new Number();
        boolean result = Number.evenOddNumber(9);
        assertFalse(result);
    }

    @Test
    public void testZero() {
        Number Number = new Number();
        boolean result = Number.evenOddNumber(0);
        assertTrue(result);
    }
}

