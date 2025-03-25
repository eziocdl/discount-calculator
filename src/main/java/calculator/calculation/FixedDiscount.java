package calculator.calculation;

public class FixedDiscount implements DiscountCalculation {
    @Override
    public double calculateDiscount(double originalValue, double fixedDiscount) {
        return fixedDiscount ;
    }
}
