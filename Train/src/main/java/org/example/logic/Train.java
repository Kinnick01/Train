package org.example.logic;

import org.example.data.Cabin;
import org.example.data.Discounts;
import org.example.data.passes.MonthlyPass;
import org.example.data.passes.Tickets;
import org.example.data.passes.YearlyPass;

public class Train {
    Tickets studentTicket = new Tickets(Cabin.FIRST_CLASS, Discounts.STUDENT);
    MonthlyPass monthlyPassStudent = new MonthlyPass(Cabin.MID_CLASS, Discounts.STUDENT);
    YearlyPass yearlyPassElderly = new YearlyPass(Cabin.FIRST_CLASS, Discounts.ELDERLY);
    Cashier cashier = new Cashier();

    public void TrainTickets(){
        cashier.addToAllSales(monthlyPassStudent);
        cashier.addToAllSales(yearlyPassElderly);
        cashier.addToAllSales(studentTicket);
        var result = cashier.calculateIncome();
        System.out.println(result);
    }
}