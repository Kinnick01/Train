package org.example.data.passes;

import org.example.data.Cabin;
import org.example.data.Discounts;
import org.example.logic.DiscountProvider;

public class DailyPass extends Pass implements DiscountProvider {

    public DailyPass(Cabin cabinet, Discounts discounts) {
        super(cabinet, discounts);
    }

    @Override
    public double calculatePassPrice() {
        var result = cabinet.getPrice()*3 * discountProvider(); ;
        return result;
    }

    @Override
    public double discountProvider() {
        return discounts.getDiscountAmount();
    }
}
