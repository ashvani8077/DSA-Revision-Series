package Recursion;

public class PrintOrder {
    public static void main(String[] args) {
        print(1);
        System.out.println();
        print2(5);

    }
    public static void print(int n){
        if(n==5){
            return;
        }
        System.out.println(n);
        print(n+1);
    }

    public static void print2(int n){
        if(n==0){
            return;
        }
        print2(n-1);
        System.out.println(n);
    }
}
