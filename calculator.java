import java.util.Scanner;

public class calculator {
    void addition(int num1, int num2) {
        System.out.println("num1 + num2 = " + (num1 + num2));
    }

    void subtraction(int num1, int num2) {
        System.out.println("num1 - num2 = " + (num1 - num2));
    }

    void multiplication(int num1, int num2) {
        System.out.println("num1 * num2 = " + (num1 * num2));
    }

    void division(int num1, int num2) {
        if (num2 != 0) {
            System.out.println("num1 / num2 = " + (num1 / num2));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }

    public static void main(String[] args) {
        calculator calculator = new calculator();
        int num1 = 100;
        int num2 = 200;

        System.out.println("Choose the operation to be performed:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        Scanner scanner = new Scanner(System.in);
        int ch = scanner.nextInt();

        switch (ch) {
            case 1:
                calculator.addition(num1, num2);
                break;
            case 2:
                calculator.subtraction(num1, num2);
                break;
            case 3:
                calculator.multiplication(num1, num2);
                break;
            case 4:
                calculator.division(num1, num2);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}