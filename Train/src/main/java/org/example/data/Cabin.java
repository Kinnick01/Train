package org.example.data;

public enum Cabin {
    FIRST_CLASS (10.00),
    MID_CLASS(5.00),
    REGULAR_CLASS(3.00);

    private double price;

    Cabin(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
