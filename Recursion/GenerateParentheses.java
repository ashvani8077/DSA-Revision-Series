package Recursion;

public class GenerateParentheses {
    public static void main(String[] args) {
        int n=3;
        parenthesis(n,0,0,"");
    }

    public static void parenthesis(int n, int open, int close,String ans){
        if(open==n&&close==n){
            System.out.print(ans+" ");
        }
        if(open<n){
            parenthesis(n,open+1, close, ans+"(");
        }
        if(close<open){
            parenthesis(n,open,close+1, ans+")");
        }
    }
}
