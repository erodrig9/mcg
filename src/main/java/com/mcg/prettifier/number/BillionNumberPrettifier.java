package com.mcg.prettifier.number;

import java.math.BigDecimal;

public class BillionNumberPrettifier extends NumberPrettifier {
    private static final int DECIMAL_PLACES_TO_SHIFT = 9;
    private static final String NUMBER_SYMBOL = "B";

    public BillionNumberPrettifier(BigDecimal number) {
        super(number);
    }

    @Override
    public String prettify() {
        return this.formatNumber(DECIMAL_PLACES_TO_SHIFT).toString() + NUMBER_SYMBOL;
    }
}
