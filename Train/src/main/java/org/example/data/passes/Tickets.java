package org.example.data.passes;

import org.example.data.Cabin;
import org.example.data.Discounts;
import org.example.data.passes.Pass;
import org.example.logic.DiscountProvider;

public class Tickets extends Pass implements DiscountProvider {
    protected double ticketPrice;

    public Tickets(Cabin cabinet, Discounts discounts) {
        super(cabinet, discounts);
    }


    @Override
    public double discountProvider() {
        return discounts.getDiscountAmount();
    }

    @Override
    public double calculatePassPrice() {
        var result = cabinet.getPrice()* discountProvider();
        return result;
    }
}
