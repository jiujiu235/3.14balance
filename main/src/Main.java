import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the data: ");
        String expression = scanner.next();

        boolean isBalanced = Balance.checkBalancedParentheses(expression);
        if (isBalanced) {
            System.out.println("Balance");
        } else {
            System.out.println("Not Balance");
        }

        scanner.close();
    }
}