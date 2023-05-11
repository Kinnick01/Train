package org.example.data;

public enum Discounts {
    ELDERLY (0.30),
    STUDENT (0.70),
    NODISCOUNT (1.00);

    private double discountAmount;

    public double getDiscountAmount() {
        return discountAmount;
    }

    Discounts(double discountAmount) {
        this.discountAmount = discountAmount;
    }
}
