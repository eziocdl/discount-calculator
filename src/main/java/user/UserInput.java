package user;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {

    private Scanner input;

    public UserInput() {
        this.input = new Scanner(System.in);
    }

    public double getOriginalValue() {
        while (true) {
            try {
                System.out.println("Digite o valor de entrada: ");
                return input.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor digite o percentual de desconto.");
                input.next(); // Limpa a entrada inválida
            }
        }
    }

    public int getDiscountType() {
        while (true) {
            try {
                System.out.println("Escolha a opção de desconto: ");
                System.out.println("1. Desconto fixo:  ");
                System.out.println("2. Desconto percentual:  ");
                return input.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor entre com o percentual de desconto");
                input.next(); // Limpa a entrada inválida
            }
        }
    }


    public double getPercentageDiscount() {
        while (true) {

            try {
                System.out.println("Digite o percentual de desconto: ");
                return input.nextDouble();

            }catch(InputMismatchException e) {

                System.out.println("Entrada inválida. Por favor digite um número.");


            }


        }
    }

    public double getFixedDiscountValue() {
        while (true) {

            try {

                System.out.println("Digite o valor do seu desconto fixo: ");
                return input.nextDouble();


            }catch(InputMismatchException e) {

                System.out.println("Entrada inválida. Por favor digite um número para dar o desconto fixo.");


            }
        }
    }



    public void closeInput() {
        input.close();
    }
}