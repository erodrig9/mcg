package com.mcg.prettifier.number;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

/**
 * Unit test for billion prettifier
 */
public class BillionNumberPrettifierTests {
    @Test
    public void testOnePointOneBillion() {
        final String expected = "1.1B";

        BigDecimal number = BigDecimal.valueOf(1123456789L);
        final String actual = NumberPrettifierFactory.createNumberPrettifier(number).prettify();

        assertEquals(expected, actual);
    }

    @Test
    public void testMinBillion() {
        final String expected = "1B";

        BigDecimal number = BigDecimal.valueOf(1000000000L);
        final String actual = NumberPrettifierFactory.createNumberPrettifier(number).prettify();

        assertEquals(expected, actual);
    }

    @Test
    public void testMaxBillion() {
        final String expected = "999B";

        BigDecimal number = BigDecimal.valueOf(999999999999L);
        final String actual = NumberPrettifierFactory.createNumberPrettifier(number).prettify();

        assertEquals(expected, actual);
    }
}