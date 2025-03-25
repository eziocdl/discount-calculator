import calculator.calculation.DiscountCalculation;
import calculator.calculation.FixedDiscount;
import org.junit.jupiter.api.Test;
import service.DiscountService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscountServiceTest {


    @Test
    public void testCalculateFinalValue() {
        DiscountService discountService = new DiscountService();
        double finalValue = discountService.calculateFinalValue(100.0, 10.0);
        assertEquals(90.0, finalValue, 0.001);
    }

    @Test
    public void testApplyDiscount() {
        DiscountService discountService = new DiscountService();
        DiscountCalculation discountCalculation = new FixedDiscount();
        double discount = discountService.applyDiscount(100.0, 20.0, discountCalculation);
        assertEquals(20.0, discount, 0.001);
    }
}

