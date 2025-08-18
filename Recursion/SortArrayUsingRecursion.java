package Recursion;

public class SortArrayUsingRecursion {
    public static void main(String[] args) {
        int arr[]={32,53,12,43,11,52,97,23,17};
        sort(arr,0);
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
    public static void sort(int arr[], int i){
        if(i>=arr.length){
            return;
        }
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        sort(arr,i+1);
    }
}
