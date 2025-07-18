package Recursion;

public class FindIndexUsingRecursion {
    public static void main(String[] args) {
        int arr[]={3,2,5,7,5,6,5,15,5};
        int t=5;
        System.out.println(index(arr,t,0));
    }

    public static int index(int arr[], int t,int i){
        if(i>=arr.length){
            return -1;
        }
        if(arr[i]==t){
            return i;
        }
        return index(arr,t,i+1);
    }
}
