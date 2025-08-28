import java.util.*;
public class OnlineShopping{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean morecoustomer = true;
        while(morecoustomer){
            int total = 0;
            int n;
            System.out.println("------Welcome To Online Shopping------");
            System.out.println("1. Laptop = 3,000 /-");
            System.out.println("2. Mobile = 15,00 /-");
            System.out.println("3. Headphone = 900 /-");
            System.out.println("4. Watch = 700 /-");
            System.out.println("5. EarPodes = 20,000 /-");

            do{
                System.out.print("How Many Items Do you Want To Buy = ?");
                n = sc.nextInt();
            }
            while(n <= 0);

            for(int i=1;i<=n;i++){
                System.out.println("Enter the items do you want to buy "+ i);
                int choice = sc.nextInt();
                switch(choice){
                    case 1:
                        total += 3000;
                         break;
                    case 2:
                        total += 1500;
                         break;
                    case 3:
                        total += 900;
                         break;
                    case 4:
                        total += 700;
                         break;
                    case 5:
                        total += 26000;
                         break;
                    default : 
                        System.out.println("Invalid Product");
                        i--;
                        break;
                }
            }
            if(total > 5000){
                total = total - (total / 10);
                System.out.println("discount is applied");
            }
            System.out.println("total amount is "+ total);

            System.out.println("There is more coustomers (yes/no)");
            String ans = sc.next();;
            morecoustomer = ans.equals("yes");
            System.out.println("-----------------------------");
        }
        System.out.println("Thank you for shopping");
    }
}