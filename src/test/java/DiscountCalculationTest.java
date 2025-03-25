import calculator.calculation.DiscountCalculation;
import calculator.calculation.FixedDiscount;
import calculator.calculation.PercentageDiscount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscountCalculationTest {

    @Test
    public void testPercentageDiscount() {
        DiscountCalculation discountCalculation = new PercentageDiscount();
        double discount = discountCalculation.calculateDiscount(100.0, 10.0);
    }

    @Test

    public void testFixedDiscount() {
        DiscountCalculation discountCalculation = new FixedDiscount();
        double discount = discountCalculation.calculateDiscount(100.0, 20.0);
        assertEquals(20.0, discount, 0.001);

    }


}
