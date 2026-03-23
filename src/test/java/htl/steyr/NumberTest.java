package htl.steyr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberTest {

    //Test normale Zahlen
    @Test
    void addNormal() {
        Number number = new Number(5);
        Number other = new Number(3);
        assertEquals(8, number.add(other));
    }

    // Test negative Addition
    @Test
    void addNegative() {
        Number number = new Number(-5);
        Number other = new Number(-3);
        assertEquals(-8, number.add(other));
    }

    // Test null Addition
    @Test
    void addNull() {
        Number number = new Number(-5);
        assertThrows(NullPointerException.class, () -> number.add(null));
    }

    // normale division
    @Test
    void divideNormal() {
        Number number = new Number(10);
        Number other = new Number(2);
        assertEquals(5, number.divide(other));
    }

    // durch 0 ist nicht erlaubt
    @Test
    void divideTroughZero() {
        Number number = new Number(10);
        Number other = new Number(0);
        assertThrows(IllegalArgumentException.class, () -> number.divide(other));
    }

    // ist primzahl eine primzahl
    @Test
    void isPrimePrime() {
        Number number = new Number(7);
        assertTrue(number.isPrime());
    }

    // ist nicht primzahl nicht Primzahl
    @Test
    void isNonPrimePrime() {
        Number number = new Number(10);
        assertFalse(number.isPrime());
    }

    // Randfälle 0 und 1 Testen
    @Test
    void isZeroOrOnePrime() {
        Number number = new Number(0);
        assertFalse(number.isPrime());
        number = new Number(1);
        assertFalse(number.isPrime());
    }

}