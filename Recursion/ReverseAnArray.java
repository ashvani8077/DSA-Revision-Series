package Recursion;

public class ReverseAnArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        reverse(0,arr.length-1,arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void reverse(int i,int j, int arr[]){
        if(i>=j){
            return;
        }
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        reverse(i+1,j-1,arr);
    }
}
