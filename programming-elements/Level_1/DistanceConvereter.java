import java.util.Scanner;

public class DistanceConvereter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Get distance in feet from user
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();
        
        // Convert to yards and miles using conversion factors
        double distanceInYards = convertFeetToYards(distanceInFeet);
        double distanceInMiles = convertYardsToMiles(distanceInYards);
        
        // Display results with formatted output
        System.out.printf("The distance in yards is %.2f and in miles is %.4f for the given %.2f feet%n", 
                         distanceInYards, distanceInMiles, distanceInFeet);
        
        input.close();
    }
    
    // Helper method to convert feet to yards
    private static double convertFeetToYards(double feet) {
        return feet / 3.0;
    }
    
    // Helper method to convert yards to miles  
    private static double convertYardsToMiles(double yards) {
        return yards / 1760.0;
    }
}
