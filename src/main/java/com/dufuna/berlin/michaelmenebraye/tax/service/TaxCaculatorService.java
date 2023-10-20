package com.dufuna.berlin.michaelmenebraye.tax.service;

public interface TaxCaculatorService {
    /**
     * Calculates tax owed from an income tax
     * @return double type
     */
    double getTaxOwed(int income);
}
