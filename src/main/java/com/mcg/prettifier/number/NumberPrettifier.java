package com.mcg.prettifier.number;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.mcg.prettifier.Prettifier;

public abstract class NumberPrettifier implements Prettifier {
    BigDecimal number;
    int decimalPoints = 1;
    RoundingMode roundingMode = RoundingMode.HALF_EVEN;
    boolean truncateInteger = true;

    public NumberPrettifier(BigDecimal number) {
        this.number = number;
    }

    public BigDecimal getNumber() {
        return number;
    }

    public void setNumber(BigDecimal number) {
        this.number = number;
    }

    public int getDecimalPoints() {
        return decimalPoints;
    }

    public void setDecimalPoints(int decimalPoints) {
        this.decimalPoints = decimalPoints;
    }

    public RoundingMode getRoundingMode() {
        return roundingMode;
    }

    public void setRoundingMode(RoundingMode roundingMode) {
        this.roundingMode = roundingMode;
    }

    public boolean isTruncateInteger() {
        return truncateInteger;
    }

    public void setTruncateInteger(boolean truncateInteger) {
        this.truncateInteger = truncateInteger;
    }

    protected BigDecimal formatNumber(int decimalPlacesToShift) {
        BigDecimal prettyDecimal = this.number.movePointLeft(decimalPlacesToShift);

        int integerHalf = prettyDecimal.intValue();
        BigDecimal decimalHalf = prettyDecimal.subtract(BigDecimal.valueOf(integerHalf));
        decimalHalf = decimalHalf.setScale(this.decimalPoints, this.roundingMode);

        if (this.truncateInteger && isIntegerValue(decimalHalf)) {
            return BigDecimal.valueOf(integerHalf);
        }

        return BigDecimal.valueOf(integerHalf).add(decimalHalf);
    }

    private boolean isIntegerValue(BigDecimal value) {
        int integerValue = value.stripTrailingZeros().scale();
        return integerValue <= 0;
    }
}
