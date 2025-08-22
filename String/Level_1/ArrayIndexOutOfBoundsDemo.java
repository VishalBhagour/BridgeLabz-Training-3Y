package Level_1;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + i + ": ");
            names[i] = sc.next();
        }
        System.out.println(names[n]);
    }
}

