import calculator.calculation.DiscountCalculation;
import calculator.calculation.PercentageDiscount;
import org.junit.jupiter.api.Test;
import user.UserInput;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserInputTest {

    @Test
    public void testPercentageDiscount() {
        DiscountCalculation discountCalculation = new PercentageDiscount();
        double discount = discountCalculation.calculateDiscount(100.0, 10.0);
        assertEquals(10.0, discount, 0.001); // tolerancia
    }

    @Test
    public void testGetDiscountType() {

        // simula a entrada do usuário 1, seguido de uma nova linha
        String input = "1\n";
        // Configura um padrão para simular uma String
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // instancia userInput

        UserInput userInput = new UserInput();
        int discountType = userInput.getDiscountType();
        assertEquals(1, discountType);
    }


    @Test
    public void testGetPercentageDiscount() {
        String input = "10\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        UserInput userInput = new UserInput();
        double percentageDiscount = userInput.getPercentageDiscount();
        assertEquals(10.0, percentageDiscount, 0.001);

    }

    @Test
    public void testGetFixedDiscountValue() {
        String input= "20.0\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        UserInput userInput = new UserInput();
        double fixedDiscount = userInput.getFixedDiscountValue();
        assertEquals(20.0, fixedDiscount, 000.1);

    }
}
