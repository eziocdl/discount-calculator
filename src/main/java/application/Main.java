package application;

import calculator.calculation.DiscountCalculation;
import calculator.calculation.FixedDiscount;
import calculator.calculation.PercentageDiscount;
import user.UserInput;
import user.UserOutput;
import service.DiscountService;

public class Main {

    public static void main(String[] args) {
        // Criando as instâncias das classes de entrada, cálculo e saída de dados

        UserInput userInput = new UserInput();
        DiscountService discountService = new DiscountService();
        UserOutput userOutput = new UserOutput();

        // Obtém o valor original e o tipo de desconto
        double originalValue = userInput.getOriginalValue();
        int discountType = userInput.getDiscountType();
        double discountValue = 0;

        // inicializando a interface como null para ela não implementar o contrato
        DiscountCalculation discountCalculation = null;


        // Escolhendo o tipo de desconto e calculando o valor do desconto

        if (discountType == 1) {

            discountValue = userInput.getFixedDiscountValue();
            discountCalculation = new FixedDiscount();
            discountValue = discountCalculation.calculateDiscount(originalValue, discountValue);

        } else if (discountType == 2) {
            double percentageDiscount = userInput.getPercentageDiscount();
            discountCalculation = new PercentageDiscount();
            discountValue = discountCalculation.calculateDiscount(originalValue, percentageDiscount);


        } else {

            userOutput.displayErrorMessage("Tipo de desconto inválido.");
            userInput.closeInput();
            return;
        }

        // Calcula o valor final e exibe para o usuário

        double finalValue = discountService.calculateFinalValue(originalValue, discountValue);
        userOutput.displayFinalValue(finalValue);

    }


}
