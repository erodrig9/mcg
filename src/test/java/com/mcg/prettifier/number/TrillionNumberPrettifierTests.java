package com.mcg.prettifier.number;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

/**
 * Unit test for trillion prettifier
 */
public class TrillionNumberPrettifierTests {
    @Test
    public void testNinePointFiveTrillion() {
        final String expected = "9.5T";

        BigDecimal number = BigDecimal.valueOf(9487634567534L);
        final String actual = NumberPrettifierFactory.createNumberPrettifier(number).prettify();

        assertEquals(expected, actual);
    }

    @Test
    public void testMinTrillion() {
        final String expected = "1T";

        BigDecimal number = BigDecimal.valueOf(1000000000000L);
        final String actual = NumberPrettifierFactory.createNumberPrettifier(number).prettify();

        assertEquals(expected, actual);
    }

    @Test
    public void testMaxTrillion() {
        final String expected = "999T";

        BigDecimal number = BigDecimal.valueOf(999999999999999L);
        final String actual = NumberPrettifierFactory.createNumberPrettifier(number).prettify();

        assertEquals(expected, actual);
    }

    @Test
    public void testQuadrillion() {
        final String expected = "1000T";

        BigDecimal number = BigDecimal.valueOf(1000000000000000L);
        final String actual = NumberPrettifierFactory.createNumberPrettifier(number).prettify();

        assertEquals(expected, actual);
    }
}