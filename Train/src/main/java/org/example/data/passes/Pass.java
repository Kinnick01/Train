package org.example.data.passes;

import org.example.data.Cabin;
import org.example.data.Discounts;

public abstract class Pass {
        Cabin cabinet;
        Discounts discounts;

        public Pass(Cabin cabinet, Discounts discounts) {
            this.cabinet = cabinet;
            this.discounts = discounts;
        }
        public abstract double calculatePassPrice();
    }

