package com.mcg.prettifier.number;

import java.math.BigDecimal;

public class TrillionNumberPrettifier extends NumberPrettifier {
    private static final int DECIMAL_PLACES_TO_SHIFT = 12;
    private static final String NUMBER_SYMBOL = "T";

    public TrillionNumberPrettifier(BigDecimal number) {
        super(number);
    }

    @Override
    public String prettify() {
        return this.formatNumber(DECIMAL_PLACES_TO_SHIFT).toString() + NUMBER_SYMBOL;
    }
}
