import java.util.*;

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your account number: ");
        String accNo = sc.nextLine();
        System.out.print("Enter the number of transactions: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int balance = 0, totalCredit = 0, totalDebit = 0;
        System.out.println("Enter " + n + " transactions (positive = credit, negative = debit): ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            balance += arr[i];
            if(arr[i] > 0){
                totalCredit += arr[i];
            } else {
                totalDebit += Math.abs(arr[i]);
            }
        }
        System.out.print("Do you want to check balance? (yes/no): ");
        sc.nextLine();
        String choice = sc.nextLine();
        if(choice.equals("yes")) {
            System.out.println("\n--- Account Summary ---");
            System.out.println("Name: " + name);
            System.out.println("Account Number: " + accNo);
            System.out.println("Total Credit: " + totalCredit);
            System.out.println("Total Debit: " + totalDebit);
            if(balance < 0){
                System.out.println("Status: Overdraft (" + balance + ")");
            } else {
                System.out.println("Remaining Balance: " + balance);
            }
        } else {
            System.out.println("Thank you! Have a nice day.");
        }
    }
}

