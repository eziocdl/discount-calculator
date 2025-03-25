package service;

import calculator.calculation.DiscountCalculation;


public class DiscountService {


    public double calculateFinalValue(double originalValue, double discountValue) {
        return originalValue - discountValue;
    }

    public double applyDiscount(double originalValue, double discountValue, DiscountCalculation discountCalculation) {
        return discountCalculation.calculateDiscount(originalValue, discountValue);
    }

}
