package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CombinationSum2 {
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2};
        int t=4;
        Arrays.sort(arr);
        HashSet<List<Integer>>li=new HashSet<>();
        List<Integer>ans=new ArrayList<>();
        combination(arr,t,0,li,ans,0);
        List<List<Integer>>temp=new ArrayList<>(li);

    }

    public static void combination(int arr[], int t, int i, HashSet<List<Integer>>li, List<Integer>ans, int sum){
        if(i>=arr.length||sum>t){
            return;
        }
        if(sum==t){
            li.add(new ArrayList<>(ans));
        }
        ans.add(arr[i]);
        combination(arr,t,i+1,li,ans,sum+arr[i]);
        ans.remove(ans.size() - 1);
        combination(arr,t,i+1,li,ans,sum);
    }
}
