package org.example.data.passes;

import org.example.data.Cabin;
import org.example.data.Discounts;
import org.example.logic.DiscountProvider;

public class MonthlyPass extends Pass implements DiscountProvider {
    public MonthlyPass(Cabin cabinet, Discounts discounts) {
        super(cabinet, discounts);
    }

    @Override
    public double calculatePassPrice() {
        var result = cabinet.getPrice()*30 * discountProvider();
        return result;
    }

    @Override
    public double discountProvider() {
        return discounts.getDiscountAmount();
    }
}

