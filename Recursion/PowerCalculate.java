package Recursion;

public class PowerCalculate {
    public static void main(String[] args) {
        int n=3;
        int x=3;
        System.out.println(answer(x,n));
    }

    public static int answer(int x, int n){
        if(n==0)return 1;
        return x*answer(x,n-1);
    }
}


