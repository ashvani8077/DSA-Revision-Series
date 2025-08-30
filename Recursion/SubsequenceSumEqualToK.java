package Recursion;
import java.util.*;

public class SubsequenceSumEqualToK {
    public static void main(String[] args) {
        int arr[]={1,2,1};
        int k=2;
        System.out.println(answer(arr,0,new ArrayList<>(),0,0,k));
    }

    public static int answer(int arr[], int i, List<Integer>li, int sum,int count, int k){
        if(i==arr.length){
            if(sum==k){
                System.out.println(li);
                return 1;
            }
            return 0;
        }
        li.add(arr[i]);
        count+=answer(arr,i+1,li,sum+arr[i], 0,k);
        li.remove(li.size()-1);
        count+=answer(arr,i+1,li,sum,0,k);
        return count;
    }
}
