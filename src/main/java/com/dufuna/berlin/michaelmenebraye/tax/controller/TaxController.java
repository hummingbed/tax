package com.dufuna.berlin.michaelmenebraye.tax.controller;
import com.dufuna.berlin.michaelmenebraye.tax.service.TaxCalculatorImp;

public class TaxController {
    public static void main(String[] args) {
        TaxCalculatorImp calculator = new TaxCalculatorImp();
        double taxOwed = calculator.getTaxOwed(50000);
        System.out.println("Tax owed: " + taxOwed);
    }
}
