package Recursion;

public class CombinationSum {
    public static void main(String[] args) {
        int arr[]={2,3,6,7};
        int t=7;
        print(arr,t,0,arr.length,0,"");
    }
    public static void print(int arr[], int t,int i, int n, int sum, String ans){
        if(i>=n||sum>t){
            return;
        }
        if(sum==t){
            System.out.println(ans);
            return;
        }
        print(arr,t,i,n,sum+arr[i],ans+String.valueOf(arr[i]));
        print(arr,t,i+1,n,sum,ans);
    }
}
