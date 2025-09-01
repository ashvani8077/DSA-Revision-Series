package TwoPointerAndSlidingWindow;

public class ConstantWindow {
    public static void main(String[] args) {
        int arr[]={-1,2,3,4,5,-1};
        int k=4;
        int l=0;
        int r=k-1;
        int sum=0;
        for(int i=l;i<=r;i++){
            sum+=arr[i];
        }
        int max=sum;
        while(r<arr.length-1){
            sum=sum-arr[l];
            l++;
            r++;
            sum=sum+arr[r];
            max=Math.max(sum,max);
        }
        System.out.println(max);
    }
}
