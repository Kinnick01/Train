package org.example.logic;

import org.example.data.passes.Pass;

import java.util.ArrayList;
import java.util.List;

public class Cashier {


    private double income;

    private List<Pass> allSales = new ArrayList<>();
    private double sumOfAllIncome;

    public List<Pass> addToAllSales(Pass pass){
        allSales.add(pass);
        return allSales;
    }

    public double calculateIncome(){
        for (Pass pass: allSales) {
            income+= pass.calculatePassPrice();
        }
        return income;
    }
}
