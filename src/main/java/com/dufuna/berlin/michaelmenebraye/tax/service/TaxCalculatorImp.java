package com.dufuna.berlin.michaelmenebraye.tax.service;
import com.dufuna.berlin.michaelmenebraye.tax.model.TaxCalculator;
public class TaxCalculatorImp implements TaxCaculatorService{
    @Override
    public double getTaxOwed(int income) {
        TaxCalculator calculator = new TaxCalculator();

        if (income >= calculator.LOW_INCOME_BRACKET_ONE && income <= calculator.HIGH_INCOME_BRACKET_ONE) {
            return income * calculator.RATE_ONE;
        }
        else if (income >= calculator.LOW_INCOME_BRACKET_TWO && income <= calculator.HIGH_INCOME_BRACKET_TWO) {
            return (calculator.HIGH_INCOME_BRACKET_TWO - calculator.LOW_INCOME_BRACKET_TWO) * calculator.RATE_TWO;
        }
        else if (income >= calculator.LOW_INCOME_BRACKET_THREE && income <= calculator.HIGH_INCOME_BRACKET_THREE) {
            return (calculator.HIGH_INCOME_BRACKET_THREE - calculator.LOW_INCOME_BRACKET_THREE) * calculator.RATE_THREE + calculator.OUTPUT_TWO;
        }
        else if (income >= calculator.LOW_INCOME_BRACKET_FOUR && income <= calculator.HIGH_INCOME_BRACKET_FOUR) {
            return (calculator.HIGH_INCOME_BRACKET_FOUR - calculator.LOW_INCOME_BRACKET_FOUR) * calculator.RATE_FOUR + calculator.OUTPUT_THREE;
        }
        else if (income >= calculator.LOW_INCOME_BRACKET_FIVE) {
            return (calculator.OUTPUT_FOUR + calculator.OUTPUT_FOUR);
        }

        return 0.0; // Default return if no conditions are met
    }

}
