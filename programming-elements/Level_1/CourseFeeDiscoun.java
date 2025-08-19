public class CourseFeeDiscoun {
    public static void main(String[] args) {
        // Assign the original course fee
        double fee = 125000;

        // Assign the discount percentage  
        double discountPercent = 10;

        // Calculate the discount amount
        double discount = (fee * discountPercent) / 100;

        // Calculate the final discounted fee
        double finalFee = fee - discount;

        // Print the output
        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f%n", 
                         discount, finalFee);
    }
}
