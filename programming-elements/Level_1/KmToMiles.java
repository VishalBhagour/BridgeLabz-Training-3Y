import java.util.*;
public class KmToMiles {
    public static void main(String[] args) {
        double km, miles;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble();

        miles = km * 0.621371;
        System.out.printf("Distance in miles: %.2f%n", miles);

        input.close();
    }
}
