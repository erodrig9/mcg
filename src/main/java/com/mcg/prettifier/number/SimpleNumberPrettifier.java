package com.mcg.prettifier.number;

import java.math.BigDecimal;

public class SimpleNumberPrettifier extends NumberPrettifier {
    public SimpleNumberPrettifier(BigDecimal number) {
        super(number);
    }

    @Override
    public String prettify() {
        return number.toString();
    }
}
