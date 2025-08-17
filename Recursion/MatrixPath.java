package Recursion;

public class MatrixPath {
    public static void main(String[] args) {
        int m=4;
        int n=5;

        int count=path(0,0,m-1,n-1,"");
        System.out.println(count);
    }
    public static int path(int i,int j, int m, int n,String ans){
        if(i>m||j>n){
            return 0;
        }
        if(i==m&&j==n){
            System.out.println(ans);
            return 1;
        }
        int a=path(i+1,j,m,n,ans+'V');
        int b=path(i,j+1,m,n,ans+'H');
        return a+b;
    }
}
