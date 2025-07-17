package Recursion;

public class PrintReverseOrder {
    public static void main(String[] args) {
        int n=5;
        //print(5);
        print2(0);
    }
    public static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }

    public static void print2(int i){
        if(i==6){
            return;
        }
        print2(i+1);
        System.out.println(i);
    }
}
