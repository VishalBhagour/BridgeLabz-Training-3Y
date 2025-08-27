import java.util.*;
public class CricketScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter The No. of Batsman");
        int n = sc.nextInt();
        System.out.print("Enter the Each Batsman Scoore");
        int arr [] = new int [n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(arr[i], max);
            min = Math.min(arr[i],min);
            if(arr[i] >= 100){
                System.out.println("Century Score by "+ (i+1) + "Player");
            }
        }
        System.out.println(" Your Highest Score is : "+ max);
        System.out.println(" Your Lowest Score is : "+ min);
    }
}
