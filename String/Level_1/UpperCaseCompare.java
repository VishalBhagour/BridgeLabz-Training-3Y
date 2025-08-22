package Level_1;

import java.util.Scanner;

public class UpperCaseCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String upperText = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char)(c - 32);
            }
            upperText += c;
        }

        boolean isEqual = upperText.equals(text.toUpperCase());

        System.out.println("Uppercase text: " + upperText);
        System.out.println("Are both results equal? " + isEqual);
    }
}

