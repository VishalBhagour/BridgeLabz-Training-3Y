package Level_2;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input number
        System.out.print("Enter a number: ");
        long number = sc.nextLong();  // use long for big numbers

        // Step 2: Count digits
        long temp = number;
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Step 3: Store digits in an array
        int[] digits = new int[count];
        temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = (int)(temp % 10);
            temp /= 10;
        }

        // Step 4: Frequency array
        int[] frequency = new int[10]; // index = digit, value = count
        for (int d : digits) {
            frequency[d]++;
        }

        // Step 5: Display frequencies
        System.out.println("\nDigit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }

        sc.close();
    }
}

