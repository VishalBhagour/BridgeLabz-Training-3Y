package Level_1;

import java.util.Scanner;

public class NumberFormatDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        int number = Integer.parseInt(text);
        System.out.println("Number is: " + number);
    }
}

