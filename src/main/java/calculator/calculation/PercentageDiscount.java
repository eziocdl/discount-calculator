package calculator.calculation;

public class PercentageDiscount implements DiscountCalculation{
    @Override
    public double calculateDiscount(double originalValue, double percentageDiscount) {
        return originalValue * (percentageDiscount/100.0);
    }
}
