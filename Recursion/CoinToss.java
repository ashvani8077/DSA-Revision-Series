package Recursion;

public class CoinToss {
    public static void main(String[] args) {
        int n=3;
        answer(n,"");
    }
    public static void answer(int n, String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        answer(n-1,ans+"H");
        answer(n-1,ans+"T");
    }
}
