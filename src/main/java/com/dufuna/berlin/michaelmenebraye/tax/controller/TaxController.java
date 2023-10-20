package com.dufuna.berlin.michaelmenebraye.tax.controller;

import com.dufuna.berlin.michaelmenebraye.tax.DTO.TaxRequest;
import com.dufuna.berlin.michaelmenebraye.tax.service.TaxCalculatorImp;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class TaxController {

//    endPoint: http://localhost:8080/api/v1/calculateTax
//    method: Post:
//    sample body: {"income": 20000}

    @PostMapping("/calculateTax")
    @ResponseBody
    public Map<String, Double> calculateTax(@RequestBody TaxRequest request) {
        TaxCalculatorImp calculator = new TaxCalculatorImp();
        double taxOwed = calculator.getTaxOwed(request.getIncome());

        // Create a map to hold the response
        Map<String, Double> response = new HashMap<>();
        response.put("taxOwed", taxOwed);

        return response;
    }
}
