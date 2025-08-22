package Level_2;

import java.util.Scanner;

public class StringLengthDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] chars = text.toCharArray();
        int count = 0;
        for (char c : chars) {
            count++;
        }

        System.out.println("Length without using length(): " + count);
        System.out.println("Length using length(): " + text.length());
    }
}

