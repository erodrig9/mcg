package com.mcg.prettifier.number;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

public class NumberPrettifierFactoryTests {
    @Test
    public void testInvalidNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            BigDecimal number = null;
            NumberPrettifierFactory.createNumberPrettifier(number);
        });

        String expectedMessage = "Invalid number argument";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testNegativeNumber() {
        BigDecimal number = BigDecimal.valueOf(-10);
        NumberPrettifier numberPrettifier = NumberPrettifierFactory.createNumberPrettifier(number);
        assertThat(numberPrettifier).isInstanceOf(SimpleNumberPrettifier.class);
    }

    @Test
    public void testSimplePrettifier() {
        BigDecimal number = BigDecimal.valueOf(500L);
        NumberPrettifier numberPrettifier = NumberPrettifierFactory.createNumberPrettifier(number);
        assertThat(numberPrettifier).isInstanceOf(SimpleNumberPrettifier.class);
    }

    @Test
    public void testMaxSimplePrettifier() {
        BigDecimal number = BigDecimal.valueOf(999999L);
        NumberPrettifier numberPrettifier = NumberPrettifierFactory.createNumberPrettifier(number);
        assertThat(numberPrettifier).isInstanceOf(SimpleNumberPrettifier.class);
    }

    @Test
    public void testMinMillionPrettifier() {
        BigDecimal number = BigDecimal.valueOf(1000000L);
        NumberPrettifier numberPrettifier = NumberPrettifierFactory.createNumberPrettifier(number);
        assertThat(numberPrettifier).isInstanceOf(MillionNumberPrettifier.class);
    }

    @Test
    public void testMaxMillionPrettifier() {
        BigDecimal number = BigDecimal.valueOf(9999999L);
        NumberPrettifier numberPrettifier = NumberPrettifierFactory.createNumberPrettifier(number);
        assertThat(numberPrettifier).isInstanceOf(MillionNumberPrettifier.class);
    }

    @Test
    public void testMinBillionPrettifier() {
        BigDecimal number = BigDecimal.valueOf(1000000000L);
        NumberPrettifier numberPrettifier = NumberPrettifierFactory.createNumberPrettifier(number);
        assertThat(numberPrettifier).isInstanceOf(BillionNumberPrettifier.class);
    }

    @Test
    public void testMaxBillionPrettifier() {
        BigDecimal number = BigDecimal.valueOf(9999999999L);
        NumberPrettifier numberPrettifier = NumberPrettifierFactory.createNumberPrettifier(number);
        assertThat(numberPrettifier).isInstanceOf(BillionNumberPrettifier.class);
    }

    @Test
    public void testMinTrillionPrettifier() {
        BigDecimal number = BigDecimal.valueOf(1000000000000L);
        NumberPrettifier numberPrettifier = NumberPrettifierFactory.createNumberPrettifier(number);
        assertThat(numberPrettifier).isInstanceOf(TrillionNumberPrettifier.class);
    }

    @Test
    public void testMaxTrillionPrettifier() {
        BigDecimal number = BigDecimal.valueOf(9999999999999L);
        NumberPrettifier numberPrettifier = NumberPrettifierFactory.createNumberPrettifier(number);
        assertThat(numberPrettifier).isInstanceOf(TrillionNumberPrettifier.class);
    }
}
