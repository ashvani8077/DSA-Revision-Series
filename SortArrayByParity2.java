public class SortArrayByParity2 {
    public static void main(String[] args) {
        int arr[]={4,2,5,7};
        int even=0;
        int odd=1;
        int ans[]=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                ans[even]=arr[i];
                even+=2;
            }
            else{
                ans[odd]=arr[i];
                odd+=2;
            }

        }
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
