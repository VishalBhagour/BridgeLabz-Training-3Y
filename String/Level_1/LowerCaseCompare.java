package Level_1;

import java.util.Scanner;

public class LowerCaseCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String lowerByCharAt = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char)(c + 32);
            }
            lowerByCharAt += c;
        }

        String lowerByBuiltIn = text.toLowerCase();

        boolean isEqual = lowerByCharAt.equals(lowerByBuiltIn);

        System.out.println("Lowercase using charAt(): " + lowerByCharAt);
        System.out.println("Lowercase using toLowerCase(): " + lowerByBuiltIn);
        System.out.println("Are both results equal? " + isEqual);
    }
}

