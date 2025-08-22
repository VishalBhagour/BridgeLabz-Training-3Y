package Level_1;

import java.util.Scanner;

public class StringCharCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] arr1 = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr1[i] = text.charAt(i);
        }

        char[] arr2 = text.toCharArray();

        boolean isEqual = true;
        if (arr1.length != arr2.length) {
            isEqual = false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    isEqual = false;
                    break;
                }
            }
        }

        System.out.print("User-defined char array: ");
        for (char c : arr1) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.print("Built-in toCharArray: ");
        for (char c : arr2) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Are both arrays equal? " + isEqual);
    }
}

