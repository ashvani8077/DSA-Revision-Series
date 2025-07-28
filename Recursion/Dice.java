package Recursion;

public class Dice {
    public static void main(String[] args) {
        int n=4;
        answer(n,0,"");

    }

    public static void answer(int n, int curr,String ans){
        if(curr==n){
            System.out.print(ans+" ");
        }
        if(curr>n){
            return;
        }

//        answer(n,curr+1,ans+1);
//        answer(n, curr+2, ans+2);
//        answer(n, curr+3, ans+3);

        for(int dice=1;dice<=3;dice++){
            answer(n,curr+dice,ans+dice);
        }
    }
}
