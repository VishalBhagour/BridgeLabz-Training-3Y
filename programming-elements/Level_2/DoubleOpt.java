package Level_2;

import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for three double values
        System.out.print("Enter value for a (double): ");
        double a = scanner.nextDouble();

        System.out.print("Enter value for b (double): ");
        double b = scanner.nextDouble();

        System.out.print("Enter value for c (double): ");
        double c = scanner.nextDouble();

        // Calculate results using operator precedence
        double result1 = a + b * c;      // Multiplication before addition
        double result2 = a * b + c;      // Multiplication before addition
        double result3 = c + a / b;      // Division before addition
        double result4 = a % b + c;      // Modulus before addition

        // Display results
        System.out.println("\nThe results of Double Operations are:");
        System.out.printf("a + b * c = %.2f%n", result1);
        System.out.printf("a * b + c = %.2f%n", result2);
        System.out.printf("c + a / b = %.2f%n", result3);
        System.out.printf("a %% b + c = %.2f%n", result4);

        scanner.close();
    }
}
