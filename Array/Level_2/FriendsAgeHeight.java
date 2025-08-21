import java.util.Scanner;

public class FriendsAgeHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        // Taking input
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = sc.nextInt();
        }

        // Finding youngest
        int minAge = ages[0];
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngestIndex = i;
            }
        }

        // Finding tallest
        int maxHeight = heights[0];
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println("\nThe youngest friend is: " + names[youngestIndex] + " (Age: " + minAge + ")");
        System.out.println("The tallest friend is: " + names[tallestIndex] + " (Height: " + maxHeight + " cm)");
        
        sc.close();
    }
}
