import java.util.Scanner;

public class FeeDiscountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Get fee amount from user
        System.out.print("Enter the student fee (INR): ");
        double fee = input.nextDouble();
        
        // Get discount percentage from user
        System.out.print("Enter the university discount percentage: ");
        double discountPercent = input.nextDouble();
        
        // Calculate discount and final fee
        double discount = calculateDiscount(fee, discountPercent);
        double finalFee = fee - discount;
        
        // Display results
        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f%n", 
                         discount, finalFee);
                         
        input.close();
    }
    
    private static double calculateDiscount(double fee, double discountPercent) {
        return (fee * discountPercent) / 100;
    }
}
