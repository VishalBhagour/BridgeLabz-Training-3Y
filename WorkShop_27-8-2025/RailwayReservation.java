import java.util.*;

public class RailwayReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a Train:");
        System.out.println("1. Express Train (Fare: 500)");
        System.out.println("2. Superfast Train (Fare: 800)");
        System.out.println("3. Luxury Train (Fare: 1200)");
        int trainChoice = sc.nextInt();
        int fare = 0, capacity = 0;

        switch (trainChoice) {
            case 1:
                fare = 500;
                capacity = 3;
                System.out.println("You selected Express Train (Fare: " + fare + ")");
                break;
            case 2:
                fare = 800;
                capacity = 2;
                System.out.println("You selected Superfast Train (Fare: " + fare + ")");
                break;
            case 3:
                fare = 1200;
                capacity = 1;
                System.out.println("You selected Luxury Train (Fare: " + fare + ")");
                break;
            default:
                System.out.println("Invalid train choice.");
                return;
        }

        int booked = 0;
        int waitingList = 0;

        do {
            System.out.print("Enter number of passengers to book: ");
            int passengers = sc.nextInt();
            for (int i = 1; i <= passengers; i++) {
                if (booked < capacity) {
                    booked++;
                    System.out.println("Seat booked for Passenger " + i);
                } else {
                    waitingList++;
                    System.out.println("Passenger " + i + " is in Waiting List");
                }
            }
            System.out.println("Current Status: Booked Seats = " + booked + "/" + capacity + ", Waiting List = " + waitingList);
            if (booked < capacity) {
                System.out.print("Do you want to continue booking? (yes/no): ");
                String choice = sc.next();
                if (!choice.equalsIgnoreCase("yes")) {
                    break;
                }
            } else {
                System.out.println("Train is fully booked! No more seats available.");
                break;
            }
        } while (true);
        System.out.println("\nFinal Reservation Summary:");
        System.out.println("Total Seats: " + capacity);
        System.out.println("Booked Seats: " + booked);
        System.out.println("Waiting List: " + waitingList);
        System.out.println("Fare per Passenger: " + fare);
        System.out.println("Total Collection: " + (booked * fare));
    }
}
