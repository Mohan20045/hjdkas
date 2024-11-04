// Enter 3 numbers from the user & make a function to print their average.

package functions;
import java.util.*;

class example1{
    public static void average(int a,int b,int c){
        System.out.println("Average of three numbers:"+(a+b+c)/3.0);
    }
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of a:");
            int a=sc.nextInt();
            System.out.println("Enter the value of b:");
            int b=sc.nextInt();
            System.out.println("Enter the value of c:");
            int c=sc.nextInt();
            average(a,b,c);
        }
    }
}