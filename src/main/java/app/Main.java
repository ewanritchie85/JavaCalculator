package app;

import calculator.Calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for two numbers
        double[] numbers = new double[2];
        System.out.println("Enter 2 numbers:");
        for (int i = 0; i < 2; i++) {
            numbers[i] = scanner.nextDouble();
        }

        // Display menu for operations
        System.out.println("Choose an operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = scanner.nextInt();

        // Initialize expression and result
        String expression;
        double result;

        switch (choice) {
            case 1 -> {
                expression = numbers[0] + " + " + numbers[1] + " = ";
                result = Calculator.add(numbers);
            }
            case 2 -> {
                expression = numbers[0] + " - " + numbers[1] + " = ";
                result = Calculator.subtract(numbers);
            }
            case 3 -> {
                expression = numbers[0] + " * " + numbers[1] + " = ";
                result = Calculator.multiply(numbers);
            }
            case 4 -> {
                expression = numbers[0] + " / " + numbers[1] + " = ";
                result = Calculator.divide(numbers);
            }
            default -> {
                System.out.println("\nInvalid input. Please restart the program.");
                scanner.close();
                return;
            }
        }

        // Display result
        System.out.println("\n" + expression + result);

        // Close the scanner
        scanner.close();
    }
}