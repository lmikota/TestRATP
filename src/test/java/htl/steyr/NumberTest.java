package htl.steyr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberTest {

    @Test
    void add() {
        Number number = new Number(5);
        Number other = new Number(3);
        assertEquals(8, number.add(other));
    }

    @Test
    void divide() {
        Number number = new Number(10);
        Number other = new Number(2);
        assertEquals(5, number.divide(other));
    }

    @Test
    void isPrime() {
        Number number = new Number(7);
        assertTrue(number.isPrime());
    }
}