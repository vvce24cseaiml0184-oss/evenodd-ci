
package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class EvenOddTest {

    @Test
    void testEvenNumber() {
        assertEquals("Even", EvenOdd.checkNumber(4));
    }

    @Test
    void testOddNumber() {
        assertEquals("Odd", EvenOdd.checkNumber(7));
    }

    @Test
    void testZero() {
        assertEquals("Even", EvenOdd.checkNumber(0));
    }

    @Test
    void testNegativeEvenNumber() {
        assertEquals("Even", EvenOdd.checkNumber(-6));
    }

    @Test
    void testNegativeOddNumber() {
        assertEquals("Odd", EvenOdd.checkNumber(-3));
    }
}
