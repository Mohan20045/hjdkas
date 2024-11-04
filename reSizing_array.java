package functions;

import java.util.Scanner;

public class reSizing_array {
    public static int[] resize(int arr[],int size){
        int temp[]=new int[size];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        return temp;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size that array should increase: ");
            int size=sc.nextInt();
            System.out.println("Size of the array is: "+arr.length);
            
            arr=resize(arr,size);
            System.out.println("Size of the array after re-sizing: "+arr.length);
        }
        
    }
}
