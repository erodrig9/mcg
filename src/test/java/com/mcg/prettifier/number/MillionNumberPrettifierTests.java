package com.mcg.prettifier.number;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

/**
 * Unit test for million prettifier
 */
public class MillionNumberPrettifierTests {
    @Test
    public void testOneMillion() {
        final String expected = "1M";

        BigDecimal number = BigDecimal.valueOf(1000000L);
        final String actual = NumberPrettifierFactory.createNumberPrettifier(number).prettify();

        assertEquals(expected, actual);
    }

    @Test
    public void testTwoPointFiveMillion() {
        final String expected = "2.5M";

        BigDecimal number = BigDecimal.valueOf(2500000.34);
        final String actual = NumberPrettifierFactory.createNumberPrettifier(number).prettify();

        assertEquals(expected, actual);
    }

    @Test
    public void testMaxMillion() {
        final String expected = "999M";

        BigDecimal number = BigDecimal.valueOf(999999999);
        final String actual = NumberPrettifierFactory.createNumberPrettifier(number).prettify();

        assertEquals(expected, actual);
    }
}