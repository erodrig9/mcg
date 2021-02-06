package com.mcg.prettifier.number;

import java.math.BigDecimal;

public class NumberPrettifierFactory {
    private static final BigDecimal ONE_MILLION = BigDecimal.valueOf(1000000L);
    private static final BigDecimal ONE_BILLION = BigDecimal.valueOf(1000000000L);
    private static final BigDecimal ONE_TRILLION = BigDecimal.valueOf(1000000000000L);

    public static NumberPrettifier createNumberPrettifier(BigDecimal number) {
        if (number == null) {
            throw new IllegalArgumentException("Invalid number argument");
        }

        if (number.compareTo(ONE_MILLION) == -1) {
            return new SimpleNumberPrettifier(number);
        } else if (number.compareTo(ONE_BILLION) == -1) {
            return new MillionNumberPrettifier(number);
        } else if (number.compareTo(ONE_TRILLION) == -1) {
            return new BillionNumberPrettifier(number);
        } else {
            return new TrillionNumberPrettifier(number);
        }
    }
}
