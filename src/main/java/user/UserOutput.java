package user;

public class UserOutput {


    // metodo
    public void displayFinalValue(double finalValue) {
        System.out.printf("O valor final com desconto é: R$%.2f%n", finalValue);
    }


    public void displayErrorMessage(String message) {
        System.out.println("Error: " + message);
    }
}
