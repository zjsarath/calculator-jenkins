package com.agile.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void addsTwoNumbers() {
        Calculator c = new Calculator();
        int actual = c.add(19, 23);
        int expected = 42;  // change this later to make a build fail (per lab)
        assertEquals(expected, actual);
    }
}