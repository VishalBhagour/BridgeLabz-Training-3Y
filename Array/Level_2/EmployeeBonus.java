package Level_2;
import java.util.*;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalOld = 0, totalBonus = 0, totalNew = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary of Employee " + (i + 1) + ": ");
            double s = sc.nextDouble();

            System.out.print("Enter years of service of Employee " + (i + 1) + ": ");
            double y = sc.nextDouble();

            if (s <= 0 || y < 0) {
                System.out.println("Invalid input Please re-enter.");
                i--;
                continue;
            }

            salary[i] = s;
            years[i] = y;
        }

        for (int i = 0; i < 10; i++) {
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalOld += salary[i];
            totalBonus += bonus[i];
            totalNew += newSalary[i];
        }

        System.out.println("\n--- Employee Details ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) +
                               " | Old Salary: " + salary[i] +
                               " | Bonus: " + bonus[i] +
                               " | New Salary: " + newSalary[i]);
        }

        System.out.println("\n--- Company Totals ---");
        System.out.println("Total Old Salary = " + totalOld);
        System.out.println("Total Bonus Payout = " + totalBonus);
        System.out.println("Total New Salary = " + totalNew);

        sc.close();
    }
}

