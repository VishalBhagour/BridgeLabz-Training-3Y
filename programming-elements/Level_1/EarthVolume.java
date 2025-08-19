public class EarthVolume {
    public static void main(String[] args) {
        // Radius of Earth in kilometers
        double radiusKm = 6378;

        // Convert radius to miles
        double radiusMiles = radiusKm * 0.621371;

        // Calculate volume in cubic kilometers
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        // Calculate volume in cubic miles
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        // Format the numbers to be more readable
        String formattedKm3 = String.format("%.2e", volumeKm3);
        String formattedMiles3 = String.format("%.2e", volumeMiles3);

        // Print the results with formatted numbers
        System.out.println("The volume of Earth is:");
        System.out.println("In cubic kilometers: " + formattedKm3);
        System.out.println("In cubic miles: " + formattedMiles3);
    }
}
