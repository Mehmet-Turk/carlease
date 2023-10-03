package com.CarLease.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/leaserate")
public class LeaserateController {
    @PostMapping("/calculate")
    public ResponseEntity<Double> calculateLeaserate(
            @RequestParam double mileage,
            @RequestParam int duration,
            @RequestParam double interestRate,
            @RequestParam double nettPrice
    ) {
        // Calculate the leaserate here
        double leaserate = calculateLeaserateLogic(mileage, duration, interestRate, nettPrice);
        return ResponseEntity.ok(leaserate);
    }

    // Define the leaserate calculation logic as a separate method
    private double calculateLeaserateLogic(
            double mileage,
            int duration,
            double interestRate,
            double nettPrice
    ) {
        // Implement the leaserate calculation logic based on the provided formula
        double monthlyMileage = mileage / 12.0;
        double monthlyInterestRate = (interestRate / 100.0) / 12.0;

        double leaserate = (monthlyMileage * duration) / nettPrice +
                (monthlyInterestRate * nettPrice);

        return leaserate;
    }
}
