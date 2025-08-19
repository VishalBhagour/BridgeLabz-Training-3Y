import java.util.Scanner;

public class HandShakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Get number of students from user
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        
        // Calculate maximum possible handshakes using combination formula
        int maxHandshakes = calculateHandshakes(numberOfStudents);
        
        // Display result
        System.out.println("The maximum number of possible handshakes is " + maxHandshakes);
        
        input.close();
    }
    
    /**
     * Calculates maximum possible handshakes between n students
     * Using formula: nC2 = n * (n-1) / 2
     */
    private static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}
