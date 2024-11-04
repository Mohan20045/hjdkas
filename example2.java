package functions;
// Write a function to print the sum of all odd numbers from 1 to n.

import java.util.*;
class example2 {
    public static void oddSum(int n){
        int sum=0;
        for(int i=1;i<=n;i=i+2){
            sum=sum+i;
        }
        System.out.println("sum of odd numbers from 1 to "+n+" is "+sum);
    }
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of n:");
            int n=sc.nextInt();
            oddSum(n);
        }
    }
}
