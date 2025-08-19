package TwoPointerAndSlidingWindow;

public class LongestSubarray {
    public static void main(String[] args) {
        int arr[]={2,5,1,7,10};
        int k=14;
        int l=0;
        int r=0;
        int sum=0;
        int maxLen=0;
        while(r<arr.length){
            sum+=arr[r];

           while(sum>k){
               sum-=arr[r];
               l=l+1;
           }

            if(sum<=k){
                maxLen=Math.max(maxLen,r-l+1);
            }
            r++;

        }
        System.out.println(maxLen);
    }
}
