package piggybankApp;

import java.math.BigDecimal;

public abstract class Money {

    protected int qty = 1;
    protected double baseValue;

    public Money(int qty) {
        this.qty = qty;
    }

    public Money() {

    }

    public int getQty() {
        return qty;
    }

    public double getTotalValue() {
        return baseValue * qty;
    }

    public double getBaseValue() {
        return baseValue;
    }

    public abstract String getName();
}