package com.mcg.prettifier.number;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple number prettifier
 */
public class SimpleNumberPrettifierTests {
    @Test
    public void testOnePointOneBillion() {
        final String expected = "532";

        BigDecimal number = BigDecimal.valueOf(532L);
        final String actual = NumberPrettifierFactory.createNumberPrettifier(number).prettify();

        assertEquals(expected, actual);
    }
}