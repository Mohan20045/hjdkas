package functions;

public class move0toLast {
    public static int[] moveToLast(int[] arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
        return arr;
    }
    public static void main(String args[]){
        int arr[]={1,0,2,0,3,0,0,4,5,0};
        arr=moveToLast(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
